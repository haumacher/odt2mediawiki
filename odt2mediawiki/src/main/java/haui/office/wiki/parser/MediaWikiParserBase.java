package haui.office.wiki.parser;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class MediaWikiParserBase {

	private static final String NS = null;
	protected Document doc;
	protected Node currentNode;
	
	public MediaWikiParserBase() {
		DocumentBuilderFactory builderFac = DocumentBuilderFactory.newInstance();
		builderFac.setNamespaceAware(true);
		builderFac.setValidating(false);
		
		try {
			DocumentBuilder builder = builderFac.newDocumentBuilder();
			
			currentNode = doc = builder.newDocument();
		} catch (ParserConfigurationException e) {
			throw new AssertionError(e);
		}
	}
	
	protected void pushSimple(String containerName, String groupName, String localName) {
		while (true) {
			String currentName = currentNode.getLocalName();
			if (groupName.equals(currentName)) {
				break;
			}
			if (containerName.equals(currentName)) {
				push(groupName);
				break;
			}
			
			pop();
		}
		push(localName);
	}
	
	protected void push(String localName) {
		Element newElement = doc.createElementNS(NS, localName);
		currentNode.appendChild(newElement);
		currentNode = newElement;
	}

	protected void set(String name, String value) {
		((Element) currentNode).setAttributeNS(null, name, value);
	}
	
	protected void pop() {
		currentNode = currentNode.getParentNode();
	}

	protected void pop(String upTo) {
		popExcluding(upTo);
		pop();
	}

	protected void popExcluding(String upTo) {
		while (! upTo.equals(currentNode.getLocalName())) {
			pop();
		}
	}
	
	public Document getDocument() {
		return doc;
	}
	
}
