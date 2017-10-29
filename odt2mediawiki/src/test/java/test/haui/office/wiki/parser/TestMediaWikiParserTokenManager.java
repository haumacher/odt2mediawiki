package test.haui.office.wiki.parser;

import haui.office.wiki.parser.JavaCharStream;
import haui.office.wiki.parser.MediaWikiParser;
import haui.office.wiki.parser.MediaWikiParserConstants;
import haui.office.wiki.parser.MediaWikiParserTokenManager;
import haui.office.wiki.parser.ParseException;
import haui.office.wiki.parser.Token;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;

public class TestMediaWikiParserTokenManager extends TestCase {

	private static final Set<String> INDENTABLES = new HashSet<String>();
	static {
		INDENTABLES.add("document");
		INDENTABLES.add("table");
		INDENTABLES.add("row");
		INDENTABLES.add("cell");
	}

	public void testTokenization() throws FileNotFoundException {
		
		FileReader reader = new FileReader("src/test/wiki-fixtures/table.txt");
		MediaWikiParserTokenManager tokenManager = new MediaWikiParserTokenManager(new JavaCharStream(reader));
		
		Token token;
		while ((token = tokenManager.getNextToken()).kind != MediaWikiParserConstants.EOF) {
			System.out.print(MediaWikiParserConstants.tokenImage[token.kind]);
			System.out.print(" \"");
			System.out.print(token.image.replace('\n', '.').replace('\r', '.'));
			System.out.println("\"");
		}
	}
	
	public void testParsing() throws IOException, ParseException {
		
		FileReader reader = new FileReader("src/test/wiki-fixtures/table.txt");
		MediaWikiParser parser = new MediaWikiParser(reader);
		
		parser.wikiText();
		
		Document document = parser.getDocument();
		
		indent(document);
		
		DOMImplementationLS ls = (DOMImplementationLS) document.getImplementation().getFeature("LS", "3.0");
		LSSerializer serializer = ls.createLSSerializer();
		LSOutput out = ls.createLSOutput();
		out.setByteStream(System.out);
		serializer.write(document, out);
	}

	private void indent(Document document) {
		indent(document.getDocumentElement(), new Indent());
	}

	private void indent(Element element, Indent indent) {
		Node child = element.getFirstChild();
		if (INDENTABLES.contains(element.getLocalName())) {
			if (child != null) {
				Document document = element.getOwnerDocument();
				
				indent.inc();
				String indentation = indent.toString();
				for (; child != null; child = child.getNextSibling()) {
					element.insertBefore(document.createTextNode(indentation), child);
					if (child instanceof Element) {
						indent((Element) child, indent);
					}
				}
				indent.dec();
				element.appendChild(document.createTextNode(indent.toString()));
			}
		} else {
			for (; child != null; child = child.getNextSibling()) {
				if (child instanceof Element) {
					indent((Element) child, indent);
				}
			}
		}
	}
	
	private static class Indent {
		private StringBuilder buffer = new StringBuilder(20);
		
		public Indent() {
			buffer.append("\n");
		}
		
		public void inc() {
			buffer.append("\t");
		}
		
		public void dec() {
			buffer.deleteCharAt(buffer.length() - 1);
		}
		
		public String toString() {
			return buffer.toString();
		}
	}
	
}
