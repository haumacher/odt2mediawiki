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

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public abstract class DescendingDOMVisitor<R, A> extends AbstractDOMVisitor<R, A> {
	ResultCombinator<R> combinator;
	
	public DescendingDOMVisitor(ResultCombinator<R> combinator) {
		this.combinator = combinator;
	}
	
	@Override
	public R visitNode(Node node, A arg) {
		return descendChilds(node, arg);
	}
	
	protected R descendChilds(Node node, A arg) {
		R result = combinator.zero();
		for (Node nextChild, child = node.getFirstChild(); child != null; child = nextChild) {
			// Save the next child before visiting the current child, 
			// because the transformation could choose to remove the 
			// current node from the parent element.
			nextChild = child.getNextSibling();
			result = combinator.combine(result, visitSupport.visit(child, this, arg));
		}
		return result;
	}

	protected R descendAttrs(Element element, A arg) {
		R result = null;
		NamedNodeMap attrs = element.getAttributes();
		for (int length = attrs.getLength(), n = 0; n < length; n++) {
			result = combinator.combine(result, visitSupport.visit(attrs.item(n), this, arg));
		}
		return result;
	}
}
