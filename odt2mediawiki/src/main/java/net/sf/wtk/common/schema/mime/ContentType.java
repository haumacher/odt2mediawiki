/*
 * Web Widget Toolkit (WTK): Server-side components for web-based user interfaces
 * Copyright (C) 2006 Bernhard Haumacher <haui@haumacher.de>
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place, Suite 330, Boston, MA 02111-1307 USA
 */
package net.sf.wtk.common.schema.mime;

import java.util.HashMap;
import java.util.Map;

public class ContentType {

	private String mediaType;
	private String type;
	private String subType;

	private Map<String, String> parameters = new HashMap<String, String>();
	
	public ContentType(String data) {
		int optionDelimiterIndex = data.indexOf(';');
		if (optionDelimiterIndex < 0) {
			mediaType = data;
		} else {
			mediaType = data.substring(0, optionDelimiterIndex);

			int startIndex = optionDelimiterIndex + 1;
			int dataLength = data.length();
			while (startIndex < dataLength) {
				int stopIndex = data.indexOf(';', startIndex);
				if (stopIndex < 0) {
					stopIndex = dataLength;
				}
				
				String parameter = data.substring(startIndex, stopIndex);
				int valueDelimiterIndex = parameter.indexOf('=');
				
				String name;
				String value;
				if (valueDelimiterIndex < 0) {
					name = parameter.trim();
					value = null;
				} else {
					name = parameter.substring(0, valueDelimiterIndex).trim();
					value = parameter.substring(valueDelimiterIndex + 1);
				}
				
				if (name.length() > 0) {
					parameters.put(name, value);
				}
				
				startIndex = stopIndex + 1;
			}
		}
		
		int subtypeDelimiterIndex = mediaType.indexOf('/');
		if (subtypeDelimiterIndex < 0) {
			type = mediaType;
			subType = null;
		} else {
			type = mediaType.substring(0, subtypeDelimiterIndex);
			subType = mediaType.substring(subtypeDelimiterIndex + 1);
		}
	}
	
	public String getMediaType() {
		return mediaType;
	}
	
	public String getType() {
		return type;
	}
	
	public String getSubType() {
		return subType;
	}
	
	public Map<String, String> getParameters() {
		return parameters;
	}

	public String getParameter(String name) {
		return parameters.get(name);
	}

}
