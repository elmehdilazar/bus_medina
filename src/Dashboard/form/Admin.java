/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus2.sqlFun;
import java.util.*;
import java.sql.*;
import java.time.LocalDate;
import java.sql.Date;

/**
 *
 * @author mehdi
 */
public class Admin {

  /* public void  ajouterAdmin(String nom,String prenom,String login,String password,Connection c) throws SQLException{
       
            PreparedStatement exe=c.prepareStatement("INSERT INTO `admin` VALUES (?,?,?,?)");
            exe.setString(1, nom);
            exe.setString(2, prenom);
            exe.setString(3, login);
            exe.setString(4, password);
            exe.executeUpdate();   
           
   }
   public void deleteAdmin(int id,Connection c) throws SQLException{
       
       String sql = "DELETE FROM admin WHERE idAdministrateur = ?";
PreparedStatement stmt = c.prepareStatement(sql);
stmt.setInt(1, id);
stmt.executeUpdate();   
   }*/
  
 /**
 *r
 * fgdjfdjgio
 */ 
    
   public static int admin_connection(Connection c, String login,String pass) throws SQLException{
        Statement stament= c.createStatement();
        int id=-1;
            ResultSet resultat= stament.executeQuery("SELECT * FROM admin WHERE login_admin like '"+login+"' and pass_admin like '"+pass+"' ");  
         while(resultat.next()){
            id=  resultat.getInt(1);
                
            }
         return id;
    }
    
        
    
    // *************Partie ligne************************
    
    //afichage de ligne
       static void affiche_ligne(Connection c) throws Exception{
          Statement stament= c.createStatement();
            ResultSet resultat= stament.executeQuery("SELECT * FROM ligne");
          
            
            while(resultat.next()){
                System.out.println(resultat.getString(2)+" "+resultat.getString(3)+" "+resultat.getString(4)+" "+resultat.getFloat(5));
                
            }
    }
       //recherche ligne
       static void cherche_ligne(Connection c, String nom) throws Exception{
            Statement stament= c.createStatement();
            ResultSet resultat= stament.executeQuery("SELECT * FROM ligne WHERE nom_ligne like '"+nom+"'");
            if(resultat.absolute(1))
           
            System.out.println(resultat.getString(2)+" "+resultat.getString(3)+" "+resultat.getString(4)+" "+resultat.getFloat(5));
                
            else
                System.out.println("ligne introuvable");
           
       }
       
      static void modier_ligne(Connection c,String origine,String destination,String name_ligne) throws SQLException{
           
        String sql="UPDATE ligne SET origine='"+origine+"',destination='"+destination+"' WHERE nom_ligne like '"+name_ligne+"'";
                Statement requete = c.createStatement();
                requete.executeUpdate(sql);   
       }
       // pas teste
       static void ajouter_ligne(Connection c,int id_ligne,String nom_ligne,String source,String destination,Float prix) throws SQLException{
           PreparedStatement req = c.prepareStatement("INSERT INTO quartier VALUES(?,?,?,?)");
        req.setInt(1, id_ligne);
        req.setString(2, nom_ligne);
        req.setString(3, source);
        req.setString(4, destination);
        req.setFloat(5, prix);
        
        req.executeUpdate();
    
           
           
       }
       
    // parcous des ligne
       static void parcours_par_ligne(Connection c )throws Exception{
       String sql="SELECT nom_ligne,nom_station from ligne,stations WHERE ligne.id_ligne= stations.id_ligne ORDER BY(ligne.nom_ligne)";
             Statement requete = c.createStatement();
        ResultSet R = requete.executeQuery(sql);
         String codePrecedent="xxx",codeActuel="";
        while(R.next()){
            codeActuel=R.getString(1);
             if(codeActuel.compareTo(codePrecedent)!=0)
                System.out.println(codeActuel);
              System.out.println(R.getString(2));
                codePrecedent= codeActuel;
             
                
            }
            
       }
       //suppretion de ligne avec toute ses stations 
       static void supprimer_ligne(Connection c ,int id)throws Exception{
           String sql="DELETE from ligne,stations WHERE  ligne.id_ligne=stations.id_ligne="+id;
                Statement requete = c.createStatement();
                requete.executeUpdate(sql);
           
           
       }
       
       
       
       
       
      //* *******Partie quartier *********************** 
    
static void afficher_quartier(Connection c)throws Exception{
     Statement stament= c.createStatement();
            ResultSet resultat= stament.executeQuery("SELECT * FROM quartier");
             while(resultat.next()){
                System.out.println(resultat.getInt(1)+" "+resultat.getString(2));
                
            }
    
}


static void quartier_avec_ses_stations(Connection c) throws SQLException{
     Statement requete = c.createStatement();
     String sql="SELECT nom_quartier,nom_station from quartier,stations WHERE quartier.stations_idstations=stations.idstations ORDER BY(nom_quartier)";
            
        ResultSet R = requete.executeQuery(sql);
         String codePrecedent="xxx",codeActuel="";
        while(R.next()){
            codeActuel=R.getString(1);
             if(codeActuel.compareTo(codePrecedent)!=0)
                System.out.println(codeActuel+"-->");
              System.out.println(R.getString(2));
                codePrecedent= codeActuel;
             
                
            }
    
}
   static void cherche_quartier(Connection c, String nom) throws Exception{
            Statement stament= c.createStatement();
            ResultSet resultat= stament.executeQuery("SELECT * FROM quartier WHERE nom_quartier like '"+nom+"'");
            if(resultat.absolute(1))
           
              
                System.out.println(resultat.getInt(1)+" "+resultat.getString(2));
                
                
            else
                System.out.println("ligne introuvable");
           
       }

static void ajouter_quartier(Connection c,int id,String name) throws SQLException{
       PreparedStatement req = c.prepareStatement("INSERT INTO quartier VALUES(?,?)");
        req.setInt(1, id);  req.setString(2, name);
        
        req.executeUpdate();
    
}

//suppretion de quartier  avec toutes les stations de meme quartier
static void suppretion_quartier(Connection c,String nom) throws SQLException{
      Statement stament= c.createStatement();
            ResultSet resultat= stament.executeQuery("SELECT * FROM quartier WHERE nom_quartier like '"+nom+"'");
           int f = 0;
          
         if(resultat.absolute(1))      
     f=resultat.getInt(3);
         
    System.out.println("ddddd:"+f);
    
   
    
    String sql1="DELETE from quartier where nom_quartier like '"+nom+"'";
                
                stament.executeUpdate(sql1);
     String sql3="DELETE from stations where idstations="+f;
                
                stament.executeUpdate(sql3);
    
}

// ********Patie des stations******************
static void tous_station(Connection c) throws SQLException{
      Statement stament= c.createStatement();
            ResultSet resultat= stament.executeQuery("SELECT * FROM stations");
          
            
            while(resultat.next()){
                System.out.println(resultat.getInt(1)+""+ resultat.getString(3)+" "+resultat.getInt(2)
                );
                
                
            }
    
    
}

static void ajout_station(Connection c, int id_ligne, String nom_station,int id_quartier,int id_station) throws SQLException
{
   
    int b=0;
       Statement stamentt= c.createStatement();
           
            ResultSet resultat=stamentt.executeQuery("SELECT * FROM ligne WHERE id_ligne ="+id_ligne);
           
            if(resultat.absolute(1))
           
              b=1;
                      
       
    
      if(b==1)
      { 
         
    PreparedStatement req = c.prepareStatement("INSERT INTO stations VALUES(?,?,?)");
   req.setInt(1, id_station);
   req.setString(3, nom_station);
    req.setInt(2,id_ligne);
     req.executeUpdate();
     
   
       
      
        
        System.out.println("ajout effectué!!!");
      }
      else{
          
              System.out.println("echec d'ajout de stations");
      }

}
static void suppretion_station(Connection c,int id) throws SQLException{
     String sql="DELETE from station where idstations="+id;
                Statement requete = c.createStatement();
                requete.executeUpdate(sql);
}


static void recherche_station(Connection c, String nom_station) throws SQLException{
    int l=0;
   
     Statement stament= c.createStatement();
            ResultSet resultat= stament.executeQuery("SELECT * FROM stations WHERE nom_station like '"+nom_station+"'");
           
           if(resultat.absolute(1)){
          
            l= resultat.getInt(2);
            
               // System.out.println(resultat.getInt(1)+""+ resultat.getString(3)+" "+resultat.getInt(2));
                 String sql="SELECT nom_station from ligne,stations WHERE ligne.id_ligne=stations.id_ligne and ligne.id_ligne="+l;
             Statement requete = c.createStatement();
        ResultSet R = requete.executeQuery(sql);
         System.out.println("autres Stations de la ligne");
        while(R.next()){
           
               
              System.out.println(R.getString(1));
              
            }
    //parcous dans lequel se trouve la station
    //quartier de la station
    //informations stations

}

}

/* partie abonement */

      public static ResultSet affiche_abonement(Connection c) throws Exception{
          Statement stament= c.createStatement();
            ResultSet resultat= stament.executeQuery("SELECT * FROM abonnement");
          
            
          /*  while(resultat.next()){
                System.out.println(resultat.getInt(1)+" "+resultat.getDate(2)+" "+resultat.getDate(3)+" "+resultat.getString(4)+" "+resultat.getString(5));
                
            }*/
          return resultat;
    }
      
      
      static void cherche_abonnement(Connection c, String name) throws SQLException{
            Statement stament= c.createStatement();
            ResultSet resultat= stament.executeQuery("SELECT * FROM abonnement WHERE id_client like '"+name+"'");
            if(resultat.absolute(1))
           
              
                  System.out.println(resultat.getInt(1)+" "+resultat.getDate(2)+" "+resultat.getDate(3)+" "+resultat.getString(4)+" "+resultat.getString(5));
                
                
          
      }
      
      
      
      /*partie personne */
      static ResultSet afficher_personne(Connection c) throws SQLException{
           Statement stament= c.createStatement();
            ResultSet resultat= stament.executeQuery("SELECT * FROM personne");
          
            
           /* while(resultat.next()){
                System.out.println(resultat.getString(1)+" "+
                        resultat.getString(2)+" "+
                        resultat.getString(3)+" "+
                        resultat.getInt(4)+" "+
                        resultat.getString(5)+" "+
                        resultat.getString(6)+" "+resultat.getDate(7));
                
            }*/
           return resultat;
      }
      
         static void cherche_personne(Connection c, String cin) throws SQLException{
            Statement stament= c.createStatement();
            ResultSet resultat= stament.executeQuery("SELECT * FROM personne WHERE CIN_PERSONNE like '"+cin+"'");
            if(resultat.absolute(1))
           
              
                  System.out.println(resultat.getInt(1)+" "+resultat.getString(2)+" "+resultat.getString(3)+" "+resultat.getInt(4)+" "+resultat.getString(5)+" "+resultat.getString(6)+" "+resultat.getDate(7)+" ");
                
                
          
      }
       static void suppretion_personne_abonnement(Connection c,String cin) throws SQLException{
     String sql="DELETE from personne where CIN_PERSONNE like '"+cin+"'";
                Statement requete = c.createStatement();
                requete.executeUpdate(sql);
}
      
      public static void ajouter_personne(Connection c, String cin,LocalDate d,int num, String adresse,String nom,String prenom,String mail,int id_abon)  throws SQLException{
         
           Date d1= Date.valueOf(d);
           
           PreparedStatement req = c.prepareStatement("INSERT INTO personne VALUES(?,?,?,?,?,?,?,?)");
        req.setString(1, cin);  req.setString(2, nom);req.setString(3, prenom);req.setInt(4, num);req.setString(5,adresse);
        req.setString(6, mail);req.setDate(7, d1); req.setInt(8, id_abon);
        
        
        
        req.executeUpdate();
    
           
       }
       
       
       
       /* Partie abonemment*/
        static void supprimer_abonnement(Connection c, int cin) throws SQLException{
            String sql="DELETE from abonemment where id_abonnemt="+cin;
                Statement requete = c.createStatement();
                requete.executeUpdate(sql);
           
       }
       static void personne_sans_abonnement(Connection c) throws SQLException{
            
                Statement stament = c.createStatement();
                ResultSet resultat= stament.executeQuery("select * from personne where id_abonnement <"+0);
                
                while(resultat.next()){
                System.out.println(resultat.getString(1)+" "+resultat.getString(2)+" "+resultat.getString(3)+" "+resultat.getInt(4)+" "+resultat.getString(5)+" "+resultat.getString(6)+" "+resultat.getDate(7));
                
            }
           
       }
       
       
       
       static void attribuer_abonnement_personne(Connection c, String cin,int id_abonnement,LocalDate date_debut,LocalDate date_fin,String type_abonnement,int id_ligne) throws SQLException{
          int a=0,b=0;
           
           Statement stament= c.createStatement();
            ResultSet resultat= stament.executeQuery("SELECT * FROM personne WHERE CIN_PERSONNE like '"+cin+"'");
            if(resultat.absolute(1))
                a=1;
               
                
             ResultSet resultat1= stament.executeQuery("SELECT * FROM ligne WHERE id_ligne ="+id_ligne); 
             if(resultat1.absolute(1))
                b=1;
             
             
             if(a==1&&b==1)
             {
                
                  
                ResultSet req2=stament.executeQuery("SELECT * FROM abonnement WHERE id_client like '"+cin+"'");
                 if(req2.absolute(1)){
                      System.out.println("Client deja abonné!!!");
                   
                 }else{
                      PreparedStatement req = c.prepareStatement("INSERT INTO abonnement VALUES(?,?,?,?,?,?)");
                      req.setInt(1, id_abonnement);  req.setDate(2, Date.valueOf(date_debut)); req.setDate(3, Date.valueOf(date_fin));
                       req.setString(4, type_abonnement);
                       req.setString(5, cin);
                       req.setInt(6, id_ligne);
                       req.executeUpdate();
                       
                       String slq="UPDATE personne SET id_abonnement="+id_abonnement;
                       Statement reque = c.createStatement();
                reque.executeUpdate(slq);
        
                     
                     System.out.println("abonnement effectué");
                 }
                      
                     
                
            } else
                System.out.println("Impossible d'effectuer un abonnement!!!");
           
           
       }
}
            
          
      

    






