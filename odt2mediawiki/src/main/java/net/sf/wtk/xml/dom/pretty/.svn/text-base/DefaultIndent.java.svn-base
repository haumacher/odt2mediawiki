package net.sf.wtk.xml.dom.pretty;

import java.util.ArrayList;

public class DefaultIndent implements Indent {

	private int currentIndent = 0;
	
	private StringBuffer buffer = new StringBuffer();
	
	private ArrayList<String> indentations = new ArrayList<String>();
	
	public DefaultIndent() {
		indentations.add("");
	}
	
	public String getIndent() {
		return indentations.get(currentIndent);
	}

	public String getNewline() {
		return "\n";
	}

	public void inc() {
		currentIndent++;
		if (currentIndent == indentations.size()) {
			buffer.append('\t');
			indentations.add(buffer.toString());
		}
	}

	public void dec() {
		currentIndent--;
	}
	
}
