package net.sf.wtk.xml.dom.visitor;

import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

public abstract class AbstractGenericDOMVisitor<R,A> extends GenericDOMVisitor<R,A> {

	public AbstractGenericDOMVisitor(Class<?>[] schemaConstants, String defaultNamespace, Class<A> argClass) {
		super(schemaConstants, defaultNamespace, argClass);
	}

	public R visitAttribute(Attr attr, A arg) {
		return visitNode(attr, arg);
	}

	public R visitComment(Comment comment, A arg) {
		return visitNode(comment, arg);
	}

	public R visitProcessingInstruction(ProcessingInstruction pi, A arg) {
		return visitNode(pi, arg);
	}

	public R visitText(Text text, A arg) {
		return visitNode(text, arg);
	}

}
