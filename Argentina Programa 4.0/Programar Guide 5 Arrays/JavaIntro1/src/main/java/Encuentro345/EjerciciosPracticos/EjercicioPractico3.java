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
//Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
//Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
//en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra: ");
        frase = leer.nextLine();

        if (frase.length() == 8) {
            System.out.println(frase);
            System.out.println(" CORRECTO");                   
        } else {
            System.out.println(frase+ " INCORRECTO");
        }
        
              
                

        //for (int i=0; i < frase.length(); i++) {
        // System.out.println(frase+ "CORRECTO");
        //if (frase.length() == 8); {        
        //System.out.println(frase+ "INCORRECTA");
    }
    //System.out.println("INCORRECTO");
}
