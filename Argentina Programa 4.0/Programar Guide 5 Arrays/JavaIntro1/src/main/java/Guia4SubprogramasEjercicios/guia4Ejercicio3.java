/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia4SubprogramasEjercicios;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class guia4Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresar moneda para realizar el cambio");
        String moneda = leer.nextLine();
        System.out.println("Ingresar cantidad de Euros");
        double cant = leer.nextInt();
        double monedaTotal= cambioDeMoneda(cant, moneda);
       System.out.println("Los "+ cant + " de Euros son "+ monedaTotal + " "+moneda);
      
    }
    public static double cambioDeMoneda(double cant, String moneda){
       double valor=0;
       switch(moneda){
           case "libras":
            valor=(0.86*cant);
            break;
           case "dolares":
               valor=1.28611*cant;
            break;
           case "yenes":
             valor=129.852*cant; 
            break;
           default:
               System.out.println("La moneda ingresada no es valida");
               //break;
       }
        
       return valor;
    } 
}
