import Entidad.Alumno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        Scanner leer = new Scanner(System.in);

        boolean programaActivo = true;

        do{
        System.out.println("Que operación quieres hacer?");
        System.out.println("1 - Insertar un alumno");
        System.out.println("2 - Eliminar un alumno");
        System.out.println("3 - Modificar un alumno");
        System.out.println("4 - Consultar alumnos");
        System.out.println("5 - Salir");

        int opcion = leer.nextInt();

        if(opcion == 1) {
            System.out.println("Introduce el nombre del alumno");
            String nombre = leer.next();
            System.out.println("Introduce la edad del alumno");
            int edad = leer.nextInt();
            Alumno a = new Alumno();
            a.setNombre(nombre);
            a.setEdad(edad);
            alumnos.add(a);
        } else if(opcion == 2) {
            System.out.println("Introduce el nombre del alumno que quieres eliminar");
            String nombre = leer.next();
            Iterator<Alumno> it = alumnos.iterator();

            while(it.hasNext()) {
                Alumno a = it.next();
                if(a.getNombre().equals(nombre)) {
                    it.remove();
                }
        }
        } else if(opcion == 3) {

            System.out.println("Introduce el nombre del alumno que quieres modificar");
            String nombre = leer.next();

            System.out.println("Introduce el nuevo nombre de este alumno");
            String nuevoNombre = leer.next();
            System.out.println("Introduce la nueva edad de este alumno");
            int nuevaEdad = leer.nextInt();
            Iterator<Alumno> it = alumnos.iterator();

            while(it.hasNext()) {
                Alumno a = it.next();
                if(a.getNombre().equals(nombre)) {
                    a.setNombre(nuevoNombre);
                    a.setEdad(nuevaEdad);
                }
        }

        } else if (opcion == 4) {
            for (Alumno a: alumnos) {
                System.out.println("Nombre: " + a.getNombre() + ", Edad: " + a.getEdad());
            }
        } else if(opcion == 5) {
            programaActivo = false;
            System.out.println("Programa finalizado");
        } else {
            System.out.println("No elegiste correctamente");
        }
        }while (programaActivo);
    }
}
