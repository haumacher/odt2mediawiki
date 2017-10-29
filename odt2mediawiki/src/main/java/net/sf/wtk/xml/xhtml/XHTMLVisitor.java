package net.sf.wtk.xml.xhtml;

import net.sf.wtk.xml.dom.visitor.DOMVisitor;

import org.w3c.dom.Element;


public interface XHTMLVisitor<R, A> extends DOMVisitor<R, A> {
	public R visitXHTMLAElement(Element elem, A arg);
	public R visitXHTMLScriptElement(Element elem, A arg);
	public R visitXHTMLFrameElement(Element elem, A arg);
	public R visitXHTMLBodyElement(Element elem, A arg);
	public R visitXHTMLFramesetElement(Element elem, A arg);
	public R visitXHTMLHtmlElement(Element elem, A arg);
	public R visitXHTMLAppletElement(Element elem, A arg);
	public R visitXHTMLFormElement(Element elem, A arg);
	public R visitXHTMLImgElement(Element elem, A arg);
	public R visitXHTMLTitleElement(Element elem, A arg);
	public R visitXHTMLHeadElement(Element elem, A arg);
	public R visitXHTMLMetaElement(Element elem, A arg);
	public R visitXHTMLH1Element(Element elem, A arg);
	public R visitXHTMLH2Element(Element elem, A arg);
	public R visitXHTMLH3Element(Element elem, A arg);
	public R visitXHTMLH4Element(Element elem, A arg);
	public R visitXHTMLH5Element(Element elem, A arg);
	public R visitXHTMLH6Element(Element elem, A arg);
	public R visitXHTMLPElement(Element elem, A arg);
	public R visitXHTMLSpanElement(Element elem, A arg);
	public R visitXHTMLDivElement(Element elem, A arg);
	public R visitXHTMLUlElement(Element elem, A arg);
	public R visitXHTMLOlElement(Element elem, A arg);
	public R visitXHTMLDlElement(Element elem, A arg);
	public R visitXHTMLLiElement(Element elem, A arg);
	
	// TODO: make it complete. (automatically!)
}
