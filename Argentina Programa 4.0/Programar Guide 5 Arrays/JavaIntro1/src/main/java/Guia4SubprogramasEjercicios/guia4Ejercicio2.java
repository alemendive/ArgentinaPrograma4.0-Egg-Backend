/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia4SubprogramasEjercicios;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class guia4Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mayorEdad();
        
        
    }
    
    
    public static void mayorEdad(){
    
           String opcion = "";
           Scanner leer = new Scanner(System.in);
        
         while(!(opcion.equals("no"))){
         
             System.out.println("ingrese el nombre de la persona");
             String nombre = leer.next();
             System.out.println("ingrese la edad de la persona");
             int edad = leer.nextInt();
             System.out.println("------------------------------------");
             System.out.println("el nombre de la persona es: "+nombre);
             if (edad >= 18){
                 System.out.println("la persona es mayor de edad");        
             }else{
                 System.out.println("la persona es menor de edad");
             }
             
             System.out.println("desea seguir ingresando personas? si/no");
             opcion = leer.next();
         }

        
    }
    
}