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
/**
 * Creates a mapping (namespace -> prefix) for all used namespaces in a 
 * document.
 */
package net.sf.wtk.xml.dom.visitor;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import net.sf.wtk.xml.dom.DOMConstants;

import org.w3c.dom.Attr;
import org.w3c.dom.Element;

/**
 * Compute a global mapping of namespaces to unique prefixes for a given document.
 * In the resulting mapping, for each namespace defined in the document, a unique 
 * prefix is computed. This prefix is in order of preference:
 * 
 * <ol>
 * <li>The prefix declared in the preferred mapping passed to the constructor of 
 *     the visitor</li>
 * <li>The prefix found first in document order that is not yet associated to 
 *     another namespace</li>
 * <li>A generated prefix of the form "ns" + number.
 * </ol>
 */
public class NamespaceSearch extends DescendingVoidVisitor<Void> {
	private static final String NS_PREFIX_DEFINITION_ATTRIBUTE = 
		DOMConstants.XMLNS_PREFIX + ':';
	
	private Set<String> declaredNamespaces = new HashSet<String>();
	private HashMap<String, String> prefixByNamespace = new HashMap<String, String>();
	private Map<String, String> preferredPrefixByNamespace;

	public NamespaceSearch() {
		this(new HashMap<String, String>());
	}

	public NamespaceSearch(Map<String, String> preferredPrefixByNamespace) {
		this.preferredPrefixByNamespace = preferredPrefixByNamespace;
	}

	public Map<String, String> getPrefixByNamespace() {
		int nsNr = 1;
		for (String namespace : declaredNamespaces) {
			if (prefixByNamespace.containsKey(namespace))
				continue;
			
			while (true) {
				String prefix = "ns" + (nsNr++);
				if (! prefixByNamespace.containsValue(prefix)) {
					prefixByNamespace.put(namespace, prefix);
					break;
				}
			}
		}
		declaredNamespaces.clear();
		
		return prefixByNamespace;
	}

	@Override
	public Void visitElement(Element element, Void arg) {
		String namespace = element.getNamespaceURI();
		if (namespace != null) {
			addNamespaceDeclaration(element.getPrefix(), namespace);
		}
		descendAttrs(element, arg);
		return super.visitElement(element, arg);
	}

	@Override
	public Void visitAttribute(Attr attr, Void arg) {
		String name = attr.getName();
		if (name.startsWith(NS_PREFIX_DEFINITION_ATTRIBUTE)) {
			// The current attribute is a namespace definition with prefix.
			String namespace = attr.getValue();
			String prefix = name.substring(NS_PREFIX_DEFINITION_ATTRIBUTE.length());
			addNamespaceDeclaration(prefix, namespace);
		}
		
		else if (DOMConstants.XMLNS_PREFIX.equals(name)) {
			// This is a definition of a default namespace without 
			// prefix. This does not contribute to the prefixByNamespace 
			// mapping, but the namespace is included into the set of
			// declared namespaces.
			String namespace = attr.getValue();
			declaredNamespaces.add(namespace);
		}
		
		else {
			String namespace = attr.getNamespaceURI();
			if (namespace != null) {
				addNamespaceDeclaration(attr.getPrefix(), namespace);
			}
		}

		return super.visitAttribute(attr, arg);
	}

	/**
	 * @param name
	 * @param namespace
	 * @param prefix TODO
	 */
	private void addNamespaceDeclaration(String prefix, String namespace) {
		if (! prefixByNamespace.containsKey(namespace)) {
			// Override the prefix declared in the document with the preferred prefix
			// for that namespace, if one is defined and the defined preferred prefix
			// is not yet assigned to another namespace.
			if (preferredPrefixByNamespace.containsKey(namespace)) {
				String preferredPrefix = preferredPrefixByNamespace.get(namespace);
				if (! prefixByNamespace.containsValue(preferredPrefix)) {
					prefix = preferredPrefix;
				}
			}

			declaredNamespaces.add(namespace);

			if ((prefix != null) && (! prefixByNamespace.containsValue(prefix))) {
				prefixByNamespace.put(namespace, prefix);
			}
		}
	}
}
