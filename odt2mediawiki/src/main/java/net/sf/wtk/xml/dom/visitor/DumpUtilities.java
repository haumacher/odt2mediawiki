package net.sf.wtk.xml.dom.visitor;

public class DumpUtilities {

	public static String quoteComment(String comment) {
		return comment.replace("<!--", "&lt;!--").replace("-->", "--&gt;");
	}

	public static String quoteText(String text) {
		return text.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
	}

	public static String quoteAttrValue(String value) {
		return quoteText(value).replace("'", "&apos;").replace("\"", "&quot;");
	}

}
