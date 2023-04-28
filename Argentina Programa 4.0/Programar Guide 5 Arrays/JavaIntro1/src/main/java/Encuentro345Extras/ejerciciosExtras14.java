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
public class ejerciciosExtras14 {

    /*Se dispone de un conjunto de N familias, cada una de las cuales tiene 
    una M cantidad de hijos. Escriba un programa que pida la cantidad de 
    familias y para cada familia la cantidad de hijos para averiguar la 
    media de edad de los hijos de todas las familias.
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Digite porfavor la cantidad de familias a analizar");
        int cantFamilia = leer.nextInt();
        
        int promEdadHijos = 0;
        System.out.println("------------------------------");
        for (int i = 0; i < cantFamilia; i++) {
            System.out.println("Cuantos hijos tiene la familia: " + (i+1));
            int cantHijos = leer.nextInt();
            for (int j = 0; j < cantHijos; j++) {
                System.out.println("Cuantos años tiene el niñ@: " + (j+1));
                int edadHijos = leer.nextInt();  
                promEdadHijos += edadHijos;
            }
             promEdadHijos /= cantHijos;
             System.out.println ("El promedio de la edad de los hijos de la familia " + (i+1) + " es de: " + promEdadHijos);
        }
       
    }
    
}