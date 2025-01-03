/*
jji
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bus2;

import Dashboard.swing.scrollbar.ScrollBarCustom;
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
public class station extends javax.swing.JPanel {
private  Connection c;
    /**
     * Creates new form station
     */
    public station() {
        initComponents();
        tableAdmin.setBackground(new Color(255,233,244,10));
        setOpaque(false);
        ScrollBarCustom sb = new ScrollBarCustom();
        sb.setForeground(new Color(51, 51, 51, 100));
        tableAdmin.fixTable(jScrollPane1);
            try{
           Class.forName("com.mysql.jdbc.Driver");
    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus","root","");
        java.sql.ResultSet ab;
            try {
           updatetab(null) ;
            } catch (Exception ex) {
                Logger.getLogger(demande.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(demande.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(demande.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updatetab(String val) throws Exception{
         Connection c = this.c;
           String sql;
         if(val==null || val.isEmpty() || val.trim().isEmpty() || val=="rechercher..." ){
             sql = "SELECT * FROM `stations` "
               
                      + ";";
         }else{
              sql = "SELECT * FROM `stations` where nom_station like '%"+val.trim()+"%' "
                      + " XOR id_ligne = '"+val.trim()+"' "
                      + " XOR idstations = '"+val.trim()+"' "
                      + ";";
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
                   
                
                  
                   columnData.add(rs.getString("idstations"));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAdmin = new Dashboard.form.TableDark();
        val = new Dashboard.component.TextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new Color(0,0,0,128));
        roundPanel1.setOpaque(true);
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "numero station", "nom station", "numero  ligne"
            }
        ));
        jScrollPane1.setViewportView(tableAdmin);

        roundPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 930, 290));

        val.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                valCaretUpdate(evt);
            }
        });
        roundPanel1.add(val, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 200, -1));

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("les stations :");
        roundPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 180, 30));

        jLabel7.setBackground(new java.awt.Color(255, 224, 25));
        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 224, 25));
        jLabel7.setText("recherchez :");
        roundPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 110, 50));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 1020, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void valCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_valCaretUpdate
        // TODO add your handling code here:
         try {
        updatetab(val.getText());
    } catch (Exception ex) {
        Logger.getLogger(ligne.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_valCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private Dashboard.swing.RoundPanel roundPanel1;
    private Dashboard.form.TableDark tableAdmin;
    private Dashboard.component.TextField val;
    // End of variables declaration//GEN-END:variables
}
