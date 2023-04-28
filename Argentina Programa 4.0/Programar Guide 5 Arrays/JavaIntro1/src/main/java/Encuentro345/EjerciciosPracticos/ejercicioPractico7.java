/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encuentro345.EjerciciosPracticos;

import java.util.Scanner;

public class ejercicioPractico7 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        String cadena;

        do {
            System.out.print("Ingrese una cadena (&&&&& para salir): ");
            cadena = scanner.nextLine();

            if (cadena.equals("&&&&&")) {
                break;
            }

            if (cadena.length() != 5 || cadena.charAt(0) != 'X' || cadena.charAt(4) != 'O') {
                incorrectas++;
                System.out.println("La cadena ingresada no cumple con el formato requerido.");
            } else {
                correctas++;
                System.out.println("La cadena ingresada cumple con el formato requerido.");
            }

        } while (true);

        System.out.println("\nInforme:");
        System.out.println("Cadenas correctas recibidas: " + correctas);
        System.out.println("Cadenas incorrectas recibidas: " + incorrectas);
    }
} 