package haui.office.io;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Represents an OpenDocument file.
 *
 * @author Bernhard Haumacher
 */
public class ODFile {

	private static final String MANIFEST = "META-INF/manifest.xml";
	
	private final ZipFile zipFile;
	private final DocumentBuilder builder;

	private HashMap<String, String> mediaTypeByEntryName;

	public ODFile(DocumentBuilder builder, File file) throws ZipException, IOException, SAXException {
		this.builder = builder;
		this.zipFile = new ZipFile(file);
		
		Document manifest = readDocument(MANIFEST);
		mediaTypeByEntryName = new HashMap<String, String>();
		new ManifestInterpreter().visit(manifest, mediaTypeByEntryName);
	}

	public String getMediaType(String fullPath) {
		return mediaTypeByEntryName.get(fullPath);
	}
	
	public Document readDocument(String entryName) throws IOException, SAXException {
		ZipEntry entry = zipFile.getEntry(entryName);
		if (entry == null) return null;
		
		InputStream in = zipFile.getInputStream(entry);
		
		Document result = builder.parse(in);
		
		return result;
	}

	public String readString(String entryName, int expectedLength) throws IOException {
		ZipEntry entry = zipFile.getEntry(entryName);
		InputStreamReader reader = new InputStreamReader(zipFile.getInputStream(entry), "ASCII");

		StringBuilder result = new StringBuilder();
		char[] buffer = new char[expectedLength];
		while (true) {
			int direct = reader.read(buffer);
			if (direct < 0) break;
			result.append(buffer, 0, direct);
		}
		
		return result.toString();
	}

}
