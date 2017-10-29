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

import java.util.Map;


import net.sf.wtk.xml.dom.DOMConstants;

import org.w3c.dom.Attr;
import org.w3c.dom.Element;

public class NamespaceNormalization extends DescendingVoidVisitor<Element> {
	Map<String, String> prefixByNamespace;
	
	public NamespaceNormalization(Map<String, String> prefixByNamespace) {
		this.prefixByNamespace = prefixByNamespace;
	}

	@Override
	public Void visitElement(Element element, Element parent) {
		String namespace = element.getNamespaceURI();
		
		if (namespace != null)
			element.setPrefix(prefixByNamespace.get(namespace));
		
		descendAttrs(element, element);
		
		if (parent == null) {
			// Add a global mapping of namespaces to prefixes to the 
			// root element.
			for (String uri : prefixByNamespace.keySet()) {
				String prefix = prefixByNamespace.get(uri);
				element.setAttribute(
					DOMConstants.XMLNS_PREFIX + 
						((prefix.length() > 0) ? ':' + prefix : ""), 
					uri);
			}
		}
		
		return super.visitElement(element, element);
	}

	@Override
	public Void visitAttribute(Attr attr, Element parent) {
		if (DOMConstants.XMLNS_PREFIX.equals(attr.getLocalName()) ||
				DOMConstants.XMLNS_PREFIX.equals(attr.getPrefix())) {
			parent.removeAttributeNode(attr);
		} else {
			String namespace = attr.getNamespaceURI();
			if (namespace != null)
				attr.setPrefix(prefixByNamespace.get(namespace));
		}
		return super.visitAttribute(attr, parent);
	}
}
