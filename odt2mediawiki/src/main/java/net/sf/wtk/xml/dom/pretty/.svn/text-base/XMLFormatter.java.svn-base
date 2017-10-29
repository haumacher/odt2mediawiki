package net.sf.wtk.xml.dom.pretty;

import net.sf.wtk.xml.dom.visitor.DescendingDOMVisitor;
import net.sf.wtk.xml.dom.visitor.ResultCombinator;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

/**
 * DOM transformer that produces a pretty-printable version of the visited DOM
 * tree.
 * 
 * <p>
 * Ignorable whitespace is inserted into element-only content in a way that
 * serializing the tree results in a pretty-printed version.
 * </p>
 * 
 * <p>
 * The result of a visit is the decision, whether the parent node of the visit
 * contains text that is non-whitespace.
 * </p>
 * 
 * @author Bernhard Haumacher
 */
public class XMLFormatter extends DescendingDOMVisitor<Boolean, Indent> {

	public static XMLFormatter SINGLETON = new XMLFormatter();
	
	public XMLFormatter() {
		super(ResultCombinator.BOOLEAN_OR_COMBINATOR);
	}
	
	public void startVisit(Node node) {
		super.startVisit(node, new DefaultIndent());
	}

	@Override
	public Boolean visitElement(Element element, Indent indent) {
		indent.inc();
		Boolean hasTextContent; 
		try {
			hasTextContent = super.visitElement(element, indent);
		
			if (! hasTextContent) {
				for (Node child = element.getFirstChild(); child != null; ) {
					// Fetch next child to be able to modify the child list in the
					// body of this iteration.
					Node nextChild = child.getNextSibling();
					
					if (child instanceof Text) {
						// Assert that this is whitespace, drop.
						element.removeChild(child);
					} else {
						// Not the last child in list, insert indentation before
						// current child.
						Text indentation = 
							element.getOwnerDocument().createTextNode(
								indent.getNewline() + indent.getIndent());
						element.insertBefore(indentation, child);
					}
					
					child = nextChild;
				}
			}
		} finally {
			indent.dec();
		}
		
		if (! hasTextContent && (element.getFirstChild() != null)) {
			// If there is any content at all, insert a final line break that
			// brings the closing tag to the next line.
			Text indentation = 
				element.getOwnerDocument().createTextNode(
					indent.getNewline() + indent.getIndent());
			element.appendChild(indentation);
		}
		
		return false;
	}
	
	@Override
	public Boolean visitText(Text text, Indent arg) {
		super.visitText(text, arg);
		String content = text.getTextContent();
		for (int n = 0, cnt = content.length(); n < cnt; n++) {
			if (! Character.isWhitespace(content.charAt(n))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean visitNode(Node node, Indent arg) {
		super.visitNode(node, arg);
		
		// Not text, because text is handled separately, see above.
		return false;
	}
	
}
