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
public interface DOMRewrite<A> extends DOMVisitor<Node, A> {
	public Node visitNode(Node node, A arg);
	
	public Element visitElement(Element elem, A arg);
	public Attr visitAttribute(Attr attr, A arg);
	public Text visitText(Text text, A arg);
	public Comment visitComment(Comment comment, A arg);
	public ProcessingInstruction visitProcessingInstruction(ProcessingInstruction pi, A arg);

}
