package service;

import java.util.HashMap;
import java.util.Scanner;

public class CiudadesService {
    private final Scanner leer = new Scanner(System.in);

    private final HashMap<Integer, String> ciudades = new HashMap<>();

    public void agregarCiudad() {
        System.out.println("Ingrese el nombre de la ciudad");
        String ciudad = leer.nextLine();
        System.out.println("Ciudad agregada");
        System.out.println("Ingrese el Codigo Postal");
        int codigoPostal = leer.nextInt();
        leer.nextLine();
        ciudades.put(codigoPostal, ciudad);

    }

    public void mostrarCiudades() {
        ciudades.forEach((k, v) -> System.out.println("Codigo Postal: " + k + " Ciudad: " + v));
    }


    public void buscarCiudad() {
        System.out.println("Ingrese el codigo postal");
        int codigoPostal = leer.nextInt();
        leer.nextLine();
        System.out.println(ciudades.get(codigoPostal));
    }

    public void eliminarCiudad() {
        System.out.println("Ingrese el codigo postal");
        int codigoPostal = leer.nextInt();
        leer.nextLine();
        ciudades.remove(codigoPostal);
        System.out.println("Ciudad eliminada");
    }

    public void menu() {
        int opcion = 0;

        do {
            System.out.println("Bienvenido al menu");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Agregar Ciudad");
            System.out.println("2. Mostrar Ciudades");
            System.out.println("3. Buscar Ciudad");
            System.out.println("4. Eliminar Ciudad");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    agregarCiudad();
                    break;
                case 2:
                    mostrarCiudades();
                    break;
                case 3:
                    buscarCiudad();
                    break;
                case 4:
                    eliminarCiudad();
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:

            }
        } while (opcion != 5);
    }
}
