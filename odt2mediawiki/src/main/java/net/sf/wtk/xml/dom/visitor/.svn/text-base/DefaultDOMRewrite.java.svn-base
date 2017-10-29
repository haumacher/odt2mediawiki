package net.sf.wtk.xml.dom.visitor;

import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

/**
 * @deprecated
 */
public class DefaultDOMRewrite<A> extends AbstractDOMVisitor<Node, A> implements DOMRewrite<A> {

	public Attr visitAttribute(Attr attr, A arg) {
		Attr newAttr = attr.getOwnerDocument().createAttributeNS(attr.getNamespaceURI(), attr.getName());
		newAttr.setValue(attr.getValue());
		return newAttr;
	}

	public Comment visitComment(Comment comment, A arg) {
		return comment.getOwnerDocument().createComment(comment.getTextContent());
	}

	public Element visitElement(Element elem, A arg) {
		return elem.getOwnerDocument().createElementNS(elem.getNamespaceURI(), elem.getNodeName());
	}

	public ProcessingInstruction visitProcessingInstruction(
			ProcessingInstruction pi, A arg) {
		return pi.getOwnerDocument().createProcessingInstruction(pi.getTarget(), pi.getData());
	}

	public Text visitText(Text text, A arg) {
		return text.getOwnerDocument().createTextNode(text.getData());
	}

	public Node visitNode(Node node, A arg) {
		return null;
	}

}
