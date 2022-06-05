package clases;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Writing {
    
    //clase para escribir las reservas en un documento de texto llamado "protocoloCovid19.txt" asi como añadirlas al arraylist
    
    FileWriter fich; //inicializamos el FileWriter, necesario para escribir en el fichero

    //metodo que escribe las reservas en un documento de texto asi como en el ArrayList reservas de tipo cliente
    public void escribirReservas(ArrayList<Cliente>reservas,String dni,String nombre,int telefono,String direccion,String correo,int numeroHabitacion,String tipoHabtacion,String tipoCamas,String vip,String garaje){
        //recibe como parametros los datos de la reserva asi como el arraylist donde debe meterlo
        try { //excepcion creada para capturar un posible error relacionado con el fichero o con su contenido.
            //añadimos la reserva al arraylist y, al mismo tiempo, la metemos en un arraylist temporal de tipo cliente llamado listadoReservas
            ArrayList<Cliente>listadoReservas = ArrayMethods.añadirReserva(reservas,dni,nombre,telefono,direccion,correo,numeroHabitacion,tipoHabtacion,tipoCamas,vip,garaje);

            fich = new FileWriter("protocoloCovid19.txt",false); //creamos el fichero, de tal forma que se vayan añadiendo datos a el (no sobreescritura)
            fich.write("REGISTRO DE TODOS LOS CLIENTES: MEDIDA CONTRA EL COVID-19"); //escritura del titulo en el documento ya creado

            for(Cliente cli:listadoReservas){ //recorremos el arraylist listadoReservas
                //escrbimos todos y cada uno de los datos de la reserva, separados de otras reservas mediante separadores
                fich.write("\n──────────────────────────────────────────────────────");
                fich.write("\n⚫ DNI --> "+cli.getDni()+"\n⚫ Nombre --> "+cli.getNombre()+"\n⚫ Telefono --> "+cli.getTelefono()+"\n⚫ Dirección --> "+cli.getDireccion()+"\n⚫ Email --> "+cli.getCorreoElectronico()+"\n⚫ Numero de Habitación --> "+cli.getNumeroHabitacion()+"\n⚫ Tipo de Habitación --> "+cli.getTipoHabitacion()+"\n⚫ Tipo de Camas --> "+cli.getTipoCamas()+"\n⚫ V.I.P. --> "+cli.getVip()+"\n⚫ Garaje --> "+cli.getGaraje()+"\n");
                fich.write("──────────────────────────────────────────────────────");

            }
        } catch (IOException e) {
            System.out.println("Error de escritura 1" + e.getMessage()); //mensaje de error de escritura
        }
        finally {
            try {
                fich.close(); //cerramos el fichero
            } catch (IOException e) {
                System.out.println("Imposible cerrar el archivo"); //mensaje de error al cerrar el archivo
            }
        }
    }
}
