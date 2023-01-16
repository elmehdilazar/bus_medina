/*
jji
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bus2;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mehdi
 */
public class quartier extends javax.swing.JPanel {
private  Connection c;
    /**
     * Creates new form quartier
     */
    public quartier() {
        initComponents();
          try{
           Class.forName("com.mysql.jdbc.Driver");
    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus","root","");
        java.sql.ResultSet ab;
            try {
           updatetab(null) ;
            } catch (Exception ex) {
                Logger.getLogger(demende.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(demende.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(demende.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updatetab(String val) throws Exception{
         Connection c = this.c;
          String sql;
         if(val==null || val.isEmpty() || val.trim().isEmpty() || val=="rechercher..."){
                sql = "SELECT * FROM `quartier` q INNER join stations s on s.idstations=q.stations_idstations INNER JOIN ligne l on l.id_ligne=s.id_ligne;";
         
         }else{
              sql = "SELECT * FROM `quartier` q INNER join stations s on s.idstations=q.stations_idstations INNER JOIN ligne l on l.id_ligne=s.id_ligne where q.nom_quartier like '%"+val.trim()+"%';";
         
         }
       PreparedStatement st = c.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         
         ResultSet rs = st.executeQuery();
         ResultSetMetaData rsData = rs.getMetaData();
         int q = rsData.getColumnCount();
         
         DefaultTableModel RecordTable = (DefaultTableModel) tableAdmin.getModel();
         RecordTable.setRowCount(0);
         while(rs.next()){
             
             Vector columnData = new Vector();
               for(int i = 1;i<= q;i++){
               
                
                   columnData.add(rs.getString("idQuartier"));
                   columnData.add(rs.getString("nom_quartier"));
                   columnData.add(rs.getString("nom_station")); 
                   columnData.add(rs.getString("id_ligne"));
               }
               RecordTable.addRow(columnData);    
       }
       
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
        val = new Dashboard.component.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAdmin = new Dashboard.form.TableDark();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new Color(0,0,0,128));
        roundPanel1.setOpaque(true);
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        val.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        val.setText("rechrehcer...");
        val.setAlignmentX(5.0F);
        val.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                valCaretUpdate(evt);
            }
        });
        val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valActionPerformed(evt);
            }
        });
        roundPanel1.add(val, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 32));

        tableAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "code quartier", "nom du quartier", "nom station", "numero ligne"
            }
        ));
        jScrollPane1.setViewportView(tableAdmin);

        roundPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 650, 320));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 680, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void valActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valActionPerformed

    private void valCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_valCaretUpdate
             try {
        updatetab(val.getText());
    } catch (Exception ex) {
        Logger.getLogger(ligne.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_valCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private Dashboard.swing.RoundPanel roundPanel1;
    private Dashboard.form.TableDark tableAdmin;
    private Dashboard.component.TextField val;
    // End of variables declaration//GEN-END:variables
}
