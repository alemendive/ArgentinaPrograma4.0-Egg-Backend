/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encuentro345Extras;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
//Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y 
//se muestre su equivalente en romano.
public class ejercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        int num = leer.nextInt();

        if (num >= 1 && num <= 10) {
            if (num == 1) {
                System.out.println("En número romano seria: " + "I");
            } else if (num == 2) {
                System.out.println("En número romano seria: " + "II");
            } else if (num == 3) {
                System.out.println("En número romano seria: " + "III");
            } else if (num == 4) {
                System.out.println("En número romano seria: " + "IV");
            } else if (num == 5) {
                System.out.println("En número romano seria: " + "V");
            } else if (num == 6) {
                System.out.println("En número romano seria: " + "VI");
            } else if (num == 7) {
                System.out.println("En número romano seria: " + "VII");
            } else if (num == 8) {
                System.out.println("En número romano seria: " + "VIII");
            } else if (num == 9) {
                System.out.println("En número romano seria: " + "IX");
            } else if (num == 10) {
                System.out.println("En número romano seria: " + "X");
            }
        } else {
            System.out.println("El caracter ingresado es incorrecto");
        }
    }
}
