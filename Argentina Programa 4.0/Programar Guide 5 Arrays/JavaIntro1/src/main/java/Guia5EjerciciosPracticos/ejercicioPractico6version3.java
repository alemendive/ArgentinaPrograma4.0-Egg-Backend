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
public class ejercicioPractico6version3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] sumfila = new int[3];
        int[] sumcol = new int[3];
        int cont = 0;
        int sumadiag1 = 0, sumadiag2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = leer.nextInt();
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {

                    System.out.println("Error el elemnto debe estar entre 1 y 9");

                    j = j - 1;
                }
            }
        }
        //recorremos la matriz para sumar las filas y columnas y la diagonal 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumfila[i] += matriz[i][j];
                sumcol[i] += matriz[j][i];
                
                if (i + j != 2) {
                } else {
                    sumadiag2 += matriz[j][j];
                }
            }
            sumadiag1 += matriz[i][i];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sumfila[i] == sumcol[i] && sumfila[i] == sumadiag1 && sumfila[i] == sumadiag2) {
                    cont++;
                }
            }

            if (cont == 3) {
                System.out.println("La matriz ingresada es MAGICA");
                break;
            } else {
                System.out.println("La matriz no es magica ");
                break;
            }

        }
    }

}
