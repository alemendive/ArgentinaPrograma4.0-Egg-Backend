package Service;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisesService {
    Scanner leer = new Scanner(System.in);
    TreeSet<String> paises = new TreeSet<>();

    public void agregarPaises() {
        String opcion, pais;

        do {
            System.out.println("Ingrese el pais: ");
            pais = leer.nextLine();
            paises.add(pais);
            System.out.println("Desea agregar otro pais? S/N");
            opcion = leer.nextLine();


        } while (opcion.equalsIgnoreCase("S"));

    }

    public void mostrarPaises() {
        for (String pais : paises) {
            System.out.println(pais);
        }

    }

    public void eliminarPaises() {
        boolean encontrado = false;
        Iterator<String> it = paises.iterator();
        System.out.println("Que pais desea eliminar");
        String pais = leer.nextLine();


        while (it.hasNext()) {
            if (it.next().equals(pais)) {
                it.remove();
                System.out.println("Pais eliminado");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Pais no encontrado");
        }
        mostrarPaises();
    }
}