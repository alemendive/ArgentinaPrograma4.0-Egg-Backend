

package ejercicio.ejerciciovehiculo;

import java.util.Scanner;


public class EjercicioVehiculo {
    
    public static int indiceCocheMBarato(Vehiculo coches[]){
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if(coches[i].getPrecio() < precio)
                precio = coches[i].getPrecio();
            indice = i;
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos,indiceBarato;
        
        System.out.print("Digite la cantidad de vehiculos:");
        numeroVehiculos = src.nextInt();
        
        
        //Creamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];
        
        for (int i = 0; i < coches.length; i++) {
            src.nextLine();
            System.out.println("\nDigite las caracteristicas del Coche "+(i+1)+":");
            System.out.println("Introduzca Marca: ");
            marca = src.nextLine();
            System.out.println("Introduzca Modelo: ");
            modelo = src.nextLine();
            System.out.print("Introduzca Precio: ");
            precio = src.nextFloat();
            
            coches[i] = new Vehiculo(marca, modelo, precio);
            
        }
        
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
        
    }
}

