/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bus2;

import java.awt.Color;

/**
 *
 * @author IGA_BELV
 */
public class client extends javax.swing.JFrame {

    /**
     * Creates new form client
     */
    public client() {
        initComponents();
      //  jPanel1.setOpaque(false);
   //  jPanel1.setBackground(new Color(0, 0, 0, 128));
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        roundPanel1 = new Dashboard.swing.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        roundPanel2 = new Dashboard.swing.RoundPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        roundPanel3 = new Dashboard.swing.RoundPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        roundPanel4 = new Dashboard.swing.RoundPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        roundPanel5 = new Dashboard.swing.RoundPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        roundPanel6 = new Dashboard.swing.RoundPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1077, 542));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new Color(0,0,0,128));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(null);
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.setAlignmentX(1029.0F);
        jLabel4.setAlignmentY(15.0F);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1029, 15, 20, 30));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("bus");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 23, 50, -1));

        jLabel7.setBackground(new java.awt.Color(255, 224, 25));
        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 224, 25));
        jLabel7.setText("medina");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 23, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 70));

        roundPanel1.setBackground(new Color(255,224,25,179));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 224, 25));
        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(159, 161, 159));
        jLabel6.setText("les lignes");
        roundPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 90, -1));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus2/icon/icons8-driveway-60.png"))); // NOI18N
        roundPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 60));

        getContentPane().add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 129, 230, 110));

        roundPanel2.setBackground(new Color(255,224,25,179));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 224, 25));
        jLabel11.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(159, 161, 159));
        jLabel11.setText("les quartiers");
        roundPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 110, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus2/icon/icons8-company-60.png"))); // NOI18N
        roundPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 129, 230, 110));

        roundPanel3.setBackground(new Color(255,224,25,179));
        roundPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 224, 25));
        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(159, 161, 159));
        jLabel10.setText("tarif par ligne");
        roundPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 120, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus2/icon/icons8-driveway-60-price.png"))); // NOI18N
        roundPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(roundPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 315, 230, 110));

        roundPanel4.setBackground(new Color(255,224,25,179));
        roundPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(255, 224, 25));
        jLabel13.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(159, 161, 159));
        jLabel13.setText("nos offres");
        roundPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 110, -1));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus2/icon/icons8-discount-60.png"))); // NOI18N
        roundPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(roundPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 315, 230, 110));

        roundPanel5.setBackground(new Color(255,224,25,179));
        roundPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(255, 224, 25));
        jLabel12.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(159, 161, 159));
        jLabel12.setText("demandez ");
        roundPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 100, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus2/icon/icons8-demand-60.png"))); // NOI18N
        roundPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(roundPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 315, 230, 110));

        roundPanel6.setBackground(new Color(255,224,25,179));
        roundPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 224, 25));
        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(159, 161, 159));
        jLabel9.setText("station ");
        roundPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 90, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus2/icon/icons8-bus-station-60.png"))); // NOI18N
        roundPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(roundPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 129, 230, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus2/icon/mirroir2.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 40, 30));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        setSize(new java.awt.Dimension(1077, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
            System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         for(double i=0.0;i<=1.0;i=i+0.1){
            String val=i+"";
            float f=Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private Dashboard.swing.RoundPanel roundPanel1;
    private Dashboard.swing.RoundPanel roundPanel2;
    private Dashboard.swing.RoundPanel roundPanel3;
    private Dashboard.swing.RoundPanel roundPanel4;
    private Dashboard.swing.RoundPanel roundPanel5;
    private Dashboard.swing.RoundPanel roundPanel6;
    // End of variables declaration//GEN-END:variables
}
