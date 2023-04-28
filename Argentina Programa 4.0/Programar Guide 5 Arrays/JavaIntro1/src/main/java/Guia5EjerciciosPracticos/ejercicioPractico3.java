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
public class ejercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public class Ejercicio03Prácticos {

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
            vector[i] = (int) ( 1 + (Math.random() * 100000));
        }
        for (int elemento : vector) {
            System.out.println(" [ " + elemento + " ] ");
        }
        int cont = 0;
        for (int i = 0; i < tamVector ; i++) {
            cont = 1;
            int aux= vector[i];
            while (aux > 10) { 
                cont++;
                aux/=10;
            }
            System.out.println("El número " + vector[i] 
                        + " tiene " + cont + " dígitos" );
        }
    }
}
}