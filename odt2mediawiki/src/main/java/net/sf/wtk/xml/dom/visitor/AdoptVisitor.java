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

import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

/** 
 * Visitor to deeply copy nodes from one document to another document. Since 
 * DOM does not allow, to insert a node into a foreign document, a deep copy
 * of the transfered node must be built in the context of the target document.  
 */
public class AdoptVisitor extends DescendingVoidVisitor<Node> {
	/**
	 * Copies the visited element node in the context of the node passed as 
	 * <code>parent</code> argument. The copy is added to the list of child
	 * nodes of the parent node.
	 */
	@Override
	public Void visitElement(Element element, Node parent) {
		Node copy = parent.getOwnerDocument().createElementNS(element.getNamespaceURI(), element.getTagName());

		// Remember the preferred prefix for the namespace of the copied node.
		copy.setPrefix(element.getPrefix());
		
		parent.appendChild(copy);
		
		descendAttrs(element, copy);
		
		return super.visitElement(element, copy);
	}

	@Override
	public Void visitAttribute(Attr attr, Node parent) {
		String ns = attr.getNamespaceURI();
		if (ns == null) {
			((Element) parent).setAttribute(attr.getName(), attr.getValue());
		} else {
			((Element) parent).setAttributeNS(ns, attr.getName(), attr.getValue());
		}
		return null;
	}

	@Override
	public Void visitComment(Comment comment, Node parent) {
		Node copy = parent.getOwnerDocument().createComment(comment.getTextContent());
		parent.appendChild(copy);
		return null;
	}

	@Override
	public Void visitProcessingInstruction(ProcessingInstruction pi, Node parent) {
		Node copy = parent.getOwnerDocument().createProcessingInstruction(pi.getTarget(), pi.getTextContent());
		parent.appendChild(copy);
		return null;
	}

	@Override
	public Void visitText(Text text, Node parent) {
		Node copy = parent.getOwnerDocument().createTextNode(text.getTextContent());
		parent.appendChild(copy);
		return null;
	}
}
