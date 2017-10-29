package haui.office.dom;

import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ManifestUtilities implements ManifestConstants {
	
	public static Document createManifest(DocumentBuilder builder) {
		Document result = builder.newDocument();
		result.appendChild(createManifestManifestElement(result));
		return result;
	}
	
	public static Element createManifestManifestElement(Document document) {
		return document.createElementNS(MANIFEST_NS, MANIFEST_MANIFEST_ELEMENT);
	}

	public static Element createManifestFileEntryElement(Document document) {
		return document.createElementNS(MANIFEST_NS, FILE_ENTRY_MANIFEST_ELEMENT);
	}

	public static void setManifestFullPathAttribute(Element element, String value) {
		element.setAttributeNS(MANIFEST_NS, FULL_PATH_MANIFEST_ATTRIBUTE, value);
	}

	public static void setManifestMediaTypeAttribute(Element element, String value) {
		element.setAttributeNS(MANIFEST_NS, MEDIA_TYPE_MANIFEST_ATTRIBUTE, value);
	}
	
	public static String getManifestMediaTypeAttribute(Element element) {
		return element.getAttributeNS(MANIFEST_NS, MEDIA_TYPE_MANIFEST_ATTRIBUTE);
	}
	
	public static String getManifestFullPathAttribute(Element element) {
		return element.getAttributeNS(MANIFEST_NS, FULL_PATH_MANIFEST_ATTRIBUTE);
	}
	
}
