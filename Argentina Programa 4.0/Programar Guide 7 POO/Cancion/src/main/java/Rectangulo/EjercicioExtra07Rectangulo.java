

import ejercicio.ejercicioextra07rectangulo.Entidad.Rectangulo;
import java.util.Scanner;


public class EjercicioExtra07Rectangulo {

    public static void main(String[] args) {
       Rectangulo rect1 = new Rectangulo();
       Scanner leer= new Scanner(System.in); 
       
        System.out.println("Ingrese el lado1");
        rect1.setLado1(leer.nextInt());
        System.out.println("Ingrese el lado2");
        rect1.setLado2(leer.nextInt());
        System.out.println("El area del rectangulo rect1 es: "+ rect1.calcularArea());
        
        Rectangulo rect2 = new Rectangulo(4,6);
        System.out.println("El area del rectangulo rect2 es: "+ rect2.calcularArea());
        
    }
}
