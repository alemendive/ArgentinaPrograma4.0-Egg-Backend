/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encuentro345.EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
//Crear un programa que dado un número determine si es par o impar.
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, i, suma;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero a evaluar: ");
        num = leer.nextInt();
        
        if(num % 2 == 0) {
            System.out.println(num+" es un numero par.");
        } else {
            System.out.println(num+" es un numero impar.");
        }
        
        }

    }
