package CursosService;

import Entidad.Curso;

import java.util.Scanner;

public class CursosService {
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    public String [] cargarAlumnos(){
        String [] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("\nIngrese el nombre del alumno: "+ (i+1));
            alumnos[i] = entrada.next();

        } return alumnos;
    }

    public Curso crearCurso(){

        System.out.println("\nIngrese el nombre del curso: ");
        String nombreCurso = entrada.next();
        entrada.nextLine();
        System.out.println("Ingrese la cantidad de horas por dia: ");
        int cantidadHorasPorDia = entrada.nextInt();
        System.out.println("Ingrese la cantidad de dias por semana: ");
        int cantidadDiasPorSemana = entrada.nextInt();
        System.out.println("Ingrese el turno: ");
        String turno = entrada.next();
        System.out.println("Ingrese el precio por hora: ");
        int precioPorHora = entrada.nextInt();
        String [] alumnos = cargarAlumnos();
        return new Curso(nombreCurso,cantidadHorasPorDia,cantidadDiasPorSemana,turno,precioPorHora,alumnos);
    }

    public int calcularGananciaSemana1(Curso uno){
        return(uno.getCantidadHoraPorDia()* uno.getPrecioPorHora()*5*uno.getCantidadDiasPorSemana());
    }
}
