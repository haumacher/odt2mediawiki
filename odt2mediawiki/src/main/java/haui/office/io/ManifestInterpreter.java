package haui.office.io;

import haui.office.dom.ManifestConstants;
import haui.office.dom.ManifestUtilities;

import java.util.Map;

import net.sf.wtk.xml.dom.visitor.GenericDOMVisitor;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * Extracts the entry name to media type mapping from an OpenDocumment manifest
 * file.
 * 
 * @author Bernhard Haumacher
 */
public class ManifestInterpreter extends GenericDOMVisitor<Void, Map<String, String>> {
	
	public ManifestInterpreter() {
		super(new Class[] {ManifestConstants.class}, null, Map.class);
	}

	public void visitMANIFESTFileEntryElement(Element element, Map<String, String> mediaTypeByEntryName) {
		mediaTypeByEntryName.put(
			ManifestUtilities.getManifestFullPathAttribute(element),
			ManifestUtilities.getManifestMediaTypeAttribute(element));
	}
	
	@Override
	public Void visitGenericElement(Element element, Map<String, String> mediaTypeByEntryName) {
		descendChildNodes(element, mediaTypeByEntryName);
		return null;
	}
	
	@Override
	public Void visitNode(Node node, Map<String, String> arg) {
		// Ignore.
		return null;
	}
}