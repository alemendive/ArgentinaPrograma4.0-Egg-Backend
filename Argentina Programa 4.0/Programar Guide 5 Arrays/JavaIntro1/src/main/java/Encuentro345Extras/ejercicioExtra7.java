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
public class ejercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   
        System.out.println("Porfavor ingrese la cantidad de numeros a tener en cuenta");
        int cantnum = leer.nextInt();
        
        System.out.println("Porfavor ingrese los numeros" );
        int max = 0;
        int min = 99999;
        double promedio = 0;
        int contnum = 0;
        
        while (contnum < cantnum){
           int num = leer.nextInt();
           if (num > max){
               max = num;
           }
           if (num < min){
               min = num;
           }
           contnum++;
           promedio = (promedio + num);
        }
        System.out.println("El numero maximo es : " + max); 
        System.out.println("El numero minimos es : " + min);
        System.out.println("El promedio de los numeros es de : " + (promedio/cantnum));
    }
}