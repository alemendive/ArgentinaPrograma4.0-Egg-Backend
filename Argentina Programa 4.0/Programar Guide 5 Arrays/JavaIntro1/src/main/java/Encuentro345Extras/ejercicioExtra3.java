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
public class ejercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    
    //Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
    //Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una Letra");
        String letra;
        letra = leer.nextLine();
        
        if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")) {
            System.out.println("Es una vocal ");
        } else {
            System.out.println("Es una consonante ");
        }
        
    }
    
}
