import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int y, z;
        System.out.println("Ingrese y: ");
        y = new Scanner(System.in).nextInt();
        z = new Calculadora().factorial(y);
        System.out.println("El resultado es: " + z);
        System.out.println("Adios");

    }
}
