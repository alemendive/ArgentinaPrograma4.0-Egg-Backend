/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia5EjerciciosExtra;

import java.util.Scanner;

/*
 *Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N
 * , con los valores ingresados por el usuario.
 * @author Ale
 */
public class ejerciciosExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector ");
        int num = leer.nextInt();
        int [] vector = new int [num];
        int total = 0;
        int valorFila = 0;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un numero");
            valorFila = leer.nextInt();
            vector[i] = valorFila;
        }
        
        /*for (int i = 0; i < vector.length; i++) {
            System.out.println("Los valores son: " + vector[i]);
        }*/
         
        for (int i = 0; i < vector.length ; i++) {
             total += vector[i]; 
             
        }
        System.out.println("La suma total es: " +total);
        }
               
    }
    
