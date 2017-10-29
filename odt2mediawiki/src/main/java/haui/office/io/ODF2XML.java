package haui.office.io;


import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import net.sf.wtk.xml.dom.visitor.DumpVisitor;

import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Converts an OpenDocument stored in zip format into its flat XML
 * representation.
 * 
 * @author Bernhard Haumacher
 */
public class ODF2XML {

	public static Document read(File file) throws IOException, ParserConfigurationException, SAXException {
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		builderFactory.setNamespaceAware(true);
		builderFactory.setValidating(false);
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		builder.setEntityResolver(new EntityResolver() {
			public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
				// Prevent resolving entities.
				InputSource inputSource = new InputSource(new StringReader(""));
				return inputSource;
			}});

		ODFile odf = new ODFile(builder, file);
		
		String mimeType = odf.readString("mimetype", 256);
		Document content = odf.readDocument("content.xml");
		if ("application/vnd.oasis.opendocument.formula".equals(mimeType)) {
			// Formula document consists of a single math:math element only. 
			return content;
		}
		Document styles = odf.readDocument("styles.xml");
		Document meta = odf.readDocument("meta.xml");
		Document settings = odf.readDocument("settings.xml");
		
		Document mergedDocument = new RootMerger(builder, mimeType, content, styles, meta, settings)
			.merge()
			.getResult();
		
		new InlineMathML().visit(mergedDocument, odf);
		
		return mergedDocument;
	}

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		File odg = new File(args[0]);
		Document document = read(odg);
		OutputStreamWriter writer = new OutputStreamWriter(System.out, "UTF-8");
		new DumpVisitor(writer).visit(document, null);
		writer.flush();
	}
}