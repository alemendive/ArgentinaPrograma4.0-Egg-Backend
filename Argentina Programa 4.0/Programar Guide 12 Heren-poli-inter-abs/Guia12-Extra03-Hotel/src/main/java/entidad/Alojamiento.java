package entidad;

public class Alojamiento {
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;


    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alojamiento{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
}