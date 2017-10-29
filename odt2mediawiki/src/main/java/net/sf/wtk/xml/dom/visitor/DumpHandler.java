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


import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

import javax.xml.XMLConstants;

import net.sf.wtk.xml.dom.DOMConstants;
import net.sf.wtk.xml.dom.DOMUtilities;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class DumpHandler extends DefaultHandler {
	Writer writer;
	int elementDepth = 0;
	
	boolean startTagOpened;
	boolean detectEmptyElements = true;
	private int namespaceID = 1;
	
	private Stack<Map<String, String>> scopes = new Stack<Map<String,String>>();
	private Map<String, String> newNamespaceURIs = new HashMap<String, String>();

	public DumpHandler(Writer writer) {
		this.writer = writer;
	}

	/**
	 * Register the given namespace URI as the default namespace of the
	 * document.
	 * 
	 * @param namespaceURI The namespace URI assigned as default namespace to
	 *     the document element.
	 */
	public void setDefaultNamespace(String namespaceURI) {
		addNamespace(DOMConstants.DEFAULT_NAMESPACE_PREFIX, namespaceURI);
	}

	/**
	 * Register a namespace prefix to prevent prefixes for certain
	 * namespaces from being syntesized.
	 */
	public void addNamespace(String prefix, String namespaceURI) {
		newNamespaceURIs.put(namespaceURI, prefix);
	}
	
	public void setDetectEmptyElements(boolean detectEmptyElements) {
		this.detectEmptyElements = detectEmptyElements;
	}

	public void startDocument() throws SAXException {
		try {
			writer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			scopes.push(Collections.singletonMap(XMLConstants.XML_NS_URI, XMLConstants.XML_NS_PREFIX));
		} catch (IOException e) {
			throw new SAXException(e);
		}
	}

	public void endDocument() throws SAXException {
		scopes.pop();
	}

	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		try {
			finishLazyStartTag();
			
			writer.append('<');

			if (localName == null) {
				// Assume XHTML for non-namespace aware element nodes.
				//
				// TODO: Use constant defined in XHTMLConstants after making the
				// corresponding module accessible.
				localName = qName;
				uri = "http://www.w3.org/1999/xhtml";
			}
			
			String prefix = getPrefix(uri);
			if ((prefix != null) && (prefix.length() > 0)) {
				writer.append(prefix);
				writer.append(':');
			}
			writer.append(localName);
			
			for (int cnt = atts.getLength(), n = 0; n < cnt; n++) {
				if (! DOMUtilities.isNamespaceDeclaration(atts.getQName(n))) {
					writer.append(' ');

					String attributeLocalName = atts.getLocalName(n);
					if (attributeLocalName == null) {
						// For non-namespace aware attribute nodes, assume a
						// private (non-namespace) attribute.
						attributeLocalName = atts.getQName(n);
					} else {
						String attributePrefix = getPrefix(atts.getURI(n));
						if ((attributePrefix != null) && (attributePrefix.length() > 0)) {
							writer.append(attributePrefix);
							writer.append(':');
						}
					}
					writer.append(attributeLocalName);
					writer.append('=');
					writer.append('"');
					writer.append(DumpUtilities.quoteAttrValue(atts.getValue(n)));
					writer.append('"');
				}
			}

			// Declare all new namespace binding.
			if (newNamespaceURIs.isEmpty()) {
				scopes.push(scopes.peek());
			} else {
				Map<String, String> newScope = new HashMap<String, String>(scopes.peek());
				
				for (Iterator<Map.Entry<String, String>> it = newNamespaceURIs.entrySet().iterator(); it.hasNext(); ) {
					Map.Entry<String, String> nsEntry = it.next();
					
					String newNamespaceURI = nsEntry.getKey();
					assert ! newNamespaceURI.equals(DOMConstants.XML_NS) : 
						"The XML namespace must not be explicitly declared.";

					String nsPrefix = nsEntry.getValue();
					assert nsPrefix != null : 
						"A namespace in the new namespace map has a prefix assigned.";

					newScope.put(newNamespaceURI, nsPrefix);

					writer.append(' ');
					writer.append(DOMConstants.XMLNS_PREFIX);
					if (nsPrefix.length() > 0) {
						writer.append(':');
						writer.append(nsPrefix);
					}
					writer.append('=');
					writer.append('"');
					writer.append(DumpUtilities.quoteAttrValue(newNamespaceURI));
					writer.append('"');
				}

				scopes.push(newScope);
				newNamespaceURIs.clear();
			}
			
			startTagOpened = true;
			if (! detectEmptyElements) {
				// Immediately close the start tag. If this element contains no
				// contents, it is written as start tag with an immediately
				// following end tag.
				finishLazyStartTag();
			}
			
			elementDepth++;
		} catch (IOException e) {
			throw new SAXException(e);
		}
	}

	public void endElement(String uri, String localName, String qName) throws SAXException {
		try {
			elementDepth--;
			
			if (startTagOpened) {
				// Write element as empty element.
				writer.append("/>");
				startTagOpened = false;
			} else {
				writer.append("</");
				
				if (localName == null) {
					// Assume XHTML for non-namespace aware element nodes.
					//
					// TODO: Use constant defined in XHTMLConstants after making the
					// corresponding module accessible.
					localName = qName;
					uri = "http://www.w3.org/1999/xhtml";
				}

				String prefix = getPrefix(uri);
				if ((prefix != null) && (prefix.length() > 0)) {
					writer.append(prefix);
					writer.append(':');
				}
				writer.append(localName);
				writer.append('>');
			}
			
			scopes.pop();
		} catch (IOException e) {
			throw new SAXException(e);
		}
	}

	private String getPrefix(String namespaceURI) throws IOException {
		if (namespaceURI == null) return null;
		
		String prefix;

		prefix = scopes.peek().get(namespaceURI);
		if (prefix != null) return prefix;
		
		prefix = newNamespaceURIs.get(namespaceURI);
		if (prefix != null) return prefix;
		
		prefix = "ns" + (namespaceID ++);
		newNamespaceURIs.put(namespaceURI, prefix);
		return prefix;
	}

	public void characters(char[] ch, int start, int length) throws SAXException {
		try {
			finishLazyStartTag();
			writer.append(DumpUtilities.quoteText(new String(ch, start, length)));
		} catch (IOException e) {
			throw new SAXException(e);
		}
	}
	
	@Override
	public void startPrefixMapping(String prefix, String uri) throws SAXException {
		newNamespaceURIs.put(uri, prefix);
	}
	
	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		// Namespace scopes are flushed automatically, if the defining element
		// goes out of scope.
		//
		// newNamespaceURIs.values().remove(prefix);
	}

	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
		// Ignored.
	}

	public void processingInstruction(String target, String data) throws SAXException {
		try {
			finishLazyStartTag();

			writer.append("<?");
			writer.append(target);
			writer.append(' ');
			writer.append(data);
			writer.append("?>");
		} catch (IOException e) {
			throw new SAXException(e);
		}
	}

	public void skippedEntity(String name) throws SAXException {
		// Ignored.
	}

	
	private void finishLazyStartTag() throws IOException {
		if (startTagOpened) {
			writer.append('>');
			startTagOpened = false;
		}
	}

}
