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
public class ejercicioExtra8 {

    /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos,
    la cantidad de números pares y la cantidad de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
    Nota: recordar el uso de la sentencia break.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contnum = 0;
        int contpar = 0;
        int contimpar = 0;
        int num;
        System.out.println("Porfavor ingrese numeros");

        do {
            num = leer.nextInt();
            if (num % 2 == 0) {
                contpar++;
            
            contnum++;
            }else{
               contimpar++;
                   contnum++;
               }
            if (num % 5 == 0){
               break; 
            }
           } while(true) ;
         
        System.out.println("Se detuvo la lectura por encontrar un numero multiplo de 5");
        System.out.println("Cantida de numeros: " + contnum);
        System.out.println("Cantidad de numeros pares: " + contpar);
        System.out.println("Cantidad de numeros impares: " + contimpar);
        
}
}
