package Service;

import Entidad.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {


    public void crearAlumnos(ArrayList<Alumno> alumnos) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String rpta;

        do {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = sc.next();
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.println("Ingrese las notas del alumno");
            for (int i = 0; i < 3; i++) {
                notas.add(sc.nextInt());
            }
            Alumno alumno = new Alumno(nombre, notas);
            alumnos.add(alumno);
            System.out.println("Desea agregar otro alumno? S/N");
            rpta = sc.next();
        } while (rpta.equalsIgnoreCase("s"));
    }

    public void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        for (Alumno elemento : alumnos) {
            System.out.println(elemento);
        }
    }

    public void notaFinal(ArrayList<Alumno> alumnos) {
        System.out.println("Ingrese el nombre del alumno a obtener promedio: ");
        Scanner leer = new Scanner(System.in);
        String nombre = leer.nextLine();
        int promedio = 0;
        boolean encontrado = false;
        for (Alumno elemento : alumnos) {
            if (elemento.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                for (int nota : elemento.getNotas()) {
                    promedio += nota;
                }
                System.out.println("El promedio del alumno es: " + promedio / 3);
            }
        }
        if (!encontrado) {
            System.out.println("El alumno no existe");
        }

    }

    public void eliminarAlumno(ArrayList<Alumno> alumnos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno a eliminar:");
        String nombre = sc.next();
        boolean encontrado = false;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                alumnos.remove(i);
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Alumno eliminado!");
        } else {
            System.out.println("No existe el alumno!!!");
        }
    }

    public void modificarAlumno(ArrayList<Alumno> alumnos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno a modificar:");
        String nombre = sc.nextLine();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Nuevo nombre es:");
                String nuevoNombre = sc.nextLine();
                alumnos.get(i).setNombre(nuevoNombre);
            }
        }
    }
}





