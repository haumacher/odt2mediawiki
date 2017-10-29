package haui.office.dom;

public interface AnnotationConstants {

	public static final String ANNOTATION_NS = "http://haumacher.de/ns/office/annotation/1.0";

	// Workaround for missing implementation of user data in the current DOM.
	public static final String MEDIATYPE_ANNOTATION_ATTRIBUTE = "mediatype";
	
	/**
	 * Key to identify the mediatype of the contents of a binary element. This
	 * information must be transported to the serializer, which splits the
	 * document into separate ZIP streams. Other than the binary element, the
	 * ZIP streams require a mediatype annotation.
	 * 
	 * @see AnnotationConstants#MEDIATYPE_ANNOTATION_ATTRIBUTE for current workaround.
	 */
	public static final String MEDIATYPE_USERDATA_KEY = "mediatype";

}
