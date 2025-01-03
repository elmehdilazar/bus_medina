/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Dashboard.component;

import Dashboard.event.EventMenu;
import Dashboard.swing.ButtonMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author BRAVO
 */
public class Menu extends javax.swing.JPanel {
private EventMenu event;

    public Menu() {
        initComponents();
        setOpaque(false);
        
        panelMenu.setLayout(new MigLayout("wrap, fillx, inset 3", "[fill]", "[]0[]"));
    }

    public void initMenu(EventMenu event) {
       this.event = event;
        addMenu(new ImageIcon(getClass().getResource("/bus2/icon/dashboardIcons/dash.png")), "Dashboard", 0);
        addMenu(new ImageIcon(getClass().getResource("/bus2/icon/dashboardIcons/station.png")), "Station", 1);
        addMenu(new ImageIcon(getClass().getResource("/bus2/icon/dashboardIcons/quartier.png")), "Quartier", 2);
        addMenu(new ImageIcon(getClass().getResource("/bus2/icon/dashboardIcons/ligne.png")), "Ligne", 3);
        addMenu(new ImageIcon(getClass().getResource("/bus2/icon/dashboardIcons/abonne.png")), "Abonement", 4);
        addMenu(new ImageIcon(getClass().getResource("/bus2/icon/dashboardIcons/setting.png")), "Parameter", 5);
        addMenu(new ImageIcon(getClass().getResource("/bus2/icon/icons8-user-20.png")), "Utilisateur", 6);
        addEmpty();
        addMenu(new ImageIcon(getClass().getResource("/bus2/icon/dashboardIcons/logout.png")), "se deconnecter", 8);
        
    }

    private void addEmpty() {
        panelMenu.add(new JLabel(), "push");
    }

    private void addMenu(Icon icon, String text, int index){
        ButtonMenu menu = new ButtonMenu();
        menu.setIcon(icon);
        menu.setText("  " + text);
        panelMenu.add(menu);
       menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                try {
                    event.selected(index);
                    setSelected(menu);
                } catch (Exception ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void setSelected(ButtonMenu menu) {
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof ButtonMenu) {
                ButtonMenu b = (ButtonMenu) com;
                b.setSelected(false);
            }
        }
        menu.setSelected(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo_container = new Dashboard.swing.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        leftside = new Dashboard.swing.RoundPanel();
        panelMenu = new javax.swing.JPanel();

        setBackground(new java.awt.Color(21, 21, 21));

        logo_container.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus2/icon/Logo-casabus (2).png"))); // NOI18N

        javax.swing.GroupLayout logo_containerLayout = new javax.swing.GroupLayout(logo_container);
        logo_container.setLayout(logo_containerLayout);
        logo_containerLayout.setHorizontalGroup(
            logo_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo_containerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logo_containerLayout.setVerticalGroup(
            logo_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo_containerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        leftside.setBackground(new java.awt.Color(51, 51, 51));

        panelMenu.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout leftsideLayout = new javax.swing.GroupLayout(leftside);
        leftside.setLayout(leftsideLayout);
        leftsideLayout.setHorizontalGroup(
            leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftsideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        leftsideLayout.setVerticalGroup(
            leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftsideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftside, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logo_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftside, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private Dashboard.swing.RoundPanel leftside;
    private Dashboard.swing.RoundPanel logo_container;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
