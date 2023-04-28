package ejercicio02.cafetera.Servicios;

import ejercicio02.cafetera.Entidad.Cafetera;

import java.util.Scanner;

/**
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera).
Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
        Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
        Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y
        simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
        El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
        Método vaciarCafetera(): pone la cantidad de café actual en cero.
        Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 **/
public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    public int llenarCafetera(Cafetera cafetera){
        return cafetera.getCapacidadMaxima();
    }

    public void servirTaza(Cafetera cafetera){

        System.out.println("Ingrese el tamaño de la taza en mililitros: ");
        int taza = leer.nextInt();

        if(taza > cafetera.getCantidadActual()) {
            System.out.println("No habia suficiente cafe en la cafetera, se lleno:  " +cafetera.getCantidadActual()+"ml.");
            cafetera.setCantidadActual(0);
        } else {
            System.out.println("Se lleno la taza");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
        }
    }
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera){
        System.out.println("Ingrese la cantidad de cafe a agregar en ml: ");
        int cafe = leer.nextInt();
        int resta = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();

        if(cafe <= resta){
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cafe);
        } else {
            System.out.println("La cantidad excede la capacidad de la cafetera.");
        }
    }

}
