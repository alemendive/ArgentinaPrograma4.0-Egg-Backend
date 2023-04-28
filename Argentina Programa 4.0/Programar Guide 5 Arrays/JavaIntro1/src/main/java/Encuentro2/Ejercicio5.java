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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, doble, triple;
        double raizCuadrada;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero Entero: ");
        num = leer.nextInt();
        doble = num*2;
        System.out.println("El numero ingresado es: "+ num + " y el doble es: "+ doble);
        triple = num*3;
        System.out.println("El numero ingresado es: " + num + " y el triple es: " + triple);
        raizCuadrada = Math.sqrt(num);
        System.out.println("El numero ingresado es: " + num + " y la raiz cuadrada es: " + raizCuadrada);
        leer.close();
    }
    
}
