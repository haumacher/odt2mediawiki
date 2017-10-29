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

public class OfficeTypes {
	public static final String ELLIPSOID_STYLE_DRAW_VALUE = "ellipsoid";
	public static final String RADIAL_STYLE_DRAW_VALUE = "radial";
	public static final String LINEAR_STYLE_DRAW_VALUE = "linear";
	public static final String AXIAL_STYLE_DRAW_VALUE = "axial";
	
	public static String getPercentage(double value) {
		// TBD: Why convert to float? 
		return ((float) (value * 100)) + "%";
	}

	public static String getDegree(double angle) {
		// TODO: Gradient angles seem to be stored in units of 1/10 of a degree???
		int angleDeg10 = (int) Math.round(angle / Math.PI * 1800.0);
		angleDeg10 = ((angleDeg10 % 3600) + 3600) % 3600;
		
		return Integer.toString(angleDeg10);
	}
	
	public static String getMillimeters(double value) {
		// TBD: Why convert to float? 
		return ((float) value) + "mm";
	}

	/** 
	 * Return a typed value in "pt" from a lenght in millimeters.
	 */
	public static String getPoints(double value) {
		// TBD: Why convert to float? 
		return ((float) ((value / 25.4) * 72)) + "pt";
	}

}
