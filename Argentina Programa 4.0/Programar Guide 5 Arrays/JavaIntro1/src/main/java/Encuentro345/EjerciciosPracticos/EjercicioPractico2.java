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
// Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, 
//sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String frase;
       Scanner leer = new Scanner (System.in);
       System.out.print("Ingrese una frase: ");
       frase = leer.nextLine();
       
       if (frase.equals("eureka")) {
           System.out.println("La frase es correcta");
       }else{
           System.out.println("La frase es incorrecta");
       }
    }
    
}
