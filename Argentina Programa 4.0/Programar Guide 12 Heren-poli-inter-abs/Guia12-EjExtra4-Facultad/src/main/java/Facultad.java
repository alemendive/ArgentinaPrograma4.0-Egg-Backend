import entidades.*;
import enumeraciones.Departamento;
import enumeraciones.Seccion;

import java.util.ArrayList;


public class Facultad {
    public static void main(String[] args) {

        ArrayList<Persona> listaPersonas = new ArrayList<>();


        Persona alumno1 = new Estudiante("Juan", "Perez", "12345678", "Soltero", "Matematicas");
        Persona alumno2 = new Estudiante("Maria", "Gonzalez", "87654321", "Casada", "Ingles");
        listaPersonas.add(alumno1);
        listaPersonas.add(alumno2);

        Persona profesor1 = new Profesor("Pedro", "Gomez", "98765432", "Soltero", Departamento.MATEMATICAS);
        Persona profesor2 = new Profesor("Marta", "Rodriguez", "76543210", "Soltero", Departamento.LENGUAJES);
        listaPersonas.add(profesor1);
        listaPersonas.add(profesor2);

        PersonalDeServicio empleado1 = new PersonalDeServicio("Roberto", "Carlos", "12345670", "Casado", Seccion.ADMINISTRATIVO);
        PersonalDeServicio empleado2 = new PersonalDeServicio("Ana", "Gonzalez", "65432109", "Soltera", Seccion.BIBLIOTECA);

        listaPersonas.add(empleado1);
        listaPersonas.add(empleado2);

        alumno1.cambiarEstadoCivil();
        empleado1.trasladarSeccion();
        ((Estudiante) alumno2).matricular();
        ((Profesor) profesor1).cambioDeDepartamento();
        empleado2.trasladarSeccion();

        for (Persona persona : listaPersonas) {
            System.out.println(persona);
            System.out.println(" ");
        }


    }
}