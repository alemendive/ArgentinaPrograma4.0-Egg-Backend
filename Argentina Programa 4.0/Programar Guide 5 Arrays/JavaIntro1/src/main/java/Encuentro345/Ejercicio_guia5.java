/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encuentro345;
//Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
//el número ingresado seguido de tantos asteriscos como indique su valor. Por
//ejemplo:
//5 **
//3 
//11 **
//2 **

import java.util.Scanner;

public class Ejercicio_guia5 {

    public static void main(String[] args) {
        int num, cont, i;

        Scanner leer = new Scanner(System.in);
        for (i = 0; i < 4; i++) {
            cont = 0;
            System.out.println("Ingrese un numero entre 1 y 20");
            num = leer.nextInt();
            

            while (num < 1 || num > 20) {
                System.out.println("El numero que ingreso es mayor o menor a lo estipulado, ingrese otro:");
                num = leer.nextInt();
            }
            System.out.print(num);
            do {

                System.out.print("*");
                cont += 1;
            } while (cont < num);
        }

    }

}
