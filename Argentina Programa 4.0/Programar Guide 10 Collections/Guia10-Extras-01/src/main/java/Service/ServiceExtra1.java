package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ServiceExtra1 {
    Scanner leer = new Scanner(System.in);
    List<Integer> numeros = new ArrayList<>();

    double suma = 0;

    public void cargarArray(){
        int num;
        boolean salir = false;

        do{
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            if(num != -99){
                numeros.add(num);
                suma += num;
            }else{
                salir = true;
            }

        } while (!salir);
    }

    public void mostrarArray() {
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("La suma de los numeros es: " + suma);
            System.out.println("El promedio es: " + suma / numeros.size());
        }


    }
}
