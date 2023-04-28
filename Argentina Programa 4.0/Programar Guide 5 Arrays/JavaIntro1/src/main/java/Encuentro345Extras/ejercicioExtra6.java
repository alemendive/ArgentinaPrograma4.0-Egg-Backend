/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encuentro345Extras;

import java.util.Scanner;

/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts.
y el promedio de estaturas en general.
 */
public class ejercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 1;
        double alturaMenor = 0;
        double alturaPromedio = 0;
        double sumaMenor = 0;
        double sumaPromedio = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas: ");
        int personas = leer.nextInt();

        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona: " + contador);
            contador++;
            double altura = leer.nextDouble();
            if (altura < 1.60) {
                alturaMenor = (alturaMenor + 1);
                sumaMenor = (sumaMenor + altura);
                alturaPromedio = (alturaPromedio + 1);
                sumaPromedio = (sumaPromedio + altura);
            } else {
                alturaPromedio = (alturaPromedio + 1);
                sumaPromedio = (sumaPromedio + altura);
            }
        }
        System.out.println("La altura promedio es: " + sumaMenor / alturaMenor);
        System.out.println("La altura general promedio de todas las personas es: " + sumaPromedio / personas);
    }

}
