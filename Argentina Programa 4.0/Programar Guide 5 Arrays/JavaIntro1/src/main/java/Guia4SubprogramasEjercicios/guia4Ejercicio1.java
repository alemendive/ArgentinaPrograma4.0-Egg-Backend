/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia4SubprogramasEjercicios;

import java.util.Scanner;

/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 *
 * @author Ale
 */
public class guia4Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String opcion;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        double num1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero");
        double num2 = leer.nextInt();

        do {
            System.out.println("¿Cual operacion que quiere realizar?");
            System.out.println("A - Sumar");
            System.out.println("B - Restar");
            System.out.println("C - Multiplicar");
            System.out.println("D - Dividir");
            System.out.println("E - Salir");
            opcion = leer.next();
            switch (opcion) {

                case "A":
                    double resultado1 = suma(num1,num2);
                    System.out.println("La suma de los numeros es: " +resultado1);
                    break;  
                case "B":
                    double resultado2 = restar(num1,num2);
                    System.out.println("La resta de los numeros es: " +resultado2);
                    break;
                case "C":
                    double resultado3 = multiplicar(num1,num2);
                    System.out.println("La multiplicaion de los numeros es: " +resultado3);
                    break;
                case "D":
                    double resultado4 = dividir(num1,num2);
                    System.out.println("La division de los numeros es: " +resultado4);
                    break;
            }

        } while (!opcion.equals("E"));
        
        System.out.println("Ha salido del menu");

    }

    public static double suma(double num1, double num2) {

        double res = num1 + num2;

        return res;
    }
    
     public static double restar(double num1, double num2) {
         
        double res = num1 - num2;

        return res;
     }
     
     public static double multiplicar(double num1, double num2) {
         
        double res = num1 * num2;

        return res;
     }
     
     public static double dividir(double num1, double num2) {
         
        double res = num1 / num2;

        return res;
     }
}