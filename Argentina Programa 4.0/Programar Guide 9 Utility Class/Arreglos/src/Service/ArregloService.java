package Service;

import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.Random;


public class ArregloService {

    public void inicializarA(double [] arregloA){
//Método inicializarA recibe un arreglo por parámetro y lo inicializa con
//números aleatorios.
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arregloA[i] = random.nextInt(10);
        }
    }

    public void mostrar(double [] arregloA){
//Método mostrar recibe un arreglo por parámetro y lo muestra por
//pantalla.
        System.out.println("Arreglo A: ");
        System.out.println(" ");
        for (int i = 0; i < 50; i++) {
            System.out.print(" - " +arregloA [i]);
        }
    }

    public void ordenar(double [] arregloA){
//Método ordenar recibe un arreglo por parámetro y lo ordena de
//mayor a menor.
        System.out.println("Los número ordenados de mayor a menor son: ");
        System.out.println(" ");
//Arrays.sort(arregloA, Collections.reverseOrder());
//Arrays.sort(arregloA[], Comparator.reverseOrder());
        Arrays.sort(arregloA);
        for (int i = arregloA.length-1 ; i >= 0; i--) {
            System.out.print(" - " + arregloA[i]);
        }
    }

    public void inicializarB(double [] arregloB, double [] arregloA){
//Método inicializarB copia los primeros 10 números del arreglo A en el
//arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
        Random random = new Random();
        double num3 = 0.5;
        Arrays.fill((arregloB), num3);
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
    }

    public void mostrarB(double [] arregloB){
//Método mostrar recibe un arreglo por parámetro y lo muestra por
//pantalla.
        System.out.println("Arreglo B: ");
        System.out.println(" ");
        for (int i = 0; i < 20; i++) {
            System.out.print(" - " + arregloB [i]);
        }
    }
}
