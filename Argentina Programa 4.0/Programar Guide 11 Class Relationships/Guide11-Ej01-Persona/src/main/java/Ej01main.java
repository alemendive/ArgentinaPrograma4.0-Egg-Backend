import entidad.Perro;
import entidad.Persona;
import service.PPService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej01main {
    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public static void main(String[] args) {
        PPService adopcionService = new PPService();
        List<Persona> personas = new ArrayList<>();
        List<Perro> perrosAdopcion = new ArrayList<>();
        //Cargar personas
        System.out.println("Cargar Personas");
        for (int i = 0; i < 2; i++) {
            System.out.println("Persona " + (i + 1) + ":");
            personas.add(adopcionService.crearPersona());
        }
        //Cargar perros
        System.out.println("Cargar Perros");
        for (int i = 0; i < 2; i++) {
            System.out.println("Perro " + (i + 1) + ":");
            perrosAdopcion.add(adopcionService.crearPerro());
        }
        System.out.println("Adoptando Perros:");
        for (Persona aux : personas) {
            System.out.println("Para la persona " + aux.getNombre() + " " + aux.getApellido() +
                    " \nseleccione el nombre de uno de los siguientes perros en adopción: ");
            for (Perro aux2 : perrosAdopcion) {
                System.out.println("Nombre: " + aux2.getNombre() + " - Raza del perro: " + aux2.getRaza());
            }
            String adoptable = leer.next();
            int ctrol = 0;
            for (Perro perro : perrosAdopcion) {
                if (adoptable.equalsIgnoreCase(perro.getNombre())) {
                    aux.setPerro(perro);
                    ctrol++;
                    System.out.println("Perro adoptado");
                    perrosAdopcion.remove(perro);
                    break;
                }
            }
            if (ctrol == 0) {
                System.out.println("No se ha adoptado un perro válido");
            }
        }
        System.out.println();
        System.out.println("Las siguientes personas han adoptado: ");
        for (Persona aux : personas) {
            if (aux.getPerro() == null) {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " no ha adoptado a ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " ha adoptado a " + aux.getPerro().getNombre() + " de raza: " + aux.getPerro().getRaza());
            }

        }
    }
}
