/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus2.sqlFun;
import java.util.*;
import java.sql.*;

/**
 *
 * @author mehdi
 */
public class Admin {

   public void  ajouterAdmin(String nom,String prenom,String login,String password,Connection c) throws SQLException{
       
            PreparedStatement exe=c.prepareStatement("INSERT INTO `admin` VALUES (?,?,?,?)");
            exe.setString(1, nom);
            exe.setString(2, prenom);
            exe.setString(3, login);
            exe.setString(4, password);
            exe.executeUpdate();   
           ;
   }
   public void deleteAdmin(int id,Connection c) throws SQLException{
       
       String sql = "DELETE FROM admin WHERE idAdministrateur = ?";
PreparedStatement stmt = c.prepareStatement(sql);
stmt.setInt(1, id);
stmt.executeUpdate();   
   }
    


}
