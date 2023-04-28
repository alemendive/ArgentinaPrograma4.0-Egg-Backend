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
public class ejercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    //Dado un tiempo en minutos, calcular su equivalente en días y horas. 
    //Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
    public static void main(String[] args) {
        int dias = 0;
        int horas = 0;
        int minutos = 0;

        //int minutos = 1440;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese en minutos el tiempo a calcular: ");
        int num = leer.nextInt();

        while (num > 0) {
            if (num >= 1440) {
                dias += 1;
                num -= 1440;
            } else if (num >= 60) {
                horas += 1;
                num -= 60;
            } else {
                minutos += 1;
                num -= 1;
            }

        }
        System.out.println("Los dias son : "+ dias);
        System.out.println("Las horas son : "+ horas);
        System.out.println("Los minutos son : "+ minutos);
        
        
    }

}
