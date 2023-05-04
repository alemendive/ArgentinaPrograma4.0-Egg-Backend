package Service;

import Entidad.Pelicula;
import Utilidades.Comparadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peli = new ArrayList<>();

    public void crearPelicula() {

        String opcion;

        do {
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese el nombre de la pelicula: ");
            pelicula.setTitulo(leer.nextLine());
            System.out.println("Ingrese el director de la pelicula: ");
            pelicula.setDirector(leer.nextLine());
            System.out.println("Ingrese la duracion de la pelicula");
            pelicula.setDuracion(leer.nextFloat());
            leer.nextLine();
            peli.add(new Pelicula(pelicula.getTitulo(), pelicula.getDirector(), pelicula.getDuracion()));
            System.out.println("Desea agregar otra pelicula? S/N");
            opcion = leer.nextLine();


        } while (opcion.equalsIgnoreCase("S"));
        mostrarPeliculas();
        mostrarPeliMenorHora();

        ordenarPelisDesc();
        ordenarPelisAsc();
        ordenarPelisPorTitulo();
        ordenarPelisPorDirector();

    }

    public void mostrarPeliculas() {
        for (Pelicula pelicula : peli) {
            System.out.println(pelicula);
        }
        System.out.println("************************");
    }

    public void mostrarPeliMenorHora() {

        System.out.println("Peliculas con duracion menor a 1 hora: ");
        for (Pelicula pelicula : peli) {
            if (pelicula.getDuracion() < 1) {
                System.out.println(pelicula);
            }
        }
        System.out.println("************************");
    }

    public void ordenarPelisDesc() {
        System.out.println("Peliculas ordenadas de forma descendente");
        Collections.sort(peli, Comparadores.comparaDuracionMayorAMenor);
        mostrarPeliculas();
    }

    public void ordenarPelisAsc() {
        System.out.println("Peliculas ordenadas de forma Ascendiente");
        Collections.sort(peli, Comparadores.comparaDuracionMenorAMayor);
        mostrarPeliculas();
    }

    public void ordenarPelisPorTitulo() {
        System.out.println("Peliculas ordenadas de por titulo descendiente");
        Collections.sort(peli, Comparadores.comparaTituloDescendente);
        mostrarPeliculas();
    }

    public void ordenarPelisPorDirector() {
        System.out.println("Peliculas ordenadas de por director");
        Collections.sort(peli, Comparadores.comparaDirectorDescendente);
        mostrarPeliculas();
    }
}





