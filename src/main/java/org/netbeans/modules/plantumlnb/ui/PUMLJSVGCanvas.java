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
package org.netbeans.modules.plantumlnb.ui;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.swing.gvt.AbstractPanInteractor;
import org.apache.batik.swing.gvt.Interactor;

/**
 *
 * @author Venkat Akkineni <sriguru@users.sourceforge.net>
 */
public class PUMLJSVGCanvas extends JSVGCanvas {

	public static final String renderingTransformPropertyName = "renderingTransform";

	public PUMLJSVGCanvas() {

		// remove old pan interactor		
		getInteractors().remove(super.panInteractor);
		
		// add a new one that doens't require the SHIFT key
		getInteractors().add(new AbstractPanInteractor() {
			public boolean startInteraction(InputEvent ie) {
				int mods = ie.getModifiers();
				return ie.getID() == MouseEvent.MOUSE_PRESSED
						  && (mods & InputEvent.BUTTON1_MASK) != 0;
			}
		});
	}

	@Override
	public void setRenderingTransform(AffineTransform newAt) {
		AffineTransform oldAt = getRenderingTransform();
		super.setRenderingTransform(newAt);
		pcs.firePropertyChange(renderingTransformPropertyName, oldAt, newAt);
	}

}
