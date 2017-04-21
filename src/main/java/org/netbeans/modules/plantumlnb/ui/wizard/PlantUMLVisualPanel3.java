/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.plantumlnb.ui.wizard;

import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;

public final class PlantUMLVisualPanel3 extends JPanel implements GenericDocumentListener, Initializable<PlantUMLWizardPanel3> {

    private PlantUMLWizardPanel3 plantUMLWizardPanel3;

    /**
     * Creates new form PlantUMLVisualPanel3
     */
    public PlantUMLVisualPanel3() {
        initComponents();
    }

    @Override
    public void init(final PlantUMLWizardPanel3 plantUMLWizardPanel3) {
    }

    @Override
    public String getName() {
        return "Choose display type options";
    }
    
    public boolean isAtleastOneDisplayTypeOptionSelected() {
        return abstractClassesCheckBox.isSelected() ||
                annotationsCheckBox.isSelected() ||
                classesCheckBox.isSelected() ||
                enumsCheckBox.isSelected() ||
                extensionsCheckBox.isSelected() ||
                implementationsCheckBox.isSelected() ||
                importsCheckBox.isSelected() ||
                interfacesCheckBox.isSelected() ||
                nativeMethodsCheckBox.isSelected() ||
                staticImportsCheckBox.isSelected();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abstractClassesCheckBox = new javax.swing.JCheckBox();
        annotationsCheckBox = new javax.swing.JCheckBox();
        enumsCheckBox = new javax.swing.JCheckBox();
        classesCheckBox = new javax.swing.JCheckBox();
        importsCheckBox = new javax.swing.JCheckBox();
        interfacesCheckBox = new javax.swing.JCheckBox();
        implementationsCheckBox = new javax.swing.JCheckBox();
        extensionsCheckBox = new javax.swing.JCheckBox();
        staticImportsCheckBox = new javax.swing.JCheckBox();
        nativeMethodsCheckBox = new javax.swing.JCheckBox();
        checkAllButton = new javax.swing.JButton();
        uncheckAllButton = new javax.swing.JButton();

        abstractClassesCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(abstractClassesCheckBox, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.abstractClassesCheckBox.text")); // NOI18N
        abstractClassesCheckBox.setToolTipText(org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.abstractClassesCheckBox.toolTipText")); // NOI18N
        abstractClassesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abstractClassesCheckBoxActionPerformed(evt);
            }
        });

        annotationsCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(annotationsCheckBox, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.annotationsCheckBox.text")); // NOI18N
        annotationsCheckBox.setToolTipText(org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.annotationsCheckBox.toolTipText")); // NOI18N
        annotationsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annotationsCheckBoxActionPerformed(evt);
            }
        });

        enumsCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(enumsCheckBox, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.enumsCheckBox.text")); // NOI18N
        enumsCheckBox.setToolTipText(org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.enumsCheckBox.toolTipText")); // NOI18N
        enumsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enumsCheckBoxActionPerformed(evt);
            }
        });

        classesCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(classesCheckBox, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.classesCheckBox.text")); // NOI18N
        classesCheckBox.setToolTipText(org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.classesCheckBox.toolTipText")); // NOI18N
        classesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classesCheckBoxActionPerformed(evt);
            }
        });

        importsCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(importsCheckBox, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.importsCheckBox.text")); // NOI18N
        importsCheckBox.setToolTipText(org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.importsCheckBox.toolTipText")); // NOI18N
        importsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importsCheckBoxActionPerformed(evt);
            }
        });

        interfacesCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(interfacesCheckBox, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.interfacesCheckBox.text")); // NOI18N
        interfacesCheckBox.setToolTipText(org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.interfacesCheckBox.toolTipText")); // NOI18N
        interfacesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interfacesCheckBoxActionPerformed(evt);
            }
        });

        implementationsCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(implementationsCheckBox, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.implementationsCheckBox.text")); // NOI18N
        implementationsCheckBox.setToolTipText(org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.implementationsCheckBox.toolTipText")); // NOI18N
        implementationsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                implementationsCheckBoxActionPerformed(evt);
            }
        });

        extensionsCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(extensionsCheckBox, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.extensionsCheckBox.text")); // NOI18N
        extensionsCheckBox.setToolTipText(org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.extensionsCheckBox.toolTipText")); // NOI18N
        extensionsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extensionsCheckBoxActionPerformed(evt);
            }
        });

        staticImportsCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(staticImportsCheckBox, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.staticImportsCheckBox.text")); // NOI18N
        staticImportsCheckBox.setToolTipText(org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.staticImportsCheckBox.toolTipText")); // NOI18N
        staticImportsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticImportsCheckBoxActionPerformed(evt);
            }
        });

        nativeMethodsCheckBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(nativeMethodsCheckBox, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.nativeMethodsCheckBox.text")); // NOI18N
        nativeMethodsCheckBox.setToolTipText(org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.nativeMethodsCheckBox.toolTipText")); // NOI18N
        nativeMethodsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nativeMethodsCheckBoxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(checkAllButton, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.checkAllButton.text")); // NOI18N
        checkAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAllButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(uncheckAllButton, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel3.class, "PlantUMLVisualPanel3.uncheckAllButton.text")); // NOI18N
        uncheckAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uncheckAllButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(staticImportsCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nativeMethodsCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(interfacesCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(importsCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(implementationsCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(extensionsCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enumsCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classesCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(annotationsCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abstractClassesCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(uncheckAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(abstractClassesCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(annotationsCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(classesCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(checkAllButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enumsCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(extensionsCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(uncheckAllButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(implementationsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(importsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(interfacesCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nativeMethodsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staticImportsCheckBox)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {abstractClassesCheckBox, annotationsCheckBox, classesCheckBox, enumsCheckBox, extensionsCheckBox, implementationsCheckBox, importsCheckBox, interfacesCheckBox, nativeMethodsCheckBox, staticImportsCheckBox});

    }// </editor-fold>//GEN-END:initComponents

    private void abstractClassesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abstractClassesCheckBoxActionPerformed
        
    }//GEN-LAST:event_abstractClassesCheckBoxActionPerformed

    private void annotationsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annotationsCheckBoxActionPerformed
        
    }//GEN-LAST:event_annotationsCheckBoxActionPerformed

    private void enumsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enumsCheckBoxActionPerformed
        
    }//GEN-LAST:event_enumsCheckBoxActionPerformed

    private void classesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classesCheckBoxActionPerformed
        
    }//GEN-LAST:event_classesCheckBoxActionPerformed

    private void importsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importsCheckBoxActionPerformed
        
    }//GEN-LAST:event_importsCheckBoxActionPerformed

    private void interfacesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interfacesCheckBoxActionPerformed
        
    }//GEN-LAST:event_interfacesCheckBoxActionPerformed

    private void implementationsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_implementationsCheckBoxActionPerformed
        
    }//GEN-LAST:event_implementationsCheckBoxActionPerformed

    private void extensionsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extensionsCheckBoxActionPerformed
        
    }//GEN-LAST:event_extensionsCheckBoxActionPerformed

    private void staticImportsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticImportsCheckBoxActionPerformed
        
    }//GEN-LAST:event_staticImportsCheckBoxActionPerformed

    private void nativeMethodsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nativeMethodsCheckBoxActionPerformed
        
    }//GEN-LAST:event_nativeMethodsCheckBoxActionPerformed

    private void checkAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllButtonActionPerformed
        checkAll();
    }//GEN-LAST:event_checkAllButtonActionPerformed

    private void uncheckAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uncheckAllButtonActionPerformed
        uncheckAll();
    }//GEN-LAST:event_uncheckAllButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox abstractClassesCheckBox;
    private javax.swing.JCheckBox annotationsCheckBox;
    private javax.swing.JButton checkAllButton;
    private javax.swing.JCheckBox classesCheckBox;
    private javax.swing.JCheckBox enumsCheckBox;
    private javax.swing.JCheckBox extensionsCheckBox;
    private javax.swing.JCheckBox implementationsCheckBox;
    private javax.swing.JCheckBox importsCheckBox;
    private javax.swing.JCheckBox interfacesCheckBox;
    private javax.swing.JCheckBox nativeMethodsCheckBox;
    private javax.swing.JCheckBox staticImportsCheckBox;
    private javax.swing.JButton uncheckAllButton;
    // End of variables declaration//GEN-END:variables

    private void checkAll() {
        abstractClassesCheckBox.setSelected(true);
        annotationsCheckBox.setSelected(true);
        classesCheckBox.setSelected(true);
        enumsCheckBox.setSelected(true);
        extensionsCheckBox.setSelected(true);
        implementationsCheckBox.setSelected(true);
        importsCheckBox.setSelected(true);
        interfacesCheckBox.setSelected(true);
        nativeMethodsCheckBox.setSelected(true);
        staticImportsCheckBox.setSelected(true);
    }
    
    private void uncheckAll() {
        abstractClassesCheckBox.setSelected(false);
        annotationsCheckBox.setSelected(false);
        classesCheckBox.setSelected(false);
        enumsCheckBox.setSelected(false);
        extensionsCheckBox.setSelected(false);
        implementationsCheckBox.setSelected(false);
        importsCheckBox.setSelected(false);
        interfacesCheckBox.setSelected(false);
        nativeMethodsCheckBox.setSelected(false);
        staticImportsCheckBox.setSelected(false);
    }
    
    public boolean getAbstractClasses() {
        return abstractClassesCheckBox.isSelected();
    }

    public boolean getAnnotations() {
        return annotationsCheckBox.isSelected();
    }

    public boolean getClasses() {
        return classesCheckBox.isSelected();
    }

    public boolean getEnums() {
        return enumsCheckBox.isSelected();
    }

    public boolean getExtensions() {
        return extensionsCheckBox.isSelected();
    }

    public boolean getImplementations() {
        return implementationsCheckBox.isSelected();
    }

    public boolean getImports() {
        return importsCheckBox.isSelected();
    }

    public boolean getInterfaces() {
        return interfacesCheckBox.isSelected();
    }

    public boolean getNativeMethods() {
        return nativeMethodsCheckBox.isSelected();
    }

    public boolean getStaticImports() {
        return staticImportsCheckBox.isSelected();
    }

    @Override
    public void updateUI(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ValidatingWizardPanel getValidatingWizardPanel() {
        return plantUMLWizardPanel3;
    }

    public static PlantUMLVisualPanel3 createInstance(final PlantUMLWizardPanel3 plantUMLWizardPanel3) {
        PlantUMLVisualPanel3 plantUMLVisualPanel3 = new PlantUMLVisualPanel3();
        plantUMLVisualPanel3.init(plantUMLWizardPanel3);
        return plantUMLVisualPanel3;
    }

}
