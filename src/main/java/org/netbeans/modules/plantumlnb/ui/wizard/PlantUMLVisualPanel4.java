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

import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;

public final class PlantUMLVisualPanel4 extends JPanel implements GenericDocumentListener, Initializable<PlantUMLWizardPanel4> {

    private PlantUMLWizardPanel4 plantUMLWizardPanel4;
    /**
     * Creates new form PlantUMLVisualPanel4
     */
    public PlantUMLVisualPanel4() {
        initComponents();
    }

    @Override
    public void init(final PlantUMLWizardPanel4 plantUMLWizardPanel4) {
        this.plantUMLWizardPanel4 = plantUMLWizardPanel4;

        displayPackageNameTextExpressionArea.getDocument().addDocumentListener(this);
    }

    @Override
    public String getName() {
        return "Enter display package name regular expressions";
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayPackageNameTextExpressionScrollPane1 = new javax.swing.JScrollPane();
        displayPackageNameTextExpressionArea = new javax.swing.JTextArea();
        displayPackageNameInformationTitle = new javax.swing.JLabel();
        displayPackageNameTitle = new javax.swing.JLabel();

        displayPackageNameTextExpressionArea.setColumns(20);
        displayPackageNameTextExpressionArea.setRows(5);
        displayPackageNameTextExpressionScrollPane1.setViewportView(displayPackageNameTextExpressionArea);

        displayPackageNameInformationTitle.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(displayPackageNameInformationTitle, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel4.class, "PlantUMLVisualPanel4.displayPackageNameInformationTitle.text")); // NOI18N
        displayPackageNameInformationTitle.setToolTipText(org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel4.class, "PlantUMLVisualPanel4.displayPackageNameInformationTitle.toolTipText")); // NOI18N
        displayPackageNameInformationTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        org.openide.awt.Mnemonics.setLocalizedText(displayPackageNameTitle, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel4.class, "PlantUMLVisualPanel4.displayPackageNameTitle.text")); // NOI18N
        displayPackageNameTitle.setToolTipText(org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel4.class, "PlantUMLVisualPanel4.displayPackageNameTitle.toolTipText")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayPackageNameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayPackageNameTextExpressionScrollPane1)
                    .addComponent(displayPackageNameInformationTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayPackageNameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displayPackageNameTextExpressionScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayPackageNameInformationTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel displayPackageNameInformationTitle;
    private javax.swing.JTextArea displayPackageNameTextExpressionArea;
    private javax.swing.JScrollPane displayPackageNameTextExpressionScrollPane1;
    private javax.swing.JLabel displayPackageNameTitle;
    // End of variables declaration//GEN-END:variables

    public String getDisplayPackageNameRegex() {
        return displayPackageNameTextExpressionArea.getText(); // TODO: Fix this.
    }

    @Override
    public void updateUI(DocumentEvent e) {
    }

    @Override
    public ValidatingWizardPanel getValidatingWizardPanel() {
        return plantUMLWizardPanel4;
    }
    
    public static PlantUMLVisualPanel4 createInstance(final PlantUMLWizardPanel4 plantUMLWizardPanel4) {
        PlantUMLVisualPanel4 plantUMLVisualPanel4 = new PlantUMLVisualPanel4();
        plantUMLVisualPanel4.init(plantUMLWizardPanel4);
        return plantUMLVisualPanel4;
    }

}
