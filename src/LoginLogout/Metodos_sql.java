/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginLogout;
import basededatos.Conexion;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import libreriatrabajoprog.Libreria;


public class Metodos_sql {
    
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String nombre, String apellidos, String correo, String contraseña){
        int resultado =0;
        Connection conexion = null;
        String insert = "INSERT INTO usuarios(nombre,apellidos,correo,contraseña) VALUES(?,?,?,?)";
        
        conexion = Libreria.establecerConexionBD();
        try {
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(insert);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellidos);
            sentencia_preparada.setString(3, correo);
            sentencia_preparada.setString(4, contraseña);
            
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return resultado;
    }
       
    public String LogIn(String correo, String contraseña){
        String busquedaUsuario = null;
        Connection conexion = null;
        try{
            conexion = Libreria.establecerConexionBD();
            String buscarUsuario = ("SELECT nombre, correo, contraseña FROM usuarios WHERE correo ='"+correo+"' && contraseña = '"+contraseña+"'");
            sentencia_preparada = (PreparedStatement) conexion.prepareStatement(buscarUsuario);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                busquedaUsuario = "usuario encontrado";  
            }else{
                busquedaUsuario = "usuario no encontrado";
            }
            conexion.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
        return busquedaUsuario;
    }
}
