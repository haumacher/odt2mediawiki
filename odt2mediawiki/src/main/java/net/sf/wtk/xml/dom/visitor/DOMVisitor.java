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
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction; 
import org.w3c.dom.Text;

public interface DOMVisitor<R, A> {
	public R visitNode(Node node, A arg);
	
	public R visitElement(Element elem, A arg);
	public R visitAttribute(Attr attr, A arg);
	public R visitText(Text text, A arg);
	public R visitCDATASection(CDATASection cdata, A arg);
	public R visitComment(Comment comment, A arg);
	public R visitProcessingInstruction(ProcessingInstruction pi, A arg);
	
	// Visit methods must start with the visit prefix!
	//
	// public R startVisit(Node node, A arg);

}
