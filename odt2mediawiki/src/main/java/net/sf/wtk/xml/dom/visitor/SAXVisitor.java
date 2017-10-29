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

import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;

/** 
 * Generates SAX events from a DOM document as if the document were 
 * currently parsed.    
 */
public class SAXVisitor extends DescendingVoidVisitor<Void> {
	ContentHandler contentHandler;
	LexicalHandler lexicalHandler;
	
	public SAXVisitor(ContentHandler contentHandler) {
		this(contentHandler, null);
	}

	public SAXVisitor(ContentHandler contentHandler, LexicalHandler lexicalHandler) {
		this.contentHandler = contentHandler;
		this.lexicalHandler = lexicalHandler;
	}
	
	/** @throws VisitAbort */
	@Override
	public Void visit(Document document, Void arg) {
		Void result;
		try {
			contentHandler.startDocument();
			result = super.visit(document, arg);
			contentHandler.endDocument();
		} catch (SAXException e) {
			throw new VisitAbort(e);
		}
		return result;
	}

	/** @throws VisitAbort */
	@Override
	public Void visitElement(final Element element, Void arg) {
		final NamedNodeMap attrMap = element.getAttributes();
		
		Attributes attrs = new Attributes() {
			public static final String CDATA_TYPE = "CDATA";
			
			public int getLength() {
				return attrMap.getLength();
			}

			public String getURI(int index) {
				return attrMap.item(index).getNamespaceURI();
			}

			public String getLocalName(int index) {
				return attrMap.item(index).getLocalName();
			}

			public String getQName(int index) {
				return attrMap.item(index).getNodeName();
			}

			public String getType(int index) {
				return CDATA_TYPE;
			}

			public String getValue(int index) {
				return attrMap.item(index).getNodeValue();
			}

			public int getIndex(String uri, String localName) {
				return getIndex(attrMap.getNamedItemNS(uri, localName));
			}

			public int getIndex(String qName) {
				return getIndex(attrMap.getNamedItem(qName));
			}

			private int getIndex(Node node) {
				for (int n = 0; n < attrMap.getLength(); n++) {
					if (node == attrMap.item(n)) return n;
				}
				throw new AssertionError("attribute node not found");
			}

			public String getType(String uri, String localName) {
				return CDATA_TYPE;
			}

			public String getType(String qName) {
				return CDATA_TYPE;
			}

			public String getValue(String uri, String localName) {
				return attrMap.getNamedItemNS(uri, localName).getNodeValue();
			}

			public String getValue(String qName) {
				return attrMap.getNamedItem(qName).getNodeValue();
			}
		};
		
		Void result;
		try {
			contentHandler.startElement(
				element.getNamespaceURI(), 
				element.getLocalName(), 
				element.getNodeName(), 
				attrs);
			result = super.visitElement(element, arg);
			contentHandler.endElement(
				element.getNamespaceURI(), 
				element.getLocalName(), 
				element.getNodeName());
		} catch (SAXException e) {
			throw new VisitAbort(e);
		}
		return result;
	}

	/** @throws VisitAbort */
	@Override
	public Void visitComment(Comment comment, Void arg) {
		int length = comment.getLength();
		char[] data = new char[length];
		comment.getData().getChars(0, length, data, 0);
		try {
			if (lexicalHandler != null) 
				lexicalHandler.comment(data, 0, length);
		} catch (SAXException e) {
			throw new VisitAbort(e);
		}
		return super.visitComment(comment, arg);
	}

	/** @throws VisitAbort */
	@Override
	public Void visitProcessingInstruction(ProcessingInstruction pi, Void arg) {
		try {
			contentHandler.processingInstruction(pi.getTarget(), pi.getData());
		} catch (SAXException e) {
			throw new VisitAbort(e);
		}
		return super.visitProcessingInstruction(pi, arg);
	}

	/** @throws VisitAbort */
	@Override
	public Void visitText(Text text, Void arg) {
		int length = text.getLength();
		char[] data = new char[length];
		text.getData().getChars(0, length, data, 0);
		
		try {
			contentHandler.characters(data, 0, length);
		} catch (SAXException e) {
			throw new VisitAbort(e);
		}
		return super.visitText(text, arg);
	}
}
