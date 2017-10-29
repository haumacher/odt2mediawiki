package haui.office.wiki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.URIResolver;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import haui.office.io.ODF2XML;

public class ODT2Wiki {

	public static final String HELP_PARAM = "-help";
	public static final String OUTPUT_PARAM = "-output";
	public static final String DIR_PARAM = "-dir";
	public static final String SUFFIX_PARAM = "-suffix";
	public static final String ALTERNATIVE_PARAM = "-alternative";
	public static final String TIME_PARAM = "-time";
	public static final String VERBOSE_PARAM = "-verbose";
	public static final String PATH_PARAM = "-path";
	
	private static final String ODT_SUFFIX = ".odt";
	private static final String ODF_SUFFIX = ".odf";
	private static final String TXT_SUFFIX = ".txt";
	
	private Transformer transformer;

	public ODT2Wiki(URL xsltBase) throws TransformerConfigurationException, IOException {
		// Workaround for bug in xsltc processor: http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=5056688
		// Use xalan interpretative processor (requires xalan.jar and
		// serializer.jar on the class path).
		System.setProperty("javax.xml.transform.TransformerFactory", 
				"org.apache.xalan.processor.TransformerFactoryImpl");
		
		TransformerFactory transformerFactory = 
			TransformerFactory.newInstance();
		
		transformerFactory.setURIResolver(new URIResolver() {
			public Source resolve(String href, String base)	throws TransformerException {
				// System.err.println("Requesting: '" + href + "' of base '" + base + "'");
				try {
					URL loadedURL = new URL(new URL(base), href);
					StreamSource result = new StreamSource(loadedURL.openStream());
					result.setSystemId(loadedURL.toExternalForm());
					return result;
				} catch (MalformedURLException ex) {
					throw new AssertionError(ex);
				} catch (IOException ex) {
					throw new AssertionError(ex);
				}
			}
		});
		
		Source transformationSource = new StreamSource(xsltBase.openStream());
		transformationSource.setSystemId(xsltBase.toExternalForm());
		
		transformer = transformerFactory.newTransformer(transformationSource);
		transformer.setOutputProperty("{http://xml.apache.org/xalan}line-separator","\n");
	}
	
	public void toWiki(File odtFile, OutputStream result) throws IOException, ParserConfigurationException, SAXException, TransformerException {
		Document document = ODF2XML.read(odtFile);
		transformer.transform(new DOMSource(document), new StreamResult(result));
	}

	private static File getOutputFile(File outputDir, File odtFile, String wikiSuffix) {
		String odtFileName = odtFile.getName();
		String suffix = (wikiSuffix.startsWith(".") ? "" : ".") + wikiSuffix;
		
		String resultFileName; 
		if (odtFileName.toLowerCase().endsWith(ODT_SUFFIX)) {
			resultFileName = odtFileName.substring(0, odtFileName.length() - ODT_SUFFIX.length()) + suffix;
		} else if (odtFileName.toLowerCase().endsWith(ODF_SUFFIX)) {
			resultFileName = odtFileName.substring(0, odtFileName.length() - ODF_SUFFIX.length()) + suffix;
		} else {
			resultFileName = odtFileName + suffix;
		}
		
		File resultFile = new File(outputDir == null ? odtFile.getParentFile() : outputDir, resultFileName);
		return resultFile;
	}

	public static void main(String[] args) {
		try {
			run(args);
		} catch (Exception ex) {
			System.err.println("Transformation failed, see following exception for details.");
			ex.printStackTrace();
			System.exit(1);
		}
	}
	
	public static void run(String[] args) throws IOException, ParserConfigurationException, SAXException, TransformerFactoryConfigurationError, TransformerException {
		boolean verbose = false;
		boolean time = false;
		boolean alternative = false;
		String suffix = TXT_SUFFIX;
		File dir = null;
		String output = null;
		
		ArrayList<String> srcFilenames = new ArrayList<String>();
		for (int n = 0, cnt = args.length; n < cnt; n++) {
			if (PATH_PARAM.equals(args[n])) {
				srcFilenames.addAll(Arrays.asList(args[++n].split("\\" + File.pathSeparatorChar)));
			}
			else if (VERBOSE_PARAM.equals(args[n])) {
				verbose = true;
			}
			else if (TIME_PARAM.equals(args[n])) {
				time = true;
			}
			else if (ALTERNATIVE_PARAM.equals(args[n])) {
				alternative = true;
			}
			else if (SUFFIX_PARAM.equals(args[n])) {
				if (n + 1 == args.length) {
					System.err.println("Missing suffix argument.");
					usage();
					System.exit(1);
				}
				suffix = args[++n];
			}
			else if (OUTPUT_PARAM.equals(args[n])) {
				if (n + 1 == args.length) {
					System.err.println("Missing output argument.");
					usage();
					System.exit(1);
				}
				output = args[++n];
			}
			else if (DIR_PARAM.equals(args[n])) {
				if (n + 1 == args.length) {
					System.err.println("Missing dir argument.");
					usage();
					System.exit(1);
				}
				dir = new File(args[++n]);
				if (dir.exists()) {
					if (!dir.isDirectory()) {
						System.err.println("Output directory is not a directory: " + dir.getAbsolutePath());
						usage();
						System.exit(1);
					}
				} else {
					boolean ok = dir.mkdirs();
					if (!ok) {
						System.err.println("Cannot create output directory: " + dir.getAbsolutePath());
						usage();
						System.exit(1);
					}
				}
			}
			else if (HELP_PARAM.equals(args[n])) {
				usage();
				System.exit(0);
			}
			else if (args[n].startsWith("-")) {
				System.err.println("Unknown option '" + args[n]  + "'.");
				usage();
				System.exit(1);
			}
			else {
				srcFilenames.add(args[n]);
			}
		}
		
		if (srcFilenames.size() == 0) {
			usage();
			System.exit(1);
		}
		
		if ((output != null) && (srcFilenames.size() > 1)) {
			System.err.println("Only a single input file allowed, if the output argument is given.");
			usage();
			System.exit(1);
		}
		
		ODT2Wiki odt2wiki = createTransformer(alternative);
		
		for (String fileName : srcFilenames) {
			if (verbose || time) {
				System.out.print("Converting '" + new File(fileName).getName() + "'...");
			}
			long elapsed = -System.currentTimeMillis();
			
			File odtFile = new File(fileName);
			OutputStream out = createOutput(dir, output, odtFile, suffix);
			odt2wiki.toWiki(odtFile, out);
			
			if (verbose || time) {
				if (time) {
					elapsed += System.currentTimeMillis();
					System.out.print(" " + elapsed + "ms.");
				}
				System.out.println(", ok.");
			}
		}
	}

	static OutputStream createOutput(File dir, String output, File odtFile,
			String suffix) throws FileNotFoundException {
		OutputStream out;
		if (output == null) {
			out = new FileOutputStream(getOutputFile(dir, odtFile, suffix));
		} else if (output.equals("-")) {
			out = System.out;
		} else {
			out = new FileOutputStream(new File(output));
		}
		return out;
	}

	public static ODT2Wiki createTransformer(boolean alternative)
			throws TransformerConfigurationException, IOException {
		ODT2Wiki odt2wiki = new ODT2Wiki(alternative ? 
			ODT2Wiki.class.getResource("OD2MediaWiki.xslt") : 
			ODT2Wiki.class.getResource("transform/odt2mediawiki.xsl"));
		return odt2wiki;
	}

	private static void usage() {
		System.out.println("odt2wiki" + 
			" [-path <'" + File.pathSeparatorChar + "'-separated list of filenames>]" + 
			" [-verbose] [-time] [-help] [-suffix <output file suffix>] [-output <output file>] [-dir <output dir>] [<input file>]+"
		);
	}
}
