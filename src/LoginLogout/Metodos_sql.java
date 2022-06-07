/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginLogout;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import libreriatrabajoprog.Libreria;


public class Metodos_sql {
    /* Esta clase sirve para añadir  el registro a la base de datos y para iniciar sesion 
     solo con los usuarios que esten registrados en la base de datos */
    
    
    
    
    public static PreparedStatement sentencia_preparada; //Declaracion de la instruccion
    public static ResultSet resultado;  // Declaracion del resultado 
 
    // Metodo que guarda el registro de los datos en la base de datos
    public int guardar(String nombre, String apellidos, String correo, String contraseña){
        // Le das al metodo los datos mediante parametros, para que los guarde en la base de datos. Devuelve un int que, mas adelante cuando se llame al metodo, se comrpueba.
        int resultado =0; //  Declaracion de una variable llamada resultado.
        //Instruccion de la insercion en la base de datos
        String insert = "INSERT INTO usuarios(nombre,apellidos,correo,contraseña) VALUES(?,?,?,?)";
        
        try {
            sentencia_preparada = (PreparedStatement) Libreria.getInstance().establecerConexionBD().prepareStatement(insert); // Enviamos la instruccion
            //le proporcionamos los datos a la instruccion.
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellidos);
            sentencia_preparada.setString(3, correo);
            sentencia_preparada.setString(4, contraseña);
            
            resultado = sentencia_preparada.executeUpdate(); // Ejecutamos la instruccion
            sentencia_preparada.close(); // Cerramos la conexion
            Libreria.getInstance().establecerConexionBD().close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return resultado;  // Si la instruccion se ejecuto bien el metodo devuelve un "1"
    }
        // Metodo que comprueba si el usuario esta en la base de datos
    
    public String LogIn(String correo, String contraseña){
        // Le damos al metodo el correo y la contraseña para que compruebe si esta en la base de datos. 
        //Devuelve diferentes Strings segun si se encontro o no
        String busquedaUsuario = null; // Inicializacion del String de comprobacion
        try{
            //Instruccion de seleccionar una persona segun correo y contraseña.
            String buscarUsuario = ("SELECT nombre, correo, contraseña FROM usuarios WHERE correo ='"+correo+"' && contraseña = '"+contraseña+"'");
            
            sentencia_preparada = (PreparedStatement) Libreria.getInstance().establecerConexionBD().prepareStatement(buscarUsuario); // Enviamos la instruccion
            resultado = sentencia_preparada.executeQuery(); //Ejecutamos la Instruccion
            if(resultado.next()){ //si encuentra un usuario entonces....
                busquedaUsuario = "usuario encontrado";  //Asignamos "usuario encontrado" a busquedaUsuario
            }else{
                busquedaUsuario = "usuario no encontrado"; //Asignamos  "usuario no encontrado" a busquedaUsuario
            }
            Libreria.getInstance().establecerConexionBD().close();// Cerramos conexion
        }catch(Exception ex){
            System.out.println(ex);
        }
        return busquedaUsuario; // Retornamos el String que sera diferente segun si se ha encontrado o no 
    }
}
