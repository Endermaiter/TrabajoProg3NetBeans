package clases;

public class Cliente {
    
    //Clase del objeto cliente, donde estan presentados todos sus respectivos atrbutos
    
    //Atributos
    
    private String dni;
    private String nombre;
    private int telefono;
    private String direccion;
    private String correoElectronico;
    private int numeroHabitacion; // solo puede coger una habitacion
    private String tipoHabitacion; //suit, normal o dúplex
    private String tipoCamas; //doble, triple, matrimonio, individual o cama de agua
    private String vip; //como ser booleano daba problemas, es un String. Sin embargo solo tendra dos valores: "Si" y "No"
    private String garaje; //como ser booleano daba problemas, es un String. Sin embargo solo tendra dos valores: "Si" y "No"

    //Constructor sin parámetros
    
    public Cliente (){}

    //Constructor con parámetros
    
    public Cliente(String dni, String nombre, int telefono, String direccion, String correoElectronico, int numeroHabitacion, String tipoHabitacion, String tipoCamas, String vip, String garaje) {
        //Este constructor recibe como parametros todos y cada uno de los atributos antes mencionados
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.tipoCamas = tipoCamas;
        this.vip = vip;
        this.garaje = garaje;
    }

    //getters
    
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public String getTipoCamas() {
        return tipoCamas;
    }

    public String getVip() {
        return vip;
    }

    //setters
    
    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getGaraje() {
        return garaje;
    }

    public void setGaraje(String garaje) {
        this.garaje = garaje;
    }

    //toString del objeto cliente, necesario para mostrarlo dentro de un arraylist posteriormente
    
    @Override
    public String toString() {
        return  "DNI: "+ dni + "  " +
                "Nombre: "+ nombre + "  " +
                "Telefono: "+ telefono + "  " +
                "Dirección: "+ direccion + "  " +
                "Email: "+ correoElectronico + "  " +
                "Numero de Habitación: "+ numeroHabitacion + "  " +
                "Tipo de Habitación: "+ tipoHabitacion + " " +
                "Tipo de camas: "+ tipoCamas + " " +
                "V.I.P.: "+ vip + " " +
                "Garaje: "+ garaje+"\n";

    }
}
