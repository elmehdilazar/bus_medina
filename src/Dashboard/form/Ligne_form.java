
package Dashboard.form;

import Dashboard.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Ligne_form extends javax.swing.JPanel{

private int id;
    public Ligne_form(int id) throws Exception {
        initComponents();
        this.id=id;
        System.out.println(this.id);
        ScrollBarCustom sb = new ScrollBarCustom();
        sb.setForeground(new Color(51, 51, 51, 100));
        Ligne.fixTable(jScrollPane1);
        updatetab();

    }
    
    public void updatetab() throws Exception{
         Connection c = Dashsql.connection();
         String sql = "select * from ligne";
         PreparedStatement st = c.prepareStatement(sql);
         
         ResultSet rs = st.executeQuery();
         ResultSetMetaData rsData = rs.getMetaData();
         int q = rsData.getColumnCount();
         
         DefaultTableModel RecordTable = (DefaultTableModel) Ligne.getModel();
         RecordTable.setRowCount(0);
         while(rs.next()){
             Vector columnData = new Vector();
               for(int i = 1;i<= q;i++){
                   columnData.add(rs.getString("id_ligne"));
                   columnData.add(rs.getString("tarif"));
                   columnData.add(rs.getString("origine"));
                   columnData.add(rs.getString("destination"));
               }
               RecordTable.addRow(columnData);
              
         }
         
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new Dashboard.swing.RoundPanel();
        save_btn = new Dashboard.component.jBtn();
        jLabel1 = new javax.swing.JLabel();
        id_ligne = new Dashboard.component.TextField();
        origine = new Dashboard.component.TextField();
        destination = new Dashboard.component.TextField();
        tarif = new Dashboard.component.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        delete_btn = new Dashboard.component.jBtn();
        update_btn = new Dashboard.component.jBtn();
        roundPanel2 = new Dashboard.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ligne = new Dashboard.form.TableDark();

        setBackground(new java.awt.Color(21, 21, 21));

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));

        save_btn.setForeground(new java.awt.Color(51, 51, 51));
        save_btn.setText("Save");
        save_btn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        save_btn.setRound(10);
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 209, 0));
        jLabel1.setText("Ajouter une Ligne");

        id_ligne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_ligneActionPerformed(evt);
            }
        });

        origine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origineActionPerformed(evt);
            }
        });

        destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationActionPerformed(evt);
            }
        });

        tarif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarifActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter le ID ");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter le tarif");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter le départ");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter la destination");

        delete_btn.setText("Supprimer");
        delete_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_btn.setRound(10);
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        update_btn.setText("Modifiez");
        update_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_btn.setRound(10);
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tarif, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_ligne, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(63, 63, 63)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(origine, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_ligne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(origine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));

        Ligne.setAutoCreateRowSorter(true);
        Ligne.setBackground(new java.awt.Color(51, 51, 51));
        Ligne.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tarif", "Origine", "Destination"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Ligne.setGridColor(new java.awt.Color(255, 209, 0));
        Ligne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LigneMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Ligne);

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

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
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
     
        String id = id_ligne.getText();
        String ori = origine.getText();
        String des = destination.getText();
        String tar = tarif.getText();
        if(!id.isEmpty() && !ori.isEmpty() && !des.isEmpty() && !tar.isEmpty()){
            try{
             Connection c = Dashsql.connection();
             Dashsql.ajouter_ligne(c, id, ori, des, tar);
            JOptionPane.showMessageDialog(null, "ligne "+id_ligne.getText()+" est enregistrer");
            updatetab();
            id_ligne.setText("");
            origine.setText("");
            destination.setText("");
            tarif.setText("");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error");
        }
        
        }else{
            JOptionPane.showMessageDialog(null, "remplir tous les champs");
        }
        
        
     
        
        
       
    }//GEN-LAST:event_save_btnActionPerformed

    private void origineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_origineActionPerformed

    private void destinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationActionPerformed

    private void tarifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarifActionPerformed

    private void id_ligneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_ligneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_ligneActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        String id = id_ligne.getText();
        String tar = tarif.getText();
        String dep = origine.getText();
        String des = destination.getText();
        if(!id.isEmpty() && !tar.isEmpty() && !dep.isEmpty() && !des.isEmpty()){
            try{
             Connection c = Dashsql.connection();
             String sql = "update ligne set origine='"+dep+"' , destination='"+des+"', tarif='"+tar+"' where id_ligne = "+id+";";
              Statement requete = c.createStatement();
              int R = requete.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "ligne "+id_ligne.getText()+" est mis a jour");
            updatetab();
            id_ligne.setText("");
            tarif.setText("");
            origine.setText("");
            destination.setText("");
            
           
              
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }else{
            JOptionPane.showMessageDialog(null, "remplire tous les champs");
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        String id = id_ligne.getText();
        String tar = tarif.getText();
        String dep = origine.getText();
        String des = destination.getText();
         if(!id.isEmpty() && !tar.isEmpty() && !dep.isEmpty() && !des.isEmpty()){
             try{
             Connection c = Dashsql.connection();
             String sql = "delete from ligne where id_ligne = "+id+";";
              Statement requete = c.createStatement();
              int R = requete.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Ligne "+id+" est supprimer");
            updatetab();
            id_ligne.setText("");
            tarif.setText("");
            origine.setText("");
            tarif.setText("");
            
           
              
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         }else{
             JOptionPane.showMessageDialog(null, "Sélectionner un quartier.");
         }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void LigneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LigneMouseClicked
         if(Ligne.getSelectedRowCount() == 1){
              update_btn.setVisible(true);
              delete_btn.setVisible(true);
              save_btn.setVisible(false);
          }
        DefaultTableModel tabmodel = (DefaultTableModel) Ligne.getModel();
        
        
        String tablID = tabmodel.getValueAt(Ligne.getSelectedRow(),0).toString();
        String tabltar = tabmodel.getValueAt(Ligne.getSelectedRow(),1).toString();
        String tabldep = tabmodel.getValueAt(Ligne.getSelectedRow(),2).toString();
        String tabldes = tabmodel.getValueAt(Ligne.getSelectedRow(),3).toString();
        
            id_ligne.setText(tablID);
            tarif.setText(tabltar);
            destination.setText(tabldes);
            origine.setText(tabldep);
            
            id_ligne.setEditable(false);
    }//GEN-LAST:event_LigneMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Dashboard.form.TableDark Ligne;
    private Dashboard.component.jBtn delete_btn;
    private Dashboard.component.TextField destination;
    private Dashboard.component.TextField id_ligne;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private Dashboard.component.TextField origine;
    private Dashboard.swing.RoundPanel roundPanel1;
    private Dashboard.swing.RoundPanel roundPanel2;
    private Dashboard.component.jBtn save_btn;
    private Dashboard.component.TextField tarif;
    private Dashboard.component.jBtn update_btn;
    // End of variables declaration//GEN-END:variables
}
