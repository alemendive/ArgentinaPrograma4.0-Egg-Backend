/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class ejercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamVector = sc.nextInt();
        int[] vector = new int[tamVector];
        for (int i = 0; i < tamVector; i++) {
            vector[i] = (int) (Math.random() * 100 + 1);
            //Math.random()  
        }
        for (int elemento : vector) {
            System.out.println(" [ " + elemento + " ] ");
        }
        System.out.println(" Ingrese el número que desea buscar");
        int numBuscar = sc.nextInt();

        int cont = 0;
        for (int i = 0; i < tamVector; i++) {
            if (vector[i] == numBuscar) {
                System.out.println("El número " + numBuscar + "\n"
                        + "Se encuentra en la posición " + i);
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("El número que ingreso no se encuentra");
        }else{
            System.out.println("El número se ha encontrado " + cont + " veces");
        }       
    }

}
