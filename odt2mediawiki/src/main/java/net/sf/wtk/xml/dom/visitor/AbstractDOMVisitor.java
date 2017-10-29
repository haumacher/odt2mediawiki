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


import net.sf.wtk.common.math.Group;
import net.sf.wtk.xml.dom.DOMUtilities.Select;

import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

public abstract class AbstractDOMVisitor<R, A> implements DOMVisitor<R, A> {
	protected final VisitSupport<R, A> visitSupport = 
		new VisitSupport<R, A>(this.getClass());

	public R visitNode(Node node, A arg) {
		throw new UnsupportedOperationException("Encountered unsupported node: " + node);		
	}
	
	public R visitElement(Element element, A arg) {
		return visitNode(element, arg);
	}
	
	public R visitAttribute(Attr attr, A arg) {
		return visitNode(attr, arg);
	}
	
	public R visitText(Text text, A arg) {
		return visitNode(text, arg);
	}
	
	public R visitCDATASection(CDATASection cdata, A arg) {
		return visitText(cdata, arg);
	}
	
	public R visitComment(Comment comment, A arg) {
		return visitNode(comment, arg);
	}
	
	public R visitProcessingInstruction(ProcessingInstruction pi, A arg) {
		return visitNode(pi, arg);
	}
	
	/** Convenience method for starting a visit. */
	public R visit(Document document, A arg) {
		return visitSupport.visit(document.getDocumentElement(), this, arg);
	}
	
	/** Start the visit process with an arbitrary node within a document. */
	public R startVisit(Node node, A arg) {
		return visitSupport.visit(node, this, arg);
	}

	protected void descendChildNodes(Element element, A arg) {
		for (Node child = element.getFirstChild(); child != null; child = child.getNextSibling()) {
			visitSupport.visit(child, this, arg);
		}
	}

	protected R descendChildNodes(Element element, Group<R> foldl, A arg) {
		R result = foldl.identity();
		for (Node child = element.getFirstChild(); child != null; child = child.getNextSibling()) {
			result = foldl.combine(result, visitSupport.visit(child, this, arg));
		}
		return result;
	}
	
	protected R descendChildNodes(Element element, Select<? super Node> filter, Group<R> foldl, A arg) {
		R result = foldl.identity();
		for (Node child = element.getFirstChild(); child != null; child = child.getNextSibling()) {
			if (! filter.isAccepted(child)) continue;
			
			result = foldl.combine(result, visitSupport.visit(child, this, arg));
		}
		return result;
	}

	protected void descendChildNodes(Element element, Select<? super Node> filter, A arg) {
		for (Node child = element.getFirstChild(); child != null; child = child.getNextSibling()) {
			if (! filter.isAccepted(child)) continue;
			
			visitSupport.visit(child, this, arg);
		}
	}

}
