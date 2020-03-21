/* 
 * The MIT License
 *
 * Copyright 2013 Venkat Ram Akkineni.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.netbeans.modules.plantumlnb.ui.io;

import com.joejernst.http.Request;
import com.joejernst.http.Response;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;
import net.sourceforge.plantuml.code.Transcoder;
import net.sourceforge.plantuml.code.TranscoderUtil;
import net.sourceforge.plantuml.preproc.Defines;
import org.netbeans.modules.plantumlnb.ui.options.PlantUMLPanel;
import static org.netbeans.modules.plantumlnb.ui.options.PlantUMLPanel.DEFAULT_UTF8_ENCODING;
import static org.netbeans.modules.plantumlnb.ui.options.PlantUMLPanel.DOT_MANUAL_MODE_DOT_PATH;
import static org.netbeans.modules.plantumlnb.ui.options.PlantUMLPanel.PLANTUML_ENCODING;
import org.openide.awt.NotificationDisplayer;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.NbPreferences;

/**
 *
 * @author venkat
 * @author markiewb (refactoring)
 */
public class PUMLGenerator {

	private static final Logger logger = Logger.getLogger(PUMLGenerator.class.getName());
	private static PUMLGenerator INSTANCE;
	private static String lastImage="";
	private static String svg="";

	public static PUMLGenerator getInstance() {
		if (null == INSTANCE) {

			INSTANCE = new PUMLGenerator();
		}
		return INSTANCE;
	}

	private PUMLGenerator() {
	}

	private byte[] generateIntoBytes(FileObject inputFile, FileFormat fileFormat) {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try {

			final boolean server = NbPreferences.forModule(PlantUMLPanel.class).getBoolean(PlantUMLPanel.SERVER_MODE, false);

			if (server) {
				final String serverUri = NbPreferences.forModule(PlantUMLPanel.class).get(PlantUMLPanel.SERVER_URI, null);

				final Transcoder transcoder = TranscoderUtil.getDefaultTranscoder();
				final String source = inputFile.asText();
				final String encoded = transcoder.encode(source);

				// only hit the server if the encoded diagram has changed
				if (!lastImage.equals(encoded)) {
					lastImage = encoded;

					String uri = serverUri + "/svg/" + encoded;

					Response httpResponse = new Request(uri).getResource();

					if (httpResponse.getResponseCode() == 200) {

						svg = httpResponse.getBody();
						
					} else {
						String msg = httpResponse.getResponseMessage();
						NotificationDisplayer.getDefault().notify("PlantUML Server Error", NotificationDisplayer.Priority.NORMAL.getIcon(), msg, null, NotificationDisplayer.Priority.NORMAL);
					}
				}
				return svg.getBytes(Charset.forName("UTf-8"));
			} else {

				final boolean manual = NbPreferences.forModule(PlantUMLPanel.class).getBoolean(PlantUMLPanel.DOT_MANUAL_MODE, false);
				if (manual) {
					String path = NbPreferences.forModule(PlantUMLPanel.class).get(DOT_MANUAL_MODE_DOT_PATH, "");
					System.setProperty("GRAPHVIZ_DOT", path);
				} else {
					System.clearProperty("GRAPHVIZ_DOT");
				}

				String charset = NbPreferences.forModule(PlantUMLPanel.class).get(PLANTUML_ENCODING, DEFAULT_UTF8_ENCODING);
				SourceStringReader reader = new SourceStringReader(new Defines(),
						  inputFile.asText(),
						  charset,
						  Collections.<String>emptyList(),
						  FileUtil.toFile(inputFile).getParentFile());
				// Write the first image to "os"
				reader.generateImage(os, new FileFormatOption(fileFormat));
			}
			return os.toByteArray();
		} catch (IOException ex) {
			logger.log(Level.WARNING, ex.getMessage());
		} finally {
			try {
				os.close();
			} catch (IOException ex) {
				logger.log(Level.WARNING, ex.getMessage());
			}
		}
		return null;
	}

	public String generateForPreview(FileObject inputFile, FileFormat fileFormat) {

		String charset = NbPreferences.forModule(PlantUMLPanel.class).get(PLANTUML_ENCODING, DEFAULT_UTF8_ENCODING);

		try {
			return new String(generateIntoBytes(inputFile, fileFormat), charset);
		} catch (UnsupportedEncodingException ex) {
			logger.log(Level.WARNING, ex.getMessage());
		}
		return null;
	}

	public void generateIntoFile(FileObject inputFile, File outputFile, FileFormat fileFormat) {
		byte[] content = generateIntoBytes(inputFile, fileFormat);
		try {

			outputFile.createNewFile();
			Files.write(outputFile.toPath(), content);

		} catch (IOException ex) {
			logger.log(Level.WARNING, ex.getMessage());
		}
	}

}
