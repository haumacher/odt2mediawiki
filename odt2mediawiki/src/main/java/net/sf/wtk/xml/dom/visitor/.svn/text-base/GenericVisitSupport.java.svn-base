package net.sf.wtk.xml.dom.visitor;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Element;

public class GenericVisitSupport<R, A> {
	public static final Class<?>[] VISIT_METHOD_SIGNATURE = new Class[] {Element.class, Object.class};
	public static final String VISIT_GENERIC_METHOD_PREFIX = "visitGeneric";
	public static final String ELEMENT_VISIT_METHOD_SUFFIX = "Element";
	public static final String ELEMENT_SUFFIX = "_ELEMENT";
	public static final String NAMESPACE_SUFFIX = "_NS";
	private static final Method GENERIC_VISIT_METHOD;
	private static final String NO_NAMESPACE = null;
	
	static {
		try {
			GENERIC_VISIT_METHOD = 
				GenericDOMVisitor.class.getMethod(
					VISIT_GENERIC_METHOD_PREFIX + ELEMENT_VISIT_METHOD_SUFFIX, 
					VISIT_METHOD_SIGNATURE);
		} catch (Exception ex) {
			throw new AssertionError(ex);
		}
	}

	HashMap<String, Method> genericMethodByNamespace =	new HashMap<String, Method>();

	HashMap<String, HashMap<String, Method>> methodByLocalnameAndNamespace = 
		new HashMap<String, HashMap<String,Method>>();
	
	public GenericVisitSupport(Class<?>[] schemaConstants, String defaultNamespace, Class<? extends GenericDOMVisitor> visitorClass, Class<?> argClass) 
		throws SecurityException, IllegalAccessException 
	{
		// Inspect the schema interfaces and extract element names and namespace
		// mappings.
		ArrayList<Field> elements = new ArrayList<Field>();
		HashMap<String,Field> namespaces = new HashMap<String,Field>();
		for (Class<?> schemaConstantInterface : schemaConstants) {
			Field[] constants = schemaConstantInterface.getFields();
			for (Field constant : constants) {
				int modifiers = constant.getModifiers();
				if (! Modifier.isPublic(modifiers)) continue;
				if (! Modifier.isStatic(modifiers)) continue;
				if (! Modifier.isFinal(modifiers)) continue;
				if (String.class != constant.getType()) continue;
			
				String name = constant.getName();
				if (name.endsWith(ELEMENT_SUFFIX)) {
					elements.add(constant);
				} else if (name.endsWith(NAMESPACE_SUFFIX)) {
					String prefix = 
						name.substring(0, name.length() - NAMESPACE_SUFFIX.length());
				
					if (prefix.indexOf('_') >= 0) {
						throw new IllegalArgumentException(
							"Namespace constants may not contain '_' characters other " + 
							"than the suffix '_NS': '" + name + "'");
					}
				
					namespaces.put(prefix, constant);
				}
			}
		}
		
		// The expected signature of a visit method.
		final Class<?>[] visitMethodSignature = new Class[] {Element.class, argClass};

		// Search for generic visit methods in the visitor class and assign them to
		// their matching namespace pattern.
		for (String prefix : namespaces.keySet()) {
			Field namespace = namespaces.get(prefix);
			String namespaceURI = (String) namespace.get(null);
			
			String visitMethodName = 
				VISIT_GENERIC_METHOD_PREFIX + 
				prefix.toUpperCase() + 
				ELEMENT_VISIT_METHOD_SUFFIX;
			
			Method visitMethod;
			try {
				visitMethod = visitorClass.getMethod(visitMethodName, visitMethodSignature);
			} catch (NoSuchMethodException ex) {
				visitMethod = GENERIC_VISIT_METHOD;
			}
			
			genericMethodByNamespace.put(namespaceURI, visitMethod);
		}

		// Enter the generic visit method for the default namespace with the
		// pattern for no namespace.
		if (defaultNamespace != null) {
			Method defaultVisitMethod = genericMethodByNamespace.get(defaultNamespace);
			if (defaultVisitMethod != null) {
				genericMethodByNamespace.put(NO_NAMESPACE, defaultVisitMethod);
			}
		}
		
		// Search a specific visit method for each element defined in any of the
		// given schema interfaces.
		for (Field element : elements) {
			String name = element.getName();
			String qname = name.substring(0, name.length() - ELEMENT_SUFFIX.length());
			
			int nsSeparatorIndex = qname.lastIndexOf('_');
			if (nsSeparatorIndex < 0) {
				throw new IllegalArgumentException(
					"There is no namespace prefix suffix in element '" + name + "'");
			}
			
			String prefix = qname.substring(nsSeparatorIndex + 1);
			String localName = qname.substring(0, nsSeparatorIndex);
				
			Field namespace = namespaces.get(prefix);
			if (namespace == null) {
				throw new IllegalArgumentException(
					"There is no namespace definition for element '" + name + "'");
			}

			String visitMethodName = 
				VisitSupport.VISIT_METHOD_PREFIX + 
				prefix.toUpperCase() + 
				cvtUPPER_CASEtoCamelCase(localName) + 
				ELEMENT_VISIT_METHOD_SUFFIX;
			
			Method visitMethod;
			try {
				visitMethod = visitorClass.getMethod(visitMethodName, visitMethodSignature);
			} catch (NoSuchMethodException ex) {
				// Register the visit method defined for the element's
				// namespace. If no namespace specifice visitor method is
				// defined, the generic visit method would have been associated
				// with the elements namespace above.
				visitMethod = genericMethodByNamespace.get(namespace.get(null));
			}
			enterVisitMethod(namespace, element, visitMethod);
		}
	}

	private void enterVisitMethod(Field namespace, Field element, Method visitMethod) throws IllegalAccessException {
		String elementName = (String) element.get(null);
		HashMap<String, Method> methodByNamespace = methodByLocalnameAndNamespace.get(elementName);
		
		if (methodByNamespace == null) {
			methodByNamespace = new HashMap<String, Method>();
			methodByLocalnameAndNamespace.put(elementName, methodByNamespace);
		}
		
		methodByNamespace.put((String) namespace.get(null), visitMethod);
	}
	
	@SuppressWarnings("unchecked")
	public R visitElement(Element element, DOMVisitor<R, A> visitor, A arg) {
		Method method = getVisitMethod(element.getNamespaceURI(), element.getLocalName());
	
		try {
			return (R) method.invoke(visitor, new Object[] { element, arg });
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

	private Method getVisitMethod(String namespaceURI, String localName) {
		HashMap<String, Method> methodByNamespace = methodByLocalnameAndNamespace.get(localName);
		if (methodByNamespace != null) {
			Method result = methodByNamespace.get(namespaceURI);
			if (result != null) return result;
		}

		Method result = this.genericMethodByNamespace.get(namespaceURI);
		if (result != null) return result;

		return GENERIC_VISIT_METHOD;
	}

	private static String cvtUPPER_CASEtoCamelCase(String localName) {
		StringBuffer result = new StringBuffer();
		int searchStartIndex = 0;
		while (true) {
			int separatorIndex = localName.indexOf('_', searchStartIndex);
			int partStopIndex = (separatorIndex < 0) ? localName.length() : separatorIndex;
			
			if (partStopIndex - searchStartIndex > 0) {
				// Non-empty name part.
				result.append(Character.toUpperCase(localName.charAt(searchStartIndex)));
				result.append(localName.substring(searchStartIndex + 1, partStopIndex).toLowerCase());
			} else {
				throw new AssertionError("No duplicate '_' characters expected.");
			}

			if (separatorIndex < 0) {
				// Last part reached.
				break;
			}
			
			searchStartIndex = partStopIndex + 1;
		}
		
		return result.toString();
	}

	public static <R, A> GenericVisitSupport<R, A> getInstance(Class<?>[] schemaConstants, String defaultNamespace, Class<? extends GenericDOMVisitor> visitorClass, Class<?> argClass) {
		try {
			return new GenericVisitSupport<R, A>(schemaConstants, defaultNamespace, visitorClass, argClass);
		} catch (SecurityException e) {
			throw new AssertionError(e);
		} catch (IllegalAccessException e) {
			throw new AssertionError(e);
		}
	}
}
