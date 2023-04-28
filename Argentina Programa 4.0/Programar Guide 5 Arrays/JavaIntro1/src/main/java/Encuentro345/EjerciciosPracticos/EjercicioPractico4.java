/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encuentro345.EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, 
//se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
//Nota: investigar la función Substring y equals() de Java.
public class EjercicioPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String subcadena = "A";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra: ");
        String frase = leer.nextLine();
        
        if (frase.substring(0,0).equals(subcadena)) {
            //System.out.println(frase);
            System.out.println(frase+" CORRECTO");
        } else {
            System.out.println( frase+ " INCORRECTO");
        }
        
    }
    
}
