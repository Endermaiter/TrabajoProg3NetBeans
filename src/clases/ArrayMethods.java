package clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ArrayMethods {
    
    //Clase donde están los métodos que gestionan los ArrayLists
    
    //Método que añade una nueva reserva al ArrayList
    public static ArrayList<Cliente> añadirReserva(ArrayList<Cliente>reservas, String dni,String nombre,int telefono,String direccion, String correoElectronico,int numeroHabitacion,String tipoHabitacion,String tipoCamas,String vip,String garaje){
        //recibe como parámetos los datos que debe añadir al nuevo objeto de tipo cliente asi como el ArrayList en cuestion donde debe añadirlo.
        //Devuelve el array con la inserción completada
        reservas.add(new Cliente(dni,nombre,telefono,direccion,correoElectronico,numeroHabitacion,tipoHabitacion,tipoCamas,vip,garaje)); //Añade un nuevo array de tipo cliente con los parametros dados
        return reservas; //retorna el ArrayList
    }
    //Metodo que muestra las reservas hechas
    public static void mostrarReservas(ArrayList<Cliente>reservas){
        //recibe como parametro el arraylist que debe mostrar
            JOptionPane.showMessageDialog(null,reservas); //lo muestra

    }

   //Metodo que elimina una reserva de un arraylist
    public  static  ArrayList<Cliente>  eliminarReservas(ArrayList<Cliente>reservas){
        //recibe como parámetro el ArrayList en cuestion de tipo cliente donde debe eliminar el obejto
     String pedirDni= JOptionPane.showInputDialog("Inserte el dni registrado en la reserva  que desea eliminar:");//pide el DNI del cliente que queremos eliminar
     for (int i = 0; i<reservas.size();i++){ //recorremos el arraylist para buscar al cliente con ese dni
        if (reservas.get(i).getDni().equals(pedirDni)){ //si existe un DNI que coincida con el dni dado entonces...
            reservas.remove(i); //elimina el cliente del array
            JOptionPane.showMessageDialog(null,"¡Reserva eliminada con éxito!");
        }
        else {
            JOptionPane.showMessageDialog(null,"Este dni no esta registrado en ninguna reserva");//Si no lo encuentra, avisa de que no existe
        }
    }
    return reservas; //retorna el ArrayList
    }

    //Metodo que consulta un cliente registrado dentro del ArrayList
    public static  ArrayList<Cliente> consultarReservas (ArrayList<Cliente>reservas){
        //recibe como parámetro el ArrayList en cuestion de tipo cliente donde debe buscar el cliente
        String pedirDni= JOptionPane.showInputDialog("Inserte el dni registrado en la reserva  que desea consultar:");//pide el DNI del cliente que queremos eliminar
        for (int i = 0; i<reservas.size();i++){ //recorremos el arraylist para buscar al cliente con ese dni
            if (reservas.get(i).getDni().equals(pedirDni)){ //si existe un DNI que coincida con el dni dado entonces...
            JOptionPane.showMessageDialog(null,reservas.get(i)); //mostrar ese cliente en concreto, abarcando todos sus datos
            }
            else {
            JOptionPane.showMessageDialog(null,"Este dni no esta registrado en ninguna reserva")  ;//Si no, te avisa de que no ha encontrado ninguno
             }
        }
        return reservas ; //retorna el ArrayList
    }
}
