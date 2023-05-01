import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {
    /*
    Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
     */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> mascota = new ArrayList<>();
        String opc;

        do {
            System.out.println("Ingrese la raza de su perro: ");
            String perro = leer.nextLine();
            mascota.add(perro);
            System.out.println("Desea agregar mas perros? S/N");
            opc = leer.nextLine();

        } while (!opc.equalsIgnoreCase("N"));

        for (String aux : mascota) {
            System.out.println("[" + aux + "]");
        }

        Iterator<String> it = mascota.iterator();

        System.out.println("Elija un perro a eliminar: ");
        String elegido = leer.nextLine();
        boolean esta = false;
        while (it.hasNext()) {
            String aux = it.next();

            if (aux.equalsIgnoreCase(elegido)) {
                esta = true;
                it.remove();
            }
            if (esta) {
                System.out.println("El perro ha sido eliminado");
            } else {
                System.out.println("El perro no existe");
            }
            System.out.println("La lista de perros es de tamaño: " + mascota.size());
            mascota.forEach(System.out::println);

        }
    }
}

