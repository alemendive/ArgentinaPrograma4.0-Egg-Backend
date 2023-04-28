/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia5EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class ejercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de términos que desea generar: ");
        int n = leer.nextInt();

        int[] fibonacci = new int[n];

        // Generar los primeros dos términos de la sucesión de Fibonacci
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Generar el resto de los términos
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Imprimir la sucesión de Fibonacci generada
        System.out.print("La sucesión de Fibonacci generada es: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
