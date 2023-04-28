/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia5EjerciciosExtra;

import java.util.Scanner;

/*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
Después haremos otra función o procedimiento que imprima el vector.
 *
 * @author Ale
 */
public class ejercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector ");
        int num = leer.nextInt();
        int [] vector = new int [num];
        
        rellenarVector(vector);
        imprimirVector(vector);
    }
    
    public static void rellenarVector(int vector[]){           
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) ((Math.random() * 100));
        }
    }
    public static void imprimirVector(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Los numeros son: "+ vector[i]);
        }
    }
    
}
