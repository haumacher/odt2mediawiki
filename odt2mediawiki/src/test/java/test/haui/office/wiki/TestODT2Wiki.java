/*
 * TimeCollect records time you spent on your development work.
 * Copyright (C) 2017 Bernhard Haumacher and others
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package test.haui.office.wiki;

import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Locale;

import haui.office.wiki.ODT2Wiki;
import junit.extensions.TestSetup;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestODT2Wiki extends TestCase {
	
	static class Setup extends TestSetup {

		public static ODT2Wiki transformer;

		public Setup(Test test) {
			super(test);
		}
		
		@Override
		protected void setUp() throws Exception {
			super.setUp();

			// Make potential errors "googleable".
			Locale.setDefault(Locale.ENGLISH);
			
			// Create transformer only once for all tests.
			transformer = ODT2Wiki.createTransformer(false);
		}
		
		@Override
		protected void tearDown() throws Exception {
			transformer = null;
			super.tearDown();
		}
	}
	
	public static String load(File textFile) throws IOException {
		StringBuilder result = new StringBuilder();
		char[] buffer = new char[4096];
		try (Reader reader = new FileReader(textFile)) {
			int direct;
			while ((direct = reader.read(buffer)) >= 0) {
				result.append(buffer, 0, direct);
			}
		}
		return result.toString();
	}
	
	static Test createTest() {
		TestSuite suite = new TestSuite();
		
		File dir = new File("src/test/fixtures");
		File[] files = dir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".odt");
			}
		});
		assertNotNull(files);
		
		final String outputDir = "tmp/output";
		
		for (final File file : files) {
			suite.addTest(new TestCase(file.getName()) {
				@Override
				protected void runTest() throws Throwable {
					String inputName = file.getName();
					String outputName = inputName.substring(0, inputName.length() - ".odt".length()) + ".txt";
					File expectedResult = new File(file.getParentFile(), outputName);
					assertTrue("Expected result fixture '" + expectedResult + "' does not exist.", expectedResult.exists());

					File actualResult = new File(outputDir, outputName);
					
					try (OutputStream out = new FileOutputStream(actualResult)) {
						Setup.transformer.toWiki(file, out);
					}
					
					assertTrue("Output '" + outputName + "' does not exist.", actualResult.exists());
					
					String expected = load(expectedResult);
					String actual = load(actualResult);
					assertEquals(expected, actual);
				}
			});
		}
		
		return suite;
	}

	public static Test suite() {
		return new Setup(createTest());
	}

}
