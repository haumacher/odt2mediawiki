/*
 * net.sf.wtk.xml.dom utilities for W3C XML DOM processing
 * Copyright (C) 2005  Bernhard Haumacher <haui@haumacher.de>
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package net.sf.wtk.xml.dom.visitor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.w3c.dom.Node;

public class VisitSupport<R, A> {
	public static final String VISIT_METHOD_PREFIX = "visit";
	
	private Map<Class<?>, Method> visitMethods = new HashMap<Class<?>, Method>();

	@SuppressWarnings("unchecked")
	public VisitSupport(Class<? extends DOMVisitor> visitorClass) {
		Class<?> visitorInterface;
		
		if (! visitorClass.isInterface()) {
			// Find the (some if it is not unique) most specific visitor
			// interface of the given class.
			visitorInterface = null;
			Set<Class<?>> allInterfaces = getAllInterfaces(visitorClass);
			for (Class<?> iface : allInterfaces) {
				if (DOMVisitor.class.isAssignableFrom(iface)) {
					if ((visitorInterface == null) || visitorInterface.isAssignableFrom(iface)) {
						visitorInterface = iface;
					}
					
					// Note: The check that 'iface' must be a super interface of
					// the currently found visitor interface cannot be done
					// here, because there may be two paths in the interface
					// hierarchy that lead to the most specific visitor
					// interface. Therefore, the uniqueness check must be
					// deferred until "one candidate" for the most specific visitor
					// interface is found. See below.
				}
			}
			
			// Make sure that the most specific visitor interface is unique.
			for (Class<?> iface : allInterfaces) {
				if (DOMVisitor.class.isAssignableFrom(iface)) {
					assert iface.isAssignableFrom(visitorInterface) : 
						"Most specific visitor interface must be unique.";
				}
			}
		} else {
			visitorInterface = visitorClass;
		}

		if (visitorInterface == null) {
			throw new IllegalArgumentException(
				"The given class does not implement a visitor interface.");
		}
		
		assert visitorInterface.isInterface() : 
			"It is save to assume that the looked up class is an interface.";
		
		for (Method method : visitorInterface.getMethods()) {
			String name = method.getName();
			if (!name.startsWith(VISIT_METHOD_PREFIX))
				throw new IllegalArgumentException(
						"methods of a visitorClass must have '" + VISIT_METHOD_PREFIX
								+ "' prefix: " + name);

			Class<?>[] paramClasses = method.getParameterTypes();
			if (paramClasses.length != 2)
				throw new IllegalArgumentException(
						"visit methods must have R visitType(Node node, A arg) signature: "
								+ name);

			Class<?> nodeClass = paramClasses[0];
			if (!Node.class.isAssignableFrom(nodeClass))
				throw new IllegalArgumentException(
						"visited node must be assignable to Node: " + name);

			visitMethods.put(nodeClass, method);
		}
	}

	@SuppressWarnings("unchecked")
	public R visit(Node node, DOMVisitor<R, A> visitor, A arg) {
		Method method = getVisitMethod(node.getClass());
	
		try {
			return (R) method.invoke(visitor, new Object[] { node, arg });
		} catch (IllegalArgumentException e) {
			throw new AssertionError(e);
		} catch (IllegalAccessException e) {
			throw new AssertionError(e);
		} catch (InvocationTargetException e) {
			Throwable cause = e.getCause();
			if (cause instanceof RuntimeException) {
				throw (RuntimeException) cause;
			} else if (cause instanceof Error) {
				throw (Error) cause;
			}
			throw new AssertionError(e);
		}
	}

	protected Method getVisitMethod(Class<?> nodeClass) {
		Method method = visitMethods.get(nodeClass);
		if (method != null) return method;

		// Find implemented node interface
		Set<Class<?>> allIfaces = new HashSet<Class<?>>();
		Queue<Class<?>> working = new LinkedList<Class<?>>();
		for (Class<?> iface : getAllInterfaces(nodeClass)) {
			if (! Node.class.isAssignableFrom(iface)) continue;
			
			if (allIfaces.add(iface)) working.add(iface);
		}

		Class<?> minIface = null;
		while (! working.isEmpty()) {
			Class<?> iface = working.poll();
			
			if (visitMethods.keySet().contains(iface)) {
				if (minIface == null)
					minIface = iface;
				else if (minIface.isAssignableFrom(iface))
					minIface = iface;
				else if (! iface.isAssignableFrom(minIface))
					throw new AssertionError("node interface ambiguity: "
							+ iface.getName() + ", " + minIface.getName());
			} else {
				// Consider all super interfaces.
				for (Class<?> superIface : iface.getInterfaces()) {
					if (allIfaces.add(superIface)) working.add(superIface);
				}
			}
		}
		
		if (minIface != null) {
			method = visitMethods.get(minIface);
			visitMethods.put(nodeClass, method);
			return method;
		}

		throw new AssertionError("no visit method found: " + nodeClass);
	}

	/**
	 * For a class <code>clazz</code>, return all interfaces that this class
	 * and all its super classes implement. If the class itself is an interface,
	 * only return all interfaces this interface directly extends.
	 */
	private Set<Class<?>> getAllInterfaces(Class<?> clazz) {
		Set<Class<?>> allIfaces = new HashSet<Class<?>>();
		
		while (clazz != null) {
			for (Class<?> iface : clazz.getInterfaces()) {
				allIfaces.add(iface);
			}
			clazz = clazz.getSuperclass();
		}
		
		Queue<Class<?>> working = new LinkedList<Class<?>>();
		working.addAll(allIfaces);
		while (! working.isEmpty()) {
			Class<?> iface = working.poll();
			for (Class<?> superIface : iface.getInterfaces()) {
				if (allIfaces.add(superIface)) {
					working.add(superIface);
				}
			}
		}
	
		return allIfaces;
	}
}
