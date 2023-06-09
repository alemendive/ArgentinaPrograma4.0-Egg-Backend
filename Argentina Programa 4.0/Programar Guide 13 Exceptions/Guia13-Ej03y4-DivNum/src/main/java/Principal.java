
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /* * Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
         * números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
         * para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int.
         * Por ultimo realizar una división con los dos numeros y mostrar el resultado.*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        String numero1 = leer.nextLine();
        System.out.println("Ingrese otro numero: ");
        String numero2 = leer.nextLine();

        try {
            int num1 = Integer.parseInt(numero1);
            int num2 = Integer.parseInt(numero2);
            System.out.println("El resultado es: " + num1 / num2);
        } catch (NumberFormatException | NullPointerException nfe) {
            System.out.println("No puede ingresar letras");
            System.out.println("Error: " + nfe.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println("No se puede dividir por 0");
        } catch (Exception e) {
            System.out.println("Error:  " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Adios");
        }
    }
}

