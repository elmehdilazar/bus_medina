/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Dashboard.form;

import Dashboard.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BRAVO
 */
public class Abonnement_form extends javax.swing.JPanel {

    /**
     * Creates new form Abonnement_form
     */
    public Abonnement_form() throws Exception {
        initComponents();
        abonne_table.setBackground(new Color(255,233,244,10));
        setOpaque(false);
        ScrollBarCustom sb = new ScrollBarCustom();
        sb.setForeground(new Color(51, 51, 51, 100));
        abonne_table.fixTable(jScrollPane1);
        
        updatetab();
    }

    
    public void updatetab() throws Exception{
         Connection c = Dashsql.connection();
         String sql = "select * from abonnement";
         PreparedStatement st = c.prepareStatement(sql);
         
         ResultSet rs = st.executeQuery();
         ResultSetMetaData rsData = rs.getMetaData();
         int q = rsData.getColumnCount();
         
         DefaultTableModel RecordTable = (DefaultTableModel) abonne_table.getModel();
         RecordTable.setRowCount(0);
         while(rs.next()){
             Vector columnData = new Vector();
               for(int i = 1;i<= q;i++){
                   columnData.add(rs.getString("id_abonnement"));
                   columnData.add(rs.getString("date_debut"));
                   columnData.add(rs.getString("date_fin"));
                   columnData.add(rs.getString("type_abonnement"));
                   columnData.add(rs.getString("id_ligne"));
               }
               RecordTable.addRow(columnData);
                
                     
                     }
         
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new Dashboard.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        abonne_table = new Dashboard.form.TableDark();
        round = new Dashboard.swing.RoundPanel();
        jLabel5 = new javax.swing.JLabel();
        id_abonnement = new Dashboard.component.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_ligne = new bus2.combobox.ComboBoxSuggestion();
        type_abonnement = new bus2.combobox.ComboBoxSuggestion();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        save = new Dashboard.component.jBtn();
        update = new Dashboard.component.jBtn();
        delete = new Dashboard.component.jBtn();

        setBackground(new java.awt.Color(21, 21, 21));

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));

        abonne_table.setBackground(new java.awt.Color(51, 51, 51));
        abonne_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_abonnement", "date-debut", "date_fin", "type_abonnement", "id_ligne"
            }
        ));
        abonne_table.setGridColor(new java.awt.Color(255, 209, 0));
        jScrollPane1.setViewportView(abonne_table);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        round.setBackground(new java.awt.Color(51, 51, 51));
        round.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 209, 0));
        jLabel5.setText("Gestion des Abonnements");
        round.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 40));
        round.add(id_abonnement, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date_debut:");
        round.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 123, 25));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID_abonnement:");
        round.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 57, -1, -1));

        id_ligne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_ligneActionPerformed(evt);
            }
        });
        round.add(id_ligne, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 220, 41));
        round.add(type_abonnement, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 80, 220, 41));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type_d'abonnement:");
        round.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 122, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID_ligne:");
        round.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date_fin:");
        round.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 90, -1));

        save.setText("Enregistrer");
        save.setRound(10);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        round.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 220, 40));

        update.setText("Modifiez");
        update.setRound(10);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        round.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 110, -1));

        delete.setText("Supprimer");
        delete.setRound(10);
        round.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(round, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(round, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
          String id = id_abonnement.getText();
          String type = type_abonnement.getSelectedItem().toString();
          String id_lig = id_ligne.getSelectedItem().toString();
          String deb =  ""; //date_debut.getText();
          String fin = ""; //date_fin.getText();
         if(!id.isEmpty() && !type.isEmpty() && !id_lig.isEmpty() && !type.isEmpty() && !type.isEmpty()){
            try{
             Connection c = Dashsql.connection();


             //Dashsql.ajouter_abonne(c, id,type,id_lig,deb,fin));
             JOptionPane.showMessageDialog(null, "L'abonnement "+id+" est enregistrer");
            updatetab();
            id_abonnement.setText("");
            id_abonnement.setText("");
            id_abonnement.setText("");
            id_abonnement.setText("");
            id_abonnement.setText("");
            
           
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }else{
            JOptionPane.showMessageDialog(null, "remplir tous les champs");
        }
    }//GEN-LAST:event_saveActionPerformed

    private void id_ligneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_ligneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_ligneActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
         String id = id_abonnement.getText();
          String type = type_abonnement.getSelectedItem().toString();
          String id_lig = id_ligne.getSelectedItem().toString();
          String deb =  ""; //date_debut.getText();
          String fin = ""; //date_fin.getText();
        
       /* if(!nomstat.isEmpty()){
            try{
             Connection c = Dashsql.connection();
             String sql = "update stations set nom_station='"+nomstat+"',id_ligne="+ligne_box.getSelectedItem().toString()+" where idstations = "+id+";";
              Statement requete = c.createStatement();
              int R = requete.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "station "+idstations.getText()+" est mis  jour");
            updatetab();
            id_abonnement.setText("");
            id_abonnement.setText("");
            id_abonnement.setText("");
            id_abonnement.setText("");
            
           
              
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }else{
            JOptionPane.showMessageDialog(null, "remplir tous les champs");
        }*/
    }//GEN-LAST:event_updateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Dashboard.form.TableDark abonne_table;
    private Dashboard.component.jBtn delete;
    private Dashboard.component.TextField id_abonnement;
    private bus2.combobox.ComboBoxSuggestion id_ligne;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private Dashboard.swing.RoundPanel round;
    private Dashboard.swing.RoundPanel roundPanel1;
    private Dashboard.component.jBtn save;
    private bus2.combobox.ComboBoxSuggestion type_abonnement;
    private Dashboard.component.jBtn update;
    // End of variables declaration//GEN-END:variables
}
