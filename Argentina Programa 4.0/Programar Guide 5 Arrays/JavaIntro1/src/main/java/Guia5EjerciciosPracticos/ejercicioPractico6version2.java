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
public class ejercicioPractico6version2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz;
        int[] vector = new int[8];
        matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                do {
                    System.out.println("Ingrese los valores de la matriz");
                    matriz[i][j] = leer.nextInt();
                } while ((matriz[i][j] < 1) || (matriz[i][j] > 9));
            }
        }
        boolean bucle = true;
        int suma = 0, fila = 0, columna = 0, diagonal1 = 0, diagonal2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma = suma + matriz[i][j];

            }
            vector[i] = suma;
            suma = 0;
        }
        suma = 0;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                suma = suma + matriz[i][j];
            }
            vector[j + 3] = suma;
            suma = 0;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    suma = suma + matriz[i][j];

                }
            }
        }
        vector[6] = suma;
        suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == 2) {
                    suma = suma + matriz[i][j];
                }
            }
        }
        vector[7] = suma;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 8; i++) {
            System.out.print(vector[i] + " ");

        }
        System.out.println("");
        int cont = 0;
        do {
            cont++;
        } while (vector[0] == vector[cont] && cont < 7);

        if (cont == 7) {
            System.out.println("La Matriz es mágica");

        } else {
            System.out.println("La Matriz no es mágica");

        }
    }
}
