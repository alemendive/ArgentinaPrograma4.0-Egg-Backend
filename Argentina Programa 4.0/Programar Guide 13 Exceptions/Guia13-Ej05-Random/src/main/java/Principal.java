import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /*
        Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
         */
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(500) + 1;
        System.out.println("Numero secreto: " + numeroSecreto);
        int intentos = 0;

        System.out.println("Intenta adivinar el numero Secreto entre 1 y 500");

        while (true) {
            System.out.println("Introduce tu numero: ");
            try {
                int numero = leer.nextInt();
                intentos++;
                System.out.println("Intento numero " + intentos);
                if (numeroSecreto == numero) {
                    System.out.println("Has acertado el numero secreto");
                    break;
                } else if (numeroSecreto > numero) {
                    System.out.println("El numero secreto es mayor");
                } else {
                    System.out.println("El numero secreto es menor");
                }
            } catch (InputMismatchException e) {
                System.out.println("El valor introducido no es un numero");
                leer.next();
            }
        }

    }
}
