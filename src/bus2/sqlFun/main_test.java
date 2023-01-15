/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus2.sqlFun;

import java.sql.*;

import java.time.LocalDate;

/**
 *
 * @author hpk
 */
public class main_test {
    public static void main(String[] args) {
    
     try{
         Class.forName("com.mysql.jdbc.Driver");
    Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/bus","root","");
// Admin.admin_connection(c, "mehdi", "0000");
 
//Admin.affiche_ligne(c);
 //Admin.parcours_par_ligne(c);
  //Admin.cherche_ligne(c,"dsdddd");
 // *Admin.supprimer_ligne(c, 1);
 //Admin.modier_ligne(c, "Moulay Youssef", "Marjane","ligne_2");
  
  
  //Admin.afficher_quartier(c);
  //Admin.quartier_avec_ses_stations(c);
  //Admin.cherche_quartier(c, "Ain Sbaa");
  //Admin.suppretion_quartier(c, "maarif");

 

// Admin.tous_station(c);
 //Admin.ajout_station(c, 3, "Maarouf", 2, 10);
 //
 //Admin.recherche_station(c, "Apaei");
 

 
 
 ResultSet ab=
 Admin.affiche_abonement(c);
        while(ab.next()){
            
                    //comboBoxSuggestion1.addItem(ab.getString(4)+"-"+ab.getString(1));
                    System.out.println(ab.getString(4)+"-"+ab.getString(1));
        }
 //Admin.cherche_abonnement(c, "a1");
 //Admin.attribuer_abonnement_personne(c, "elmehdi", 0, LocalDate.now(), LocalDate.now(), "travail", 1);
 
 //Admin.afficher_personne(c);
 //Admin.suppretion_personne_abonnement(c, "wague");
 //Admin.ajouter_personne(c, "elmehdi",LocalDate.now(),07234576,"Casablanca", "wahe", "adnane", "adnane@gmail.com");
 //sssAdmin.cherche_abonnement(c, "a1");
 
 
 
 
}catch(Exception e){
    e.printStackTrace();
}
    }
            
        
           
           
           
         
            
        
    
}
