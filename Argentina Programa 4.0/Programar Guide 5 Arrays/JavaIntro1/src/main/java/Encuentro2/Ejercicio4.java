package Encuentro2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
 * // La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author Ale
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double C, F;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados: ");
        C = leer.nextInt();
        F = 32 + (9 * C / 5);
        System.out.println("-----------------------------------");
        System.out.println("Convertir centigrados a Fahrenheit: ");
        System.out.println("    " + C + "°C <==> " + F + " °F");
        System.out.println("-----------------------------------");
        leer.close();
        
    }
    
}
