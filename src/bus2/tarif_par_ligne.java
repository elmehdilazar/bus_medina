/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bus2;

import java.awt.Color;

/**
 *
 * @author mehdi
 */
public class tarif_par_ligne extends javax.swing.JPanel {

    /**
     * Creates new form tarif_par_ligne
     */
    public tarif_par_ligne() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new Dashboard.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new Dashboard.form.TableDark();
        textField1 = new Dashboard.component.TextField();
        jBtn1 = new Dashboard.component.jBtn();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new Color(0,0,0,128));
        roundPanel1.setOpaque(true);
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDark1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableDark1);

        roundPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 940, 310));

        textField1.setText("recherche...");
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        roundPanel1.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 190, 40));

        jBtn1.setText("recherchez");
        roundPanel1.add(jBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 200, 40));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1030, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Dashboard.component.jBtn jBtn1;
    private javax.swing.JScrollPane jScrollPane1;
    private Dashboard.swing.RoundPanel roundPanel1;
    private Dashboard.form.TableDark tableDark1;
    private Dashboard.component.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
