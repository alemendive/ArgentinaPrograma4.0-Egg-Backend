/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encuentro6Guia4;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class guia4Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra terminada con un punto(.)");
        String frase = leer.nextLine();
        
        
       
        intercambioVocales(frase);

    }

    public static void intercambioVocales(String frase) {
        int i = 0;
        String fraseModificada = "";
        String caracterActual;
        

        do {
            switch (frase.substring(i, i + 1)) {
                case "a":
                    fraseModificada = fraseModificada.concat("@");
                    break;
                case "e":
                    fraseModificada = fraseModificada.concat("#");
                    break;
                case "i":
                    fraseModificada = fraseModificada.concat("$");
                    break;
                case "o":
                    fraseModificada = fraseModificada.concat("%");
                    break;
                case "u":
                    fraseModificada = fraseModificada.concat("*");
                    break;

                default:
                    caracterActual = (frase.substring(i, i + 1));
                    fraseModificada = fraseModificada.concat( caracterActual );

            }

            i++;
        } while (!frase.substring(i,i+1).equals("."));
        System.out.println("La frase codificada es: ");
        System.out.println(fraseModificada);

    }
}