package entidades;


import enumeraciones.Seccion;

import java.util.Scanner;

public class PersonalDeServicio extends Persona {

    protected Seccion seccion;

    Scanner leer = new Scanner(System.in);

    public PersonalDeServicio(String nombre, String apellidos, String DNI, String estadoCivil, Seccion seccion) {
        super(nombre, apellidos, DNI, estadoCivil);
        this.seccion = seccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    //• Traslado de sección de un empleado del personal de servicio.
    public void trasladarSeccion() {
        System.out.println("Ingrese la nueva seccion:");
        this.seccion = Seccion.valueOf(leer.next());
    }

    @Override
    public String toString() {
        return "PersonalDeServicio{" +
                "seccion=" + seccion +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}