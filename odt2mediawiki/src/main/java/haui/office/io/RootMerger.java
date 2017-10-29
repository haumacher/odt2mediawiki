package haui.office.io;

import static haui.office.dom.OfficeConstants.*;
import static haui.office.dom.OfficeUtilities.*;
import static net.sf.wtk.xml.dom.DOMUtilities.*;

import java.util.HashSet;

import javax.xml.parsers.DocumentBuilder;

import net.sf.wtk.xml.dom.DOMUtilities;
import net.sf.wtk.xml.dom.DOMUtilities.Select;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class RootMerger {
	
	private static final Select<? super Node> IS_META_OFFICE_ELEMENT = 
		DOMUtilities.getElementSelectNS(OFFICE_NS, META_OFFICE_ELEMENT);

	private static final Select<? super Node> IS_SETTINGS_OFFICE_ELEMENT = 
		DOMUtilities.getElementSelectNS(OFFICE_NS, SETTINGS_OFFICE_ELEMENT);

	private static final Select<? super Node> IS_SCRIPTS_OFFICE_ELEMENT = 
		DOMUtilities.getElementSelectNS(OFFICE_NS, SCRIPT_OFFICE_ELEMENT);

	private static final Select<? super Node> IS_FONT_FACE_DECLS_OFFICE_ELEMENT = 
		DOMUtilities.getElementSelectNS(OFFICE_NS, FONT_FACE_DECLS_OFFICE_ELEMENT);

	private static final Select<? super Node> IS_STYLES_OFFICE_ELEMENT = 
		DOMUtilities.getElementSelectNS(OFFICE_NS, STYLES_OFFICE_ELEMENT);

	private static final Select<? super Node> IS_AUTOMATIC_STYLES_OFFICE_ELEMENT = 
		DOMUtilities.getElementSelectNS(OFFICE_NS, AUTOMATIC_STYLES_OFFICE_ELEMENT);

	private static final Select<? super Node> IS_MASTER_STYLES_OFFICE_ELEMENT = 
		DOMUtilities.getElementSelectNS(OFFICE_NS, MASTER_STYLES_OFFICE_ELEMENT);

	private static final Select<? super Node> IS_BODY_OFFICE_ELEMENT = 
		DOMUtilities.getElementSelectNS(OFFICE_NS, BODY_OFFICE_ELEMENT);
		
	private Document content;
	private Document styles;
	private Document meta;
	private Document settings;
	
	private Document result;
	private DocumentBuilder builder;
	private final String mimeType;
	
	public RootMerger(DocumentBuilder builder, String mimeType, Document content, Document styles, Document meta, Document settings) {
		this.builder = builder;
		this.mimeType = mimeType;
		this.content = content;
		this.styles = styles;
		this.meta = meta;
		this.settings = settings;
	}
	
	public Document getResult() {
		return result;
	}

	public RootMerger merge() {
		result = createOfficeDocument(builder);
		Element officeDocument = result.getDocumentElement();
		
		// Set the mimetype attribute.
		setMimetypeOfficeAttribute(officeDocument, mimeType);
		Element documentContent = content.getDocumentElement();
		
		// Copy the version attribute from the content document.
		setVersionOfficeAttribute(officeDocument, getVersionOfficeAttribute(documentContent));
		
		// Copy the meta declarations from the meta document.
		copyElement(meta.getDocumentElement(), IS_META_OFFICE_ELEMENT, officeDocument);
		
		// Copy the settings from the settings document.
		copyElement(settings.getDocumentElement(), IS_SETTINGS_OFFICE_ELEMENT, officeDocument);
		
		// Copy the scripts from the content document.
		copyElement(content.getDocumentElement(), IS_SCRIPTS_OFFICE_ELEMENT, officeDocument);

		// Create a fontFaceDecls element and merge font face decls from content
		// and styles document.
		Element fontFaceDecls = createFontFaceDeclsOfficeElement(result);
		officeDocument.appendChild(fontFaceDecls);

		HashSet<String> fontFaceDeclNames = new HashSet<String>();
		Node contentFontFaceDecls = getFirstChild(IS_FONT_FACE_DECLS_OFFICE_ELEMENT, content.getDocumentElement());
		if (contentFontFaceDecls != null) {
			copyFontFaceDecls(fontFaceDecls, contentFontFaceDecls, fontFaceDeclNames);
		}
		
		if (styles != null) {
			Node stylesFontFaceDecls = getFirstChild(IS_FONT_FACE_DECLS_OFFICE_ELEMENT, styles.getDocumentElement());
			if (stylesFontFaceDecls != null) {
				copyFontFaceDecls(fontFaceDecls, stylesFontFaceDecls, fontFaceDeclNames);
			}
			
			// Copy the office styles from the styles document.
			copyElement(styles.getDocumentElement(), IS_STYLES_OFFICE_ELEMENT, officeDocument);
		}

		// Merge automatic styles from styles and content documents.
		Element automaticStyles = createAutomaticStylesOfficeElement(result);
		officeDocument.appendChild(automaticStyles);
		if (styles != null) {
			Node stylesStyles = getFirstChild(IS_AUTOMATIC_STYLES_OFFICE_ELEMENT, styles.getDocumentElement());
			importContents(stylesStyles, automaticStyles, null, true);
		}
		Node contentStyles = getFirstChild(IS_AUTOMATIC_STYLES_OFFICE_ELEMENT, content.getDocumentElement());
		if (contentStyles != null) {
			importContents(contentStyles, automaticStyles, null, true);
		}

		if (styles != null) {
			// Copy the master styles from the styles document.
			copyElement(styles.getDocumentElement(), IS_MASTER_STYLES_OFFICE_ELEMENT, officeDocument);
		}
		
		// Copy the body from the content document.
		copyElement(content.getDocumentElement(), IS_BODY_OFFICE_ELEMENT, officeDocument);

		return this;
	}

	private void copyElement(Element parent, Select<? super Node> selector, Element targetElement) {
		Node metaOfficeElement = DOMUtilities.getFirstChild(selector, parent);
		if (metaOfficeElement != null) {
			targetElement.appendChild(
				targetElement.getOwnerDocument().importNode(metaOfficeElement, true));
		}
	}

	private void copyFontFaceDecls(Element targetFontFaceDecls, Node sourceFontFaceDecls, HashSet<String> copiedNames) {
		for (Element decl : toElements(getChilds(sourceFontFaceDecls))) {
			String name = getNameStyleAttribute(decl);
			if (copiedNames.contains(name)) continue;
			
			targetFontFaceDecls.appendChild(result.importNode(decl, true));
			copiedNames.add(name);
		}
	}
	
}
