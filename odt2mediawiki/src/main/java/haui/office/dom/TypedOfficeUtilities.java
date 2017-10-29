/*
 * SVG Import Filter for OpenOffice.org 2.0
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
package haui.office.dom;

import java.awt.geom.Rectangle2D;

import org.w3c.dom.Element;

public class TypedOfficeUtilities {

	public static void setViewBoxSvgAttribute(Element element, Rectangle2D viewbox) {
		setViewBoxSvgAttribute(element, 
			viewbox.getX(), viewbox.getY(), 
			viewbox.getWidth(), viewbox.getHeight());
	}
	
	public static void setViewBoxSvgAttribute(Element element, double x, double y, double width, double height) {
		OfficeUtilities.setViewBoxSvgAttribute(element, 
			((float) x) + " " + ((float) y) + " " + ((float) width) + " " + ((float) height));
	}

}
