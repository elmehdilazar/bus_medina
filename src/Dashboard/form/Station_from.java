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
public class Station_from extends javax.swing.JPanel {

    /**
     * Creates new form Station_from
     */
    public Station_from() throws Exception {
        initComponents();
        tableDark1.setBackground(new Color(255,233,244,10));
        setOpaque(false);
        ScrollBarCustom sb = new ScrollBarCustom();
        
        sb.setForeground(new Color(51, 51, 51, 100));
        //getContentPane().setBackground(new Color(30, 30, 30));
        tableDark1.fixTable(jScrollPane1);
         updatetab();
         updatecombo();
         DefaultTableModel tabmodel = (DefaultTableModel) tableDark1.getModel();
        
         if(tableDark1.getSelectedRowCount() == 0){
               update_btn.setVisible(false);
               delete_btn.setVisible(false);
               save_btn.setVisible(true);
          }
 
        
       
    }
     
    public void updatetab() throws Exception{
         Connection c = Dashsql.connection();
         String sql = "select * from stations";
         PreparedStatement st = c.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         
         ResultSet rs = st.executeQuery();
         ResultSetMetaData rsData = rs.getMetaData();
         int q = rsData.getColumnCount();
         
         DefaultTableModel RecordTable = (DefaultTableModel) tableDark1.getModel();
         RecordTable.setRowCount(0);
         while(rs.next()){
             
             Vector columnData = new Vector();
               for(int i = 1;i<= q;i++){
                   columnData.add(rs.getString("idstations"));
                   columnData.add(rs.getString("nom_station"));
                   columnData.add(rs.getString("id_ligne"));
               }
               RecordTable.addRow(columnData);    
       }
       
    }
    public void updatecombo() throws Exception{
         Connection c = Dashsql.connection();
         String sql = "select id_ligne from ligne";
         PreparedStatement stmt=c.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE);
         
         ResultSet rs2 = stmt.executeQuery();
         
          while(rs2.next()){
                ligne_box.addItem(rs2.getString("id_ligne"));
                 
       }
          
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel3 = new Dashboard.swing.RoundPanel();
        save_btn = new Dashboard.component.jBtn();
        nom_station = new Dashboard.component.TextField();
        idstations = new Dashboard.component.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ligne_box = new javax.swing.JComboBox<>();
        update_btn = new Dashboard.component.jBtn();
        delete_btn = new Dashboard.component.jBtn();
        roundPanel5 = new Dashboard.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new Dashboard.form.TableDark();

        setBackground(new java.awt.Color(21, 21, 21));
        setPreferredSize(new java.awt.Dimension(720, 600));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        roundPanel3.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel3.setPreferredSize(new java.awt.Dimension(740, 200));

        save_btn.setForeground(new java.awt.Color(51, 51, 51));
        save_btn.setText("Save");
        save_btn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        save_btn.setRound(10);
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        nom_station.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_stationActionPerformed(evt);
            }
        });

        idstations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idstationsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 209, 0));
        jLabel1.setText("Ajouter une Station");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID de ligne");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter le nom de Station");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter le ID");

        update_btn.setText("Modifiez");
        update_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_btn.setRound(10);
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        delete_btn.setText("supprimer");
        delete_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_btn.setRound(10);
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(516, Short.MAX_VALUE))
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(roundPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60))
                                .addGroup(roundPanel3Layout.createSequentialGroup()
                                    .addComponent(idstations, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nom_station, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(roundPanel3Layout.createSequentialGroup()
                                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(384, 384, 384)))
                        .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel3Layout.createSequentialGroup()
                                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(roundPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 98, Short.MAX_VALUE))
                                    .addComponent(ligne_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6))
                            .addGroup(roundPanel3Layout.createSequentialGroup()
                                .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idstations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_station, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ligne_box, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        roundPanel5.setBackground(new java.awt.Color(51, 51, 51));

        tableDark1.setAutoCreateRowSorter(true);
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
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID de station", "Nom de station", "ID de ligne"
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

        javax.swing.GroupLayout roundPanel5Layout = new javax.swing.GroupLayout(roundPanel5);
        roundPanel5.setLayout(roundPanel5Layout);
        roundPanel5Layout.setHorizontalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        roundPanel5Layout.setVerticalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addComponent(roundPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void costumField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costumField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costumField3ActionPerformed

    private void costumField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costumField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costumField4ActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
          String id = idstations.getText();
          String nomstat = nom_station.getText();
        if(!id.isEmpty() && !nomstat.isEmpty()){
            try{
             Connection c = Dashsql.connection();
             Dashsql.ajout_station(c, idstations.getText(), nom_station.getText(),ligne_box.getSelectedItem().toString());
             JOptionPane.showMessageDialog(null, "station "+idstations.getText()+" est enregistrer");
            updatetab();
            idstations	.setText("");
            nom_station.setText("");
            ligne_box.setSelectedItem("");
            
           
              
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }else{
            JOptionPane.showMessageDialog(null, "remplir tous les champs");
        }
        
            
    }//GEN-LAST:event_save_btnActionPerformed

    private void nom_stationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_stationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_stationActionPerformed

    private void idstationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idstationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idstationsActionPerformed

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
        
            idstations.setText(tablID);
            nom_station.setText(tablNom);
            ligne_box.setSelectedItem(tablIDligne);
            
            idstations.setEditable(false);
            
    }//GEN-LAST:event_tableDark1MouseClicked

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        
        String id = idstations.getText();
        String nomstat = nom_station.getText();
        if(!nomstat.isEmpty()){
            try{
             Connection c = Dashsql.connection();
             String sql = "update stations set nom_station='"+nomstat+"',id_ligne="+ligne_box.getSelectedItem().toString()+" where idstations = "+id+";";
              Statement requete = c.createStatement();
              int R = requete.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "station "+idstations.getText()+" est mis  jour");
            updatetab();
            idstations.setText("");
            nom_station.setText("");
            ligne_box.setSelectedItem("");
            
           
              
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }else{
            JOptionPane.showMessageDialog(null, "remplir tous les champs");
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        String id = idstations.getText();
        String nomstat = nom_station.getText();
        if(!nomstat.isEmpty() && !nomstat.isEmpty()){
            try{
             Connection c = Dashsql.connection();
             String sql = "delete from stations where idstations = "+id+";";
              Statement requete = c.createStatement();
              int R = requete.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "station "+idstations.getText()+" est supprimer");
            updatetab();
            idstations.setText("");
            nom_station.setText("");
            ligne_box.setSelectedItem("");
            
           
              
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Sélectionner une station.");
        }
        
        
    }//GEN-LAST:event_delete_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Dashboard.component.jBtn delete_btn;
    private Dashboard.component.TextField idstations;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> ligne_box;
    private Dashboard.component.TextField nom_station;
    private Dashboard.swing.RoundPanel roundPanel3;
    private Dashboard.swing.RoundPanel roundPanel5;
    private Dashboard.component.jBtn save_btn;
    private Dashboard.form.TableDark tableDark1;
    private Dashboard.component.jBtn update_btn;
    // End of variables declaration//GEN-END:variables
}
