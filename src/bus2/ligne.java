/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bus2;

import java.awt.Color;
import bus2.sqlFun.*;
import java.io.EOFException;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mehdi
 */
public class ligne extends javax.swing.JPanel {
private  Connection c;
    /**
     * Creates new form ligne
     */
    public ligne() {
        initComponents();
         try{
           Class.forName("com.mysql.jdbc.Driver");
    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus","root","");
        java.sql.ResultSet ab;
            try {
           updatetab() ;
            } catch (Exception ex) {
                Logger.getLogger(demende.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(demende.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(demende.class.getName()).log(Level.SEVERE, null, ex);
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
        jBtn1 = new Dashboard.component.jBtn();
        textField1 = new Dashboard.component.TextField();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new Color(0,0,0,128));
        roundPanel1.setOpaque(true);
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id_ligne", "origine", "destination", "nombre du station"
            }
        ));
        tableAdmin.setOpaque(false);
        jScrollPane1.setViewportView(tableAdmin);

        roundPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 855, 326));

        jBtn1.setText("rechercher");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });
        roundPanel1.add(jBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 140, 40));

        textField1.setText("rechercher...");
        roundPanel1.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 220, 40));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 900, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn1ActionPerformed
public void updatetab() throws Exception{
         Connection c = this.c;
         String sql = "SELECT l.*,COUNT(s.id_ligne) as total FROM `ligne` l inner JOIN stations s on l.id_ligne=s.id_ligne GROUP by s.id_ligne;";
         PreparedStatement st = c.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         
         ResultSet rs = st.executeQuery();
         ResultSetMetaData rsData = rs.getMetaData();
         int q = rsData.getColumnCount();
         
         DefaultTableModel RecordTable = (DefaultTableModel) tableAdmin.getModel();
         RecordTable.setRowCount(0);
         while(rs.next()){
             
             Vector columnData = new Vector();
               for(int i = 1;i<= q;i++){
                   columnData.add(rs.getString("id_ligne"));
                
                   columnData.add(rs.getString("origine"));
                   columnData.add(rs.getString("destination"));
                   columnData.add(rs.getString("total"));
               }
               RecordTable.addRow(columnData);    
       }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Dashboard.component.jBtn jBtn1;
    private javax.swing.JScrollPane jScrollPane1;
    private Dashboard.swing.RoundPanel roundPanel1;
    private Dashboard.form.TableDark tableAdmin;
    private Dashboard.component.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
