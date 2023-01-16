
package Dashboard.main;

import Dashboard.event.EventMenu;
import Dashboard.form.Abonnement_form;
import Dashboard.form.quartier_form;
import Dashboard.form.Form;
import Dashboard.form.Ligne_form;
import Dashboard.form.Main_form;
import Dashboard.form.Parameter_form;
import Dashboard.form.Station_from;
import Dashboard.form.user_form;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class main_dashboard extends javax.swing.JFrame {

    public static int id;
    public main_dashboard(int id)throws Exception {
        initComponents();
        EventMenu event;
        this.id=id;
        System.out.println(this.id);
        event = new EventMenu() {
            @Override
            public void selected(int index) throws Exception {
                
                switch (index) {
                    case 0:
                        showForm(new Main_form());
                        break;
                    case 1:
                        showForm(new Station_from());
                        break;
                    case 2:
                        showForm(new quartier_form());
                        break;
                    case 3:
                        showForm(new Ligne_form(main_dashboard.id));
                        break;
                    case 4:
                        showForm(new Abonnement_form());
                        break;
                    case 5:
                        showForm(new Parameter_form());
                        break;
                    case 6:
                        showForm(new user_form(main_dashboard.id));
                        
                        break;
                    case 8:
                        System.out.println("Logout");
                       dispose();
                       bus2.client newFrame = new bus2.client();
                       newFrame.setVisible(true); 
                        break;
                    default:
                        showForm(new Form(index));
                        break;
                }
            }
        };
        menu1.initMenu(event);
        simpleTitleBar1.init(this);
        showForm(new Main_form());
    }
    
    private void showForm(Component com) {
        jPanel1.removeAll();
        jPanel1.add(com);
        jPanel1.revalidate();
        jPanel1.repaint();
    }
    private void closefrmae(){
        dispose();
    }
  
    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new Dashboard.swing.RoundPanel();
        menu1 = new Dashboard.component.Menu();
        jPanel1 = new javax.swing.JPanel();
        simpleTitleBar1 = new Dashboard.titleBar.SimpleTitleBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 245, 245));
        setName("background"); // NOI18N
        setUndecorated(true);

        roundPanel1.setBackground(new java.awt.Color(21, 21, 21));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(simpleTitleBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE)
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(simpleTitleBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    public static void main(String args[]) {
     
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new main_dashboard(-1).setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(main_dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private Dashboard.component.Menu menu1;
    private Dashboard.swing.RoundPanel roundPanel1;
    private Dashboard.titleBar.SimpleTitleBar simpleTitleBar1;
    // End of variables declaration//GEN-END:variables
}
