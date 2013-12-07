/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.plantumlnb.ui.wizard;

import javax.swing.JPanel;

public final class PlantUMLVisualPanel2 extends JPanel {

    /**
     * Creates new form PlantUMLVisualPanel2
     */
    public PlantUMLVisualPanel2() {
        initComponents();
    }

    @Override
    public String getName() {
        return "Choose PlantUML Dependency options";
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        includePatternsLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        excludePatternsLabel = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        helpTextLabel = new javax.swing.JLabel();

        org.openide.awt.Mnemonics.setLocalizedText(includePatternsLabel, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel2.class, "PlantUMLVisualPanel2.includePatternsLabel.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel2.class, "PlantUMLVisualPanel2.jTextField1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(excludePatternsLabel, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel2.class, "PlantUMLVisualPanel2.excludePatternsLabel.text")); // NOI18N

        jTextField2.setText(org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel2.class, "PlantUMLVisualPanel2.jTextField2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(helpTextLabel, org.openide.util.NbBundle.getMessage(PlantUMLVisualPanel2.class, "PlantUMLVisualPanel2.helpTextLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(helpTextLabel)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(includePatternsLabel)
                            .addComponent(excludePatternsLabel))
                        .addGap(0, 215, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(includePatternsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(excludePatternsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(helpTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel excludePatternsLabel;
    private javax.swing.JLabel helpTextLabel;
    private javax.swing.JLabel includePatternsLabel;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}