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
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import net.sf.wtk.xml.dom.DOMConstants;
import net.sf.wtk.xml.dom.DOMUtilities;

import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;


/**
 * Visitor class that serializes a DOM tree to a writer. This class is mainly
 * for testing the visitor framework and does no necessary escaping at the
 * moment.
 */
public class DumpVisitor extends DescendingDOMVisitor<Void, Void> {
	Map<String, String> prefixByNamespace = new HashMap<String, String>();
	{
		prefixByNamespace.put(DOMConstants.XML_NS, DOMConstants.XML_PREFIX);
	}
	
	Writer writer;

	IOException problem;
	private String publicId;
	private String systemId;
	private String root;
	
	public DumpVisitor(Writer writer) {
		super(ResultCombinator.VOID_COMBINATOR);

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
	
	public void setDocType(String root, String publicId, String systemId) {
		this.root = root;
		this.publicId = publicId;
		this.systemId = systemId;
	}

	/**
	 * Register a namespace prefix to prevent prefixes for certain
	 * namespaces from being syntesized.
	 */
	public void addNamespace(String prefix, String namespaceURI) {
		prefixByNamespace.put(namespaceURI, prefix);
	}

	@Override
	public Void visit(Document document, Void arg) {
		NamespaceSearch search = new NamespaceSearch(prefixByNamespace);
		search.visit(document, null);
		this.prefixByNamespace = search.getPrefixByNamespace();
		
		Void result;
		try {
			writer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

			if (publicId != null) {
				writer.append("<!DOCTYPE " + root + " PUBLIC \"" + publicId + "\" \"" + systemId + "\">");
			}

			result = super.visit(document, arg);
			
			writer.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		return result;
	}

	@Override
	public Void visitElement(Element element, Void arg) {
		try {
			String tagname = getTagName(element);

			writer.append('<');
			writer.append(tagname);
			
			if (element.getOwnerDocument().getDocumentElement() == element) {
				for (String ns : prefixByNamespace.keySet()) {
					if (ns.equals(DOMConstants.XML_NS)) {
						// The XML namespace must not be explicitly declared.
						continue;
					}
					String definedPrefix = prefixByNamespace.get(ns);
					
					writer.append(' ');
					writer.append(DOMConstants.XMLNS_PREFIX);
					if (! definedPrefix.equals(DOMConstants.DEFAULT_NAMESPACE_PREFIX)) {
						writer.append(':');
						writer.append(definedPrefix);
					}
					writer.append('=');
					writer.append('"');
					writer.append(DumpUtilities.quoteAttrValue(ns));
					writer.append('"');
				}
			}
			
			descendAttrs(element, arg);
			
			if (element.getFirstChild() == null) {
				writer.append("/>");
			} else {
				writer.append('>');
				descendChilds(element, arg);
				writer.append("</");
				writer.append(tagname);
				writer.append('>');
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	public void visitElementContents(Element element) {
		descendChilds(element, null);
	}
	
	private String getTagName(Element element) throws IOException {
		String prefix;
		String localName;
		{
			String namespace = element.getNamespaceURI();
			if (namespace != null) {
				prefix = prefixByNamespace.get(namespace);
				localName = element.getLocalName();
			} else {
				prefix = null;
				localName = element.getTagName();
			}
		}

		if ((prefix != null) && (! prefix.equals(DOMConstants.DEFAULT_NAMESPACE_PREFIX))) {
			return prefix + ':' + localName;
		} else {
			return localName;
		}
	}

	@Override
	public Void visitAttribute(Attr attr, Void arg) {
		try {
			if (! DOMUtilities.isNamespaceDeclaration(attr.getName())) {
				writer.append(' ');

				String namespace = attr.getNamespaceURI();
				if (namespace != null) {
					String prefix = prefixByNamespace.get(namespace);
					writer.append(prefix);
					writer.append(':');
					writer.append(attr.getLocalName());
				} else {
					writer.append(attr.getName());
				}
				writer.append('=');
				writer.append('"');
				writer.append(DumpUtilities.quoteAttrValue(attr.getValue()));
				writer.append('"');
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	@Override
	public Void visitComment(Comment comment, Void arg) {
		try {
			writer.append("<!--");
			writer.append(DumpUtilities.quoteComment(comment.getNodeValue()));
			writer.append("-->");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	@Override
	public Void visitProcessingInstruction(ProcessingInstruction pi, Void arg) {
		try {
			writer.append("<?");
			writer.append(pi.getNodeValue());
			writer.append("?>");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	@Override
	public Void visitText(Text text, Void arg) {
		try {
			writer.append(DumpUtilities.quoteText(text.getNodeValue()));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return null;
	}
	
	@Override
	public Void visitCDATASection(CDATASection cdata, Void arg) {
		try {
			String content = cdata.getTextContent();
			int length = content.length();
			if (length > 0) {
				writer.append("<![CDATA[");
				int index = 0;
				while (index < length) {
					int nextIndex = content.indexOf("]]>", index);
					if (nextIndex < 0) {
						writer.append(content.substring(index));
						break;
					} else {
						writer.append(content.substring(index, nextIndex));
						// Split CData section end marker into two halves.
						writer.append("]]" + "]]>" + "<![CDATA[" + ">");
						index = nextIndex + "]]>".length();
					}
				}
				writer.append("]]>");
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	/**
	 * Convenience method to serialize a node into a string.
	 */
	public static String toString(Node node) {
		StringWriter result = new StringWriter();
		new DumpVisitor(result).startVisit(node, null);
		return result.toString();
	}
	
}
