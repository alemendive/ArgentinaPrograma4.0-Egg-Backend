/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encuentro345Extras;

import java.util.Scanner;

/*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos 
que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, 
y luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el 
importe en efectivo a pagar por dicho socio.
 */
public class ejercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la clase social " + "A " + "B " + "C ");
        String clase = leer.nextLine();

       
        if (clase.equalsIgnoreCase("A")) {
            System.out.println("Ingrese el monto a pagar:");
        int monto = leer.nextInt();
            System.out.println("Importe a abonar:" + monto * 0.5);
        } else if (clase.equalsIgnoreCase("B")) {
            System.out.println("Ingrese el monto a pagar:");
        int monto = leer.nextInt();
            System.out.println("Importe a abonar:" + monto * 0.65);
        } else if (clase.equalsIgnoreCase("C")) {
            System.out.println("Ingrese el monto a pagar:");
        int monto = leer.nextInt();
            System.out.println("Importe a abonar:" + monto);
        } else {
            System.out.println("La clase social ingresada es incorrecta.");
        }
    }
}

    



