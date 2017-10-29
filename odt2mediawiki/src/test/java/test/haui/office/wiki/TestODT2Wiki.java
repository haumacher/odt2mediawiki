/*
 * odt2mediawiki: OpenDocument to WikiMedia transformation
 * Copyright (C) 2007-2013  Bernhard Haumacher (haui at haumacher dot de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test.haui.office.wiki;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
		try (Reader reader = new InputStreamReader(new FileInputStream(textFile), "utf-8")) {
			int direct;
			while ((direct = reader.read(buffer)) >= 0) {
				result.append(buffer, 0, direct);
			}
		}
		return result.toString();
	}
	
	static Test createTest() {
		TestSuite suite = new TestSuite();
		addAllTests(suite, new File("src/test/fixtures"), new File("tmp/output"));
		return suite;
	}

	static void addAllTests(TestSuite suite, File fixtureDir, File outputDir) {
		File[] files = fixtureDir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				String name = pathname.getName();
				return name.endsWith(".odt") || name.endsWith(".odf");
			}
		});
		assertNotNull(files);
		addLocalTests(suite, files, outputDir);
		
		
		File[] subDirs = fixtureDir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory() && (!pathname.getName().startsWith("."));
			}
		});
		assertNotNull(subDirs);
		
		for (File subDir : subDirs) {
			addAllTests(suite, subDir, new File(outputDir, subDir.getName()));
		}
	}

	static void addLocalTests(TestSuite suite, File[] files, final File outputDir) {
		for (final File file : files) {
			suite.addTest(new TestCase(file.getPath()) {
				@Override
				protected void runTest() throws Throwable {
					String inputName = file.getName();
					String outputName = inputName.substring(0, inputName.length() - ".odt".length()) + ".txt";
					File expectedResult = new File(file.getParentFile(), outputName);
					assertTrue("Expected result fixture '" + expectedResult + "' does not exist.", expectedResult.exists());

					outputDir.mkdirs();
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
	}

	public static Test suite() {
		return new Setup(createTest());
	}

}
