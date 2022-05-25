/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basededatos;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author David
 */
public class Conexion {
    
    public static final String url = "jdbc:mysql://localhost:3307/trabajoprog";
   public static final String userName = "root";
   public static final String password = "marcosydavid1.";
   
   public static Connection establecerConexionBD(){
       Connection con = null;
       
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = (Connection) DriverManager.getConnection(url,userName,password);
           System.out.println("Conexión Establecida");
       }catch(Exception e){
           System.out.println("e");
       }
       return con;
   }
}
