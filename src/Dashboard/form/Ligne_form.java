
package Dashboard.form;

import java.awt.Color;


public class Ligne_form extends javax.swing.JPanel {

    public Ligne_form() {
        initComponents();
        
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new Dashboard.swing.RoundPanel();
        jBtn1 = new Dashboard.component.jBtn();
        jLabel1 = new javax.swing.JLabel();
        textField1 = new Dashboard.component.TextField();
        textField2 = new Dashboard.component.TextField();
        textField3 = new Dashboard.component.TextField();
        textField4 = new Dashboard.component.TextField();
        roundPanel2 = new Dashboard.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new Dashboard.form.TableDark();

        setBackground(new java.awt.Color(21, 21, 21));

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtn1.setForeground(new java.awt.Color(51, 51, 51));
        jBtn1.setText("Save");
        jBtn1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jBtn1.setRound(10);
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });
        roundPanel1.add(jBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 120, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(200, 200, 200));
        jLabel1.setText("Ajouter un Ligne");
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 172, 50));

        textField1.setText("Enter le ID");
        roundPanel1.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 243, -1));

        textField2.setText("Enter le départ");
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });
        roundPanel1.add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 243, -1));

        textField3.setText("Enter la destination");
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });
        roundPanel1.add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 243, -1));

        textField4.setText("Enter le nom de de ligne");
        textField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField4ActionPerformed(evt);
            }
        });
        roundPanel1.add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 243, -1));

        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDark1.setBackground(new java.awt.Color(51, 51, 51));
        tableDark1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"001", "120", "sebit", "medina"},
                {"002", "97", "la fac", "centre"},
                {"003", "63", "paris", "la gare"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Départ", "Destination"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDark1);

        roundPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 750, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed

    private void textField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Dashboard.component.jBtn jBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Dashboard.swing.RoundPanel roundPanel1;
    private Dashboard.swing.RoundPanel roundPanel2;
    private Dashboard.form.TableDark tableDark1;
    private Dashboard.component.TextField textField1;
    private Dashboard.component.TextField textField2;
    private Dashboard.component.TextField textField3;
    private Dashboard.component.TextField textField4;
    // End of variables declaration//GEN-END:variables
}
