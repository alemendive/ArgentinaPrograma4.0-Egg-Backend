/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encuentro6Guia4;

import java.util.Scanner;



/*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, 
sino informe que no lo son. *
 * @author Ale
 */
public class guia4Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");               
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");               
        int num2 = leer.nextInt();
        
        
        esMultiplo(num1,num2);
    
        
    }
    
    public static void esMultiplo(int num1, int num2) {
        
        
        if (( num1 % num2) == 0) {
            System.out.println("El numero es multiplo.");
        } else {
            System.out.println("El numero no es multiplo.");
        }
          
        
    }
        
    
}
