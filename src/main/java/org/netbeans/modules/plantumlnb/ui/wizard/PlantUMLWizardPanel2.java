/* 
 * The MIT License
 *
 * Copyright 2017 Venkat Ram Akkineni.
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
package org.netbeans.modules.plantumlnb.ui.wizard;

import static org.netbeans.modules.plantumlnb.StringUtils.isEmpty;
import static org.netbeans.modules.plantumlnb.StringUtils.isNotEmpty;
import static org.netbeans.modules.plantumlnb.Utils.isAntStylePathPattern;
import org.openide.WizardDescriptor;
import org.openide.WizardValidationException;
import org.openide.util.HelpCtx;

public class PlantUMLWizardPanel2 implements WizardDescriptor.Panel<WizardDescriptor>, ValidatingWizardPanel,
        WizardDescriptor.FinishablePanel<WizardDescriptor> {

    /**
     * The visual component that displays this panel. If you need to access the component from this class, just use
     * getComponent().
     */
    private PlantUMLVisualPanel2 component;

    // Get the visual component for the panel. In this template, the component
    // is kept separate. This can be more efficient: if the wizard is created
    // but never displayed, or not all panels are displayed, it is better to
    // create only those which really need to be visible.
    @Override
    public PlantUMLVisualPanel2 getComponent() {
        if (component == null) {
            component = PlantUMLVisualPanel2.createInstance(this);
        }
        return component;
    }

    @Override
    public HelpCtx getHelp() {
        // Show no Help button for this panel:
        return HelpCtx.DEFAULT_HELP;
        // If you have context help:
        // return new HelpCtx("help.key.here");
    }

    @Override
    public boolean isValid() {
        String ip = component.getIncludePattern();
        String ep = component.getExcludePattern();
        
        if(isNotEmpty(ip) && isEmpty(ep)) {
            return isAntStylePathPattern(ip);
        } else if (isEmpty(ip) && isNotEmpty(ep)) {
            return isAntStylePathPattern(ep);
        } else if (isNotEmpty(ip) && isNotEmpty(ep)) {
            return isAntStylePathPattern(ip) && isAntStylePathPattern(ep);
        } else {
            return true;
        }
        // If it depends on some condition (form filled out...) and
        // this condition changes (last form field filled in...) then
        // use ChangeSupport to implement add/removeChangeListener below.
        // WizardDescriptor.ERROR/WARNING/INFORMATION_MESSAGE will also be useful.
    }

    @Override
    public void readSettings(WizardDescriptor wiz) {
        // use wiz.getProperty to retrieve previous panel state
    }

    @Override
    public void storeSettings(WizardDescriptor wiz) {
        // use wiz.putProperty to remember current panel state
    }

    @Override
    public boolean isFinishPanel() {
        return true;
    }

    @Override
    public void validate() throws WizardValidationException {
        component.validate();
    }

}
