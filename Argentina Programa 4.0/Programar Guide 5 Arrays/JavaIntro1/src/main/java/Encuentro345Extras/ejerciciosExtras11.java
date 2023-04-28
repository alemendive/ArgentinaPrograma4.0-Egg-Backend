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
public class ejerciciosExtras11 {

    /*Escribir un programa que lea un número entero y devuelva el número de 5546
    dígitos que componen ese número. Por ejemplo, si introducimos el número 
    12345, el programa deberá devolver 5. Calcular la cantidad de dígitos 
    matemáticamente utilizando el operador de división. Nota: recordar que 
    las variables de tipo entero truncan los números o resultados
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int cont = 0;

        
            System.out.println("Porfavor ingrese un número entero.");
            num = leer.nextInt();

       while(num !=0){
       
            num = num / 10;
            cont++;
        }
    
        System.out.println("El numero tiene " + cont + " digitos");

   
    }   
}
