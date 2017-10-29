package haui.office.wiki.parser;

import java.util.HashMap;

public class ExtensionTag {

	private final boolean beginTag;
	private final String name;
	private HashMap<String, String> attributes;

	public ExtensionTag(boolean beginTag, String name) {
		this.beginTag = beginTag;
		this.name = name;
	}

	public void addAttribute(String name, String value) {
		if (attributes == null) attributes = new HashMap<String, String>();
		
		attributes.put(name, value);
	}

}
