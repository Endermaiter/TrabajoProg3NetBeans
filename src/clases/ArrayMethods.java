package clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import trabajoProg.MetodosTrabajo;

public class ArrayMethods {
    public static ArrayList<Cliente> añadirReserva(ArrayList<Cliente>reservas, String dni,String nombre,int telefono,String direccion, String correoElectronico,int numeroHabitacion,String tipoHabitacion,String tipoCamas,boolean vip,boolean garaje){
        reservas.add(new Cliente(dni,nombre,telefono,direccion,correoElectronico,numeroHabitacion,tipoHabitacion,tipoCamas,vip,garaje));
        return reservas;
    }

    public static void mostrarReservas(ArrayList<Cliente>reservas){

            JOptionPane.showMessageDialog(null,reservas);

    }

   
    public  static  ArrayList<Cliente>  eliminarReservas(ArrayList<Cliente>reservas){

     String pedirDni= MetodosTrabajo.leerString("Inserte el dni registrado en la reserva  que desea eliminar:");
     for (int i = 0; i<reservas.size();i++){
        if (reservas.get(i).getDni().equals(pedirDni)){
            reservas.remove(i);
            JOptionPane.showMessageDialog(null,"¡Reserva eliminada con éxito!");
        }
        else {
            JOptionPane.showMessageDialog(null,"Este dni no esta registrado en ninguna reserva");
        }
    }
    return reservas;
    }

    public static  ArrayList<Cliente> consultarReservas (ArrayList<Cliente>reservas){
        String pedirDni= MetodosTrabajo.leerString("Inserte el dni registrado en la reserva  que desea consultar:");
        for (int i = 0; i<reservas.size();i++){
            if (reservas.get(i).getDni().equals(pedirDni)){
            JOptionPane.showMessageDialog(null,reservas.get(i));
            }
            else {
            JOptionPane.showMessageDialog(null,"Este dni no esta registrado en ninguna reserva")  ;
             }
        }
        return reservas ;
    }
}
