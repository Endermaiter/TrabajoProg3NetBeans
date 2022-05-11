package clases;

public class Cliente {
    private String dni;
    private String nombre;
    private int telefono;
    private String direccion;
    private String correoElectronico;
    private int numeroHabitacion; // solo puede coger una habitacion
    private String tipoHabitacion; //suit o normal
    private String tipoCamas; //doble, triple, unitaria...etc
    private boolean vip;
    private boolean garaje;

    public Cliente (){}

    public Cliente(String dni, String nombre, int telefono, String direccion, String correoElectronico, int numeroHabitacion, String tipoHabitacion, String tipoCamas, boolean vip, boolean garaje) {
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

    public boolean isVip() {
        return vip;
    }

    public boolean isGaraje() {
        return garaje;
    }



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
