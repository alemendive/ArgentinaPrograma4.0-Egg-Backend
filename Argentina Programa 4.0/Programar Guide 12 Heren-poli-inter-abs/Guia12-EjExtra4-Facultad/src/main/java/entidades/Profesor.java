package entidades;


import enumeraciones.Departamento;

import java.util.Scanner;

public class Profesor extends Persona {

    protected Departamento departamento;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public Profesor(String nombre, String apellidos, String DNI, String estadoCivil, Departamento departamento) {
        super(nombre, apellidos, DNI, estadoCivil);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void cambioDeDepartamento() {
        System.out.println("Ingrese el nuevo departamento:");
        this.departamento = Departamento.valueOf(leer.next());
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "departamento=" + departamento +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}

