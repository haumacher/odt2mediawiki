package haui.office.io;

import haui.office.dom.OfficeConstants;
import haui.office.dom.OfficeUtilities;

import java.io.IOException;

import net.sf.wtk.xml.dom.visitor.GenericDOMVisitor;
import net.sf.wtk.xml.dom.visitor.VisitAbort;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 * Replaces all <code>draw:object</code> references to OpenDocument formulas
 * stored in separate zip file entries with inline contents.
 * 
 * @author Bernhard Haumacher
 */
public class InlineMathML extends GenericDOMVisitor<Void, ODFile> {
	private static final String FORMULA_DOCUMENT_MIME_TYPE = "application/vnd.oasis.opendocument.formula";

	public InlineMathML() {
		super(new Class[] {OfficeConstants.class}, null, ODFile.class);
	}

	public Void visitDRAWObjectElement(Element elem, ODFile odf) {
		String href = OfficeUtilities.getHrefXlinkAttribute(elem);
		if (href.length() > 0) {
			if (href.startsWith("./")) {
				href = href.substring(2);
			}
			
			if (FORMULA_DOCUMENT_MIME_TYPE.equals(odf.getMediaType(href + "/"))) {
				Document formulaContents;
				try {
					formulaContents = odf.readDocument(href + "/content.xml");
				} catch (IOException e) {
					throw new VisitAbort(e);
				} catch (SAXException e) {
					throw new VisitAbort(e);
				}
				
				// Remove XLINK.
				elem.removeAttributeNS(OfficeConstants.XLINK_NS, OfficeConstants.HREF_XLINK_ATTRIBUTE);
				elem.removeAttributeNS(OfficeConstants.XLINK_NS, OfficeConstants.TYPE_XLINK_ATTRIBUTE);
				elem.removeAttributeNS(OfficeConstants.XLINK_NS, OfficeConstants.SHOW_XLINK_ATTRIBUTE);
				elem.removeAttributeNS(OfficeConstants.XLINK_NS, OfficeConstants.ACTUATE_XLINK_ATTRIBUTE);
				
				// Embed formula.
				Node formulaRoot = elem.getOwnerDocument().importNode(formulaContents.getDocumentElement(), true);
				elem.appendChild(formulaRoot);
			}
		}
		return null;
	}

	@Override
	public Void visitGenericElement(Element elem, ODFile odf) {
		descendChildNodes(elem, odf);
		return null;
	}

	@Override
	public Void visitNode(Node node, ODFile odf) {
		// Ignore.
		return null;
	}
}