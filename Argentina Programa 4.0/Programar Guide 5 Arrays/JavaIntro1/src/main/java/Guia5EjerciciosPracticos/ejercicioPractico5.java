/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5EjerciciosPracticos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class ejercicioPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz;
        int max;
        Random random = new Random();
        matriz = new int[3][3];
        System.out.println("Matriz Original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 9);
                max = random.nextInt(2);
                if (max == 1) {
                    matriz[i][j] = (matriz[i][j] * -1);
                }
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        boolean bucle = true;
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] != -matriz[i][j]) {
                    bucle = false;
                    break;
                }

            }

        }
        if (bucle) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }
}
