/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dashboard.form;
import java.sql.*;
import java.time.LocalDate;

/**
 *
 * @author mehdi
 */
public  class Dashsql {
    
    
    
    public static Connection connection() throws Exception{
        Connection c;
        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus", "root", "");
        
        return c;
    }
    static void  ajouterAdmin(Connection c,String id,String nom,String prenom,String login,String password) throws SQLException{
       
            PreparedStatement exe=c.prepareStatement("INSERT INTO `admin` VALUES (?,?,?,?,?)");
            exe.setString(1,id);
            exe.setString(2, nom);
            exe.setString(3, prenom);
            exe.setString(4, login);
            exe.setString(5, password);
            exe.executeUpdate();   
           
   }
    public static void ajouter_ligne(Connection c,String id_ligne,String origine,String destination,String tarif) throws Exception{
           String sql = "insert into ligne(id_ligne,origine,destination,tarif) values (?,?,?,?)";  
            PreparedStatement  st = c.prepareStatement(sql);
            st.setString(1,id_ligne);
            st.setString(2,origine);
            st.setString(3,destination);
            st.setString(4,tarif);
             
            st.executeUpdate();
            c.close();
    }

public static void ajouter_quartier(Connection c,String id_quartier,String nom_quartier,String id_station) throws SQLException{
      PreparedStatement req = c.prepareStatement("INSERT INTO quartier VALUES(?,?,?)");
   req.setString(1, id_quartier);
   req.setString(2, nom_quartier);
    req.setString(3,id_station);
     req.executeUpdate();
    
}

public static void ajout_station(Connection c,String id_station , String nom_station,String id_ligne) throws SQLException
{
    PreparedStatement req = c.prepareStatement("INSERT INTO stations VALUES(?,?,?)");
   req.setString(1, id_station);
   req.setString(3, nom_station);
    req.setString(2,id_ligne);
     req.executeUpdate();
     

}
public static void ajouter_abonne(Connection c, String id_abonnement, String type_abonnement, String id_ligne) throws SQLException{
    PreparedStatement req = c.prepareStatement("INSERT INTO abonnement VALUES(?,?,?)");
    req.setString(1, id_abonnement);  
    req.setString(2, type_abonnement);
    req.setString(3, id_ligne);
    req.executeUpdate();
}

    

  


      
       
       


       
       
}
            
          
      

   





