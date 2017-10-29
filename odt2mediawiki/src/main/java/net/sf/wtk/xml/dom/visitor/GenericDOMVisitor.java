package net.sf.wtk.xml.dom.visitor;

import org.w3c.dom.Element;

public abstract class GenericDOMVisitor<R, A> extends AbstractDOMVisitor<R, A> implements DOMVisitor<R, A> {

	protected final GenericVisitSupport<R, A> visitSupportElement;

	public GenericDOMVisitor(Class<?>[] schemaConstants, String defaultNamespace, Class<?> argClass) {
		this.visitSupportElement = GenericVisitSupport.getInstance(schemaConstants, defaultNamespace, this.getClass(), argClass);
	}
	
	public final R visitElement(Element elem, A arg) {
		return visitSupportElement.visitElement(elem, this, arg);
	}
	
	public abstract R visitGenericElement(Element elem, A arg);

}
