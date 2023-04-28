/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5.Encuentro10;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        Scanner leerN = new Scanner(System.in);
        Scanner leerNom = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de integrantes");
        int cant = leerN.nextInt();
        String[] equipo = new String[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1));
            equipo[i] = leerNom.nextLine();
        }
        System.out.println("");

        for (int i = 0; i < cant; i++) {
            System.out.print(" " + equipo[i] + " ");

        }
        System.out.println("");

        for (String elemento : equipo) {
            System.out.print(" " + elemento + " ");
        }

    }
}
