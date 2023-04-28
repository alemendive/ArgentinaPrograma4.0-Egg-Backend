/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encuentro345;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class Guia3EjercicioTeoria6 {

    /**
     * @param args the command line arguments
     */
    


    /*Implementar un programa que le pida dos números enteros al usuario
    y determine si ambos o alguno de ellos es mayor a 25.
    */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un segundo número entero:");
        int num2 = leer.nextInt();
        if (num1>25 && num2>25) {
            System.out.println("Los números ingresados son mayores a 25");
        } else if (num1>25 || num2>25) {
            System.out.println("Un número ingresado es mayor a 25");
        } else{
            System.out.println("Ningún número es mayor a 25");
        }
    }
    
}

