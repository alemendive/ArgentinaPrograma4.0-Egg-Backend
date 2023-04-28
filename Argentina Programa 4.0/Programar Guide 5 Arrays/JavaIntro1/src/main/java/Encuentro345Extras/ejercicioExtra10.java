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
public class ejercicioExtra10 {

    /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
    El programa debe indicar al usuario si su respuesta es o no correcta.
    En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
    Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10 + 0);
        int num2 = (int) (Math.random() * 10 + 0);
        System.out.println("Dados los siguientes 2 numeros indique el resultado de su multiplicacion.");
        System.out.println(num1 + "x" + num2 + "=");
        
        int multi = (num1 * num2);

        do {
            int respuesta = leer.nextInt();
            if (respuesta == multi) {
                System.out.println("Muy Bien adiviniaste ! sos un crack");
                break;
            } else {
                System.out.println("Opa estan flojas esas matematicas, volve a intentar");
            }

        }while(true);
        
    }
}
