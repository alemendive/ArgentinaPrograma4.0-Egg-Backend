/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ejerciciopoo02;

import ejerciciopoo02.Entidad.Circunferencia;
import java.util.Scanner;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 *
 * @author Ale
 */
public class EjercicioPOO02 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Cual es el radio? ");
        double rad = leer.nextDouble();

        Circunferencia m1 = new Circunferencia(rad);

        System.out.println("El area es: " + String.format("%.2f", m1.calcularArea()));

        System.out.println("El perimetro es: " + String.format("%.2f", m1.calcularPerimetro()));

    }
}
