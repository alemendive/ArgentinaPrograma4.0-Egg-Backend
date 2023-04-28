/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia5EjerciciosExtra;

import java.util.Scanner;

/*Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 *
 * @author Ale
 */
public class ejercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que averigüe si dos vectores de N enteros son iguales
        (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores:");
        int n = leer.nextInt();
        int[] v1 = new int[n];
        int[] v2 = new int[n];
        System.out.println("Ingrese los valores del vector 1:");
        for (int i = 0; i < n; i++) {
            v1[i] = leer.nextInt();
        }
        System.out.println("Ingrese los valores del vector 2:");
        for (int i = 0; i < n; i++) {
            v2[i] = leer.nextInt();
        }
        //Comparar Vectores
        boolean sonIguales = true;
        for (int i = 0; i < n; i++) {
            if (v1[i]!=v2[i]) {
                System.out.println("Los vectores NO son iguales!X!");
                sonIguales = false;
                break;
            }
        }
        if (sonIguales){
            System.out.println("Los vectores son iguales!Y!");
        }
    }
}
