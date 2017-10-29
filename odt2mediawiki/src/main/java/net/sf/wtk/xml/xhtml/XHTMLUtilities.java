package net.sf.wtk.xml.xhtml;

import static net.sf.wtk.xml.dom.DOMUtilities.IS_ELEMENT;
import static net.sf.wtk.xml.dom.DOMUtilities.filter;
import static net.sf.wtk.xml.dom.DOMUtilities.getAnyElementSelect;
import static net.sf.wtk.xml.dom.DOMUtilities.getDescendantOrSelf;
import static net.sf.wtk.xml.dom.DOMUtilities.getElementSelect;
import static net.sf.wtk.xml.xhtml.XHTMLConstants.*;

import java.util.Iterator;

import net.sf.wtk.xml.dom.DOMUtilities;
import net.sf.wtk.xml.dom.DOMUtilities.Select;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class XHTMLUtilities {

	private static final Select<Node> IS_BODY = 
		getElementSelect(BODY_XHTML_ELEMENT);

	public static final Select<? super Node> IS_HTML_OR_FRAMESET = 
		getAnyElementSelect(HTML_XHTML_ELEMENT, FRAMESET_XHTML_ELEMENT);

	public static final Select<Node> IS_BODY_OR_FRAMESET = 
		DOMUtilities.getAnyElementSelect(BODY_XHTML_ELEMENT, FRAMESET_XHTML_ELEMENT);

	public static final Select<Node> IS_FRAME = 
		getElementSelect(FRAME_XHTML_ELEMENT);

	public static final Select<Node> IS_IFRAME = 
		getElementSelect(IFRAME_XHTML_ELEMENT);
	
	public static final Select<Node> IS_FRAME_OR_IFRAME = 
		getAnyElementSelect(FRAME_XHTML_ELEMENT, IFRAME_XHTML_ELEMENT);
	
	public static final Select<Node> IS_HTML = 
		DOMUtilities.getElementSelect(HTML_XHTML_ELEMENT);

	public static final Select<Node> IS_HEAD = 
		DOMUtilities.getElementSelect(HEAD_XHTML_ELEMENT);

	public static final Select<Node> IS_A = 
		getElementSelect(A_XHTML_ELEMENT);

	private static final Select<Node> HAS_NAME_ATTRIBUTE = 
		DOMUtilities.getAttributeSelectNS(null, NAME_XHTML_ATTRIBUTE);

	private static final Select<Node> HAS_HREF_ATTRIBUTE = 
		DOMUtilities.getAttributeSelectNS(null, HREF_ATTRIBUTE);

	public static final Select<Node> IS_ANCHOR = 
		DOMUtilities.and(IS_A, HAS_NAME_ATTRIBUTE);

	public static final Select<Node> IS_LINK = 
		DOMUtilities.and(IS_A, HAS_HREF_ATTRIBUTE);

	public static final Select<Node> IS_LINK_REF = 
		getElementSelect(XHTMLConstants.LINK_XHTML_ELEMENT);
	
	public static final Select<Node> IS_APPLET = 
		getElementSelect(APPLET_XHTML_ELEMENT);

	public static final Select<Node> IS_FORM = 
		getElementSelect(FORM_XHTML_ELEMENT);

	public static final Select<Node> IS_IMG = 
		getElementSelect(IMG_XHTML_ELEMENT);

	public static final Select<Node> IS_INPUT = 
		getElementSelect(INPUT_XHTML_ELEMENT);

	private static final Select<Node> IS_TITLE = 
		getElementSelect(TITLE_XHTML_ELEMENT);

	private static final Select<Node> IS_HTML_OR_HEAD = 
		DOMUtilities.getAnyElementSelect(HTML_XHTML_ELEMENT, HEAD_XHTML_ELEMENT);


	public static Iterable<Node> getFrames(Document document) {
		return filter(IS_FRAME, getDescendantOrSelf(
			document.getDocumentElement(), IS_HTML_OR_FRAMESET));
	}

	public static Iterable<Node> getIFrames(Document document) {
		return filter(IS_IFRAME, getDescendantOrSelf(
			document.getDocumentElement(), IS_ELEMENT));
	}
	
	public static Iterable<Node> getFramesAndIFrames(Document document) {
		return filter(IS_FRAME_OR_IFRAME, getDescendantOrSelf(
			document.getDocumentElement(), IS_ELEMENT));
	}
	
	public static boolean isXHTMLElement(Element element) {
		String namespaceURI = element.getNamespaceURI();
		return isXHTMLNamespace(namespaceURI);
	}

	public static boolean isXHTMLNamespace(String namespaceURI) {
		return (namespaceURI == null) || (XHTML_NS.equals(namespaceURI));
	}

	public static Element getBody(Element documentElement) {
		Iterator<Node> bodyNodes = DOMUtilities.filter(IS_BODY,
			DOMUtilities.getDescendantOrSelf(
				documentElement, IS_HTML)).iterator();
	
		return bodyNodes.hasNext() ? (Element) bodyNodes.next() : null;
	}

	public static Element getTitle(Element documentElement) {
		Iterator<Node> titleNodes = DOMUtilities.filter(IS_TITLE,
			DOMUtilities.getDescendantOrSelf(
				documentElement, IS_HTML_OR_HEAD)).iterator();
		
		return titleNodes.hasNext() ? (Element) titleNodes.next() : null;
	}

}
