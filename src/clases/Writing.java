package clases;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Writing {
    
    FileWriter fich;


    public void escribirReservas(ArrayList<Cliente>reservas,String dni,String nombre,int telefono,String direccion,String correo,int numeroHabitacion,String tipoHabtacion,String tipoCamas,boolean vip,boolean garaje){
        try {
            ArrayList<Cliente>listadoReservas = ArrayMethods.añadirReserva(reservas,dni,nombre,telefono,direccion,correo,numeroHabitacion,tipoHabtacion,tipoCamas,vip,garaje);

            fich = new FileWriter("protocoloCovid19.txt",false);
            fich.write("REGISTRO DE TODOS LOS CLIENTES: MEDIDA CONTRA EL COVID-19");

            for(Cliente cli:listadoReservas){
                fich.write("\n──────────────────────────────────────────────────────");
                fich.write("\n⚫ DNI --> "+cli.getDni()+"\n⚫ Nombre --> "+cli.getNombre()+"\n⚫ Telefono --> "+cli.getTelefono()+"\n⚫ Dirección --> "+cli.getDireccion()+"\n⚫ Email --> "+cli.getCorreoElectronico()+"\n⚫ Numero de Habitación --> "+cli.getNumeroHabitacion()+"\n⚫ Tipo de Habitación --> "+cli.getTipoHabitacion()+"\n⚫ Tipo de Camas --> "+cli.getTipoCamas()+"\n⚫ V.I.P. --> "+cli.isVip()+"\n⚫ Garaje --> "+cli.isGaraje()+"\n");
                fich.write("──────────────────────────────────────────────────────");

            }
        } catch (IOException e) {
            System.out.println("Error de escritura 1" + e.getMessage());
        }
        finally {
            try {
                fich.close();
            } catch (IOException e) {
                System.out.println("Imposible cerrar el archivo");
            }
        }
    }
}
