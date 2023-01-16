/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Dashboard.form;

import Dashboard.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BRAVO
 */
public class quartier_form extends javax.swing.JPanel {

    /**
     * Creates new form Cartier_form
     */
    public quartier_form() throws Exception {
        initComponents();
        ScrollBarCustom sb = new ScrollBarCustom();
        sb.setForeground(new Color(51, 51, 51, 100));
        tableDark1.fixTable(jScrollPane1);
        updatetab();
        updatecombo();
        update_btn.setVisible(false);
        delete_btn.setVisible(false);
        save_btn.setVisible(true);
    }
     public void updatetab() throws Exception{
         Connection c = Dashsql.connection();
         String sql = "select * from quartier";
         PreparedStatement st = c.prepareStatement(sql);
         
         ResultSet rs = st.executeQuery();
         ResultSetMetaData rsData = rs.getMetaData();
         int q = rsData.getColumnCount();
         
         DefaultTableModel RecordTable = (DefaultTableModel) tableDark1.getModel();
         RecordTable.setRowCount(0);
         while(rs.next()){
             Vector columnData = new Vector();
               for(int i = 1;i<= q;i++){
                   columnData.add(rs.getString("idQuartier"));
                   columnData.add(rs.getString("nom_quartier"));
                   columnData.add(rs.getString("stations_idstations"));
               }
               RecordTable.addRow(columnData);
                   
                     
                     }
         
    
    }
     public void updatecombo() throws Exception{
         Connection c = Dashsql.connection();
         String sql = "select nom_station from stations";
         PreparedStatement stmt=c.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE);
         
         ResultSet rs2 = stmt.executeQuery();
         
          while(rs2.next()){
                station_box.addItem(rs2.getString("nom_station"));
                
                 
       }
          
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new Dashboard.swing.RoundPanel();
        roundPanel2 = new Dashboard.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new Dashboard.form.TableDark();
        roundPanel4 = new Dashboard.swing.RoundPanel();
        save_btn = new Dashboard.component.jBtn();
        jLabel1 = new javax.swing.JLabel();
        nom_quartier = new Dashboard.component.TextField();
        idQuartier = new Dashboard.component.TextField();
        station_box = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        update_btn = new Dashboard.component.jBtn();
        delete_btn = new Dashboard.component.jBtn();

        setBackground(new java.awt.Color(21, 21, 21));

        roundPanel1.setBackground(new java.awt.Color(21, 21, 21));

        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));

        tableDark1.setBackground(new java.awt.Color(51, 51, 51));
        tableDark1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id ", "Nom", "ID_satation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDark1.setGridColor(new java.awt.Color(255, 209, 0));
        tableDark1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDark1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDark1);

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundPanel4.setBackground(new java.awt.Color(51, 51, 51));

        save_btn.setText("Save");
        save_btn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 209, 0));
        jLabel1.setText("Ajouter un quartier");

        nom_quartier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_quartierActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Entrer le ID");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Entrer le nom de cartier");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Entrer le ID de station");

        update_btn.setText("Modifiez");
        update_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        delete_btn.setText("supprimer");
        delete_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundPanel4Layout.createSequentialGroup()
                        .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idQuartier, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(roundPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(nom_quartier, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(station_box, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        roundPanel4Layout.setVerticalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idQuartier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_quartier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(station_box, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        String id = idQuartier.getText();
        String nomquar = nom_quartier.getText();
        if(!id.isEmpty() && !nomquar.isEmpty()){
            try{
             Connection c = Dashsql.connection();
             Statement stt = c.createStatement();
             ResultSet rs3 = stt.executeQuery("select idstations from stations where nom_station like '"+station_box.getSelectedItem().toString()+"';");
             String S = "";
               if(rs3.next()){
                   S = rs3.getString("idstations");
               }
             
             Dashsql.ajouter_quartier(c, id, nomquar,S);
            JOptionPane.showMessageDialog(null, "quartier "+idQuartier.getText()+" est enregistrer");
            updatetab();
            idQuartier.setText("");
            nom_quartier.setText("");
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }else{
            JOptionPane.showMessageDialog(null, "remplir tous les champs");
        }
         
        
    }//GEN-LAST:event_save_btnActionPerformed

    private void nom_quartierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_quartierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_quartierActionPerformed

    private void tableDark1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDark1MouseClicked
       
         if(tableDark1.getSelectedRowCount() == 1){
             update_btn.setVisible(true);
             delete_btn.setVisible(true);
             save_btn.setVisible(false);
          }
        DefaultTableModel tabmodel = (DefaultTableModel) tableDark1.getModel();
        
        
        String tablID = tabmodel.getValueAt(tableDark1.getSelectedRow(),0).toString();
        String tablNom = tabmodel.getValueAt(tableDark1.getSelectedRow(),1).toString();
        String tablIDligne = tabmodel.getValueAt(tableDark1.getSelectedRow(),2).toString();
        
            idQuartier.setText(tablID);
            nom_quartier.setText(tablNom);
            station_box.setSelectedItem(tablIDligne);
            
            idQuartier.setEditable(false);
            
    }//GEN-LAST:event_tableDark1MouseClicked

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        
        String id = idQuartier.getText();
        String nomquar = nom_quartier.getText();
        if(!nomquar.isEmpty()){
            try{
             Connection c = Dashsql.connection();
             Connection c1 = Dashsql.connection();
             Statement st1 = c1.createStatement();
             ResultSet rs3 = st1.executeQuery("select idstations from stations where nom_station like '"+station_box.getSelectedItem().toString()+"';");
             String S = "";
               if(rs3.next()){
                   S = rs3.getString("idstations");
               }
             String sql = "update quartier set nom_quartier='"+nomquar+"' , stations_idstations="+S+" where idQuartier = "+id+";";
              Statement requete = c.createStatement();
              int R = requete.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Quartier "+idQuartier.getText()+" est mis a jour");
            updatetab();
            idQuartier.setText("");
            nom_quartier.setText("");
            station_box.setSelectedItem("");
            
           
              
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }else{
            JOptionPane.showMessageDialog(null, "remplire tous les champs");
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        
        String id = idQuartier.getText();
        String nomquar = nom_quartier.getText();
         if(!id.isEmpty() && !nomquar.isEmpty()){
             try{
             Connection c = Dashsql.connection();
             String sql = "delete from quartier where idQuartier = "+id+";";
              Statement requete = c.createStatement();
              int R = requete.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Quartier "+nomquar+" est supprimer");
            updatetab();
            idQuartier.setText("");
            nom_quartier.setText("");
            station_box.setSelectedItem("");
            
           
              
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         }else{
             JOptionPane.showMessageDialog(null, "selecter un quartier.");
         }
        
    }//GEN-LAST:event_delete_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Dashboard.component.jBtn delete_btn;
    private Dashboard.component.TextField idQuartier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private Dashboard.component.TextField nom_quartier;
    private Dashboard.swing.RoundPanel roundPanel1;
    private Dashboard.swing.RoundPanel roundPanel2;
    private Dashboard.swing.RoundPanel roundPanel4;
    private Dashboard.component.jBtn save_btn;
    private javax.swing.JComboBox<String> station_box;
    private Dashboard.form.TableDark tableDark1;
    private Dashboard.component.jBtn update_btn;
    // End of variables declaration//GEN-END:variables
}
