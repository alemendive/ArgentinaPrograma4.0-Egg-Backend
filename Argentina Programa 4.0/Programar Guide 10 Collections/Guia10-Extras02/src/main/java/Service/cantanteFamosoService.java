package Service;

import Entidad.CantanteFamoso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class cantanteFamosoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<CantanteFamoso> cantantes = new ArrayList<>();

    public void agregarCantante() {
        CantanteFamoso cantante = new CantanteFamoso();
        System.out.println("Ingrese el nombre del cantante");
        cantante.setNombre(leer.next());
        System.out.println("Ingrese el disco mas vendido");
        cantante.setDiscoConMasVentas(leer.next());
        cantantes.add(cantante);
    }

    public void crearLista() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Cantante " + (i + 1));
            agregarCantante();
        }
    }

    public void mostrar() {
        for (CantanteFamoso cantante : cantantes) {
            System.out.println(cantante.toString());
        }
    }

    private void eliminarCantante() {
        boolean esta = false;
        System.out.println("Que cantante desea eliminar?");
        String borrar = leer.next();
        Iterator<CantanteFamoso> it = cantantes.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(borrar)) {
                esta = true;
                it.remove();
            }
        }
        if (esta) {
            System.out.println("Cantante" + borrar + "eliminado");
        } else {
            System.out.println("El cantante" + borrar + "no existe");
        }
    }

    public void menu() {
        int opc = 0;
        crearLista();
        do {
            System.out.println(".::Menú:.");
            System.out.println("Elija una de las siguientes opciones: ");
            System.out.println("1) Mostrar cantantes");
            System.out.println("2) Agregar cantante ");
            System.out.println("3) Eliminar cantante");
            System.out.println("4) Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    mostrar();
                    break;
                case 2:
                    agregarCantante();
                    break;
                case 3:
                    eliminarCantante();
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion invalida. Intentelo de nuevo");
                    break;
            }
        } while (opc != 4);
    }
}

