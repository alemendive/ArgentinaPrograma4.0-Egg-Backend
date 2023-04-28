package Encuentro2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Ale
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);        
        float num1, num2, suma;
        System.out.println("Ingresa 2 numeros");
        num1 = entra.nextFloat();
        num2 = entra.nextFloat();
        suma = num1 + num2;
        System.out.println("Suma=" + suma);
    }
    
}
