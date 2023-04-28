package Equipo;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

/*
Ejercicio 10: Crear un programa para simular un equipo de futbol(futbolista,entrenador y doctor),
para la cual tendremos lo siguiente:
1) Una super clase Persona, que tendra los siguientes datos: nombre, apellido, edad.
2) La sub clase Futbolista tendra los siguientes datos: dorsal y posicion.
3) La sub clase Entrenador tendra de dato la estrategia que utiliza.
4) La sub clase Doctor, la titulacion y los años de experiencia.
Hacer un menu donde se tengan las siguientes opciones:
Viaje de equipo, entrenamiento, partido de futbol, planificar entrenamiento, entrevista, curar lesion.
 */
public class main {
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Scanner entrada = new Scanner(System.in);

    static Persona futbolista1 = new Futbolista("Lionel","Messi",35,10,"Delantero");
    static Persona futbolista2 = new Futbolista("Emiliano","Martinez",27,23,"Arquero");
    static Persona entrenador = new Entrenador("Lionel", "Scaloni",37,"Ofensiva");
    static Persona doctor = new Doctor("Alex", "Stiusso",45,"Licenciado en Fisioterapia", 20);

    public static void main(String[] args) {
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(doctor);

        menu();
    }

    public static void menu(){
        int opcion;
        do{
            System.out.println("\t .:MENU:.");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de Futbol");
            System.out.println("4. Planificar Entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar Lesion");
            System.out.println("7. SALIR");
            System.out.println("Opcion: ");
            opcion = entrada.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("");
                    viajarEquipo(); //viaje de equipo
                    break;
                case 2:
                    System.out.println(""); // entrenamiento
                    entrenarEquipo();
                    break;
                case 3:
                    System.out.println("");
                    partidoFutbol(); // partido de futbol
                    break;
                case 4:
                    System.out.println("");
                    planificarEntrenamiento(); // planificar entrenamiento
                    break;
                case 5:
                    System.out.println("");
                    darEntrevista(); // entrevista
                    break;
                case 6:
                    System.out.println("");
                    curarLesion();// curar lession
                    break;
                case 7: break;
                default:
                    System.out.println("Error, se equivoco de opcion de menu");
                    break;
            }
            System.out.println("");
        }while (opcion !=7);
    }

    public static void viajarEquipo(){
        for (Persona equipo: persona) {
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" --> ");
            equipo.viajar();
        }
    }
    public static void entrenarEquipo(){
        for (Persona equipo: persona) {
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" --> ");
            equipo.entrenamiento();
        }
    }
    public static void partidoFutbol(){
        for (Persona equipo: persona) {
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" --> ");
            equipo.partidoFutbol();
        }
    }
    public static void planificarEntrenamiento(){
        System.out.print(entrenador.getNombre()+" "+entrenador.getApellido()+" --> ");
        ((Entrenador)entrenador).planificarEntrenamiento();
    }
    public static void darEntrevista(){
        System.out.print(futbolista1.getNombre()+" "+futbolista1.getApellido()+" --> ");
        ((Futbolista)futbolista1).entrevista();
        System.out.print(futbolista2.getNombre()+" "+futbolista2.getApellido()+" --> ");
        ((Futbolista)futbolista2).entrevista();
    }
    public static void curarLesion(){
        System.out.print(doctor.getNombre()+" "+doctor.getApellido()+" --> ");
        ((Doctor)doctor).curarLesion();
    }
}
