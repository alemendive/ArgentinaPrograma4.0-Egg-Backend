package entidades;

import java.util.Scanner;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected String DNI;
    protected String estadoCivil;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public Persona(String nombre, String apellidos, String DNI, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil() {
        System.out.println("Ingrese el nuevo estado civil: ");
        String estadoCivil = leer.next();
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI=" + DNI +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}