import Entidad.Persona;
import PersonaService.PersonaService;

import java.util.Scanner;

public class main {
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        PersonaService sc = new PersonaService();
        Persona uno = sc.crearPersona();

        System.out.println("La edad es: "+sc.calcularEdad(uno));
        System.out.println("La edad es menor que 21: " +sc.menorQue(uno,21));
        System.out.println("Los datos son: "+sc.mostrarPersona(uno));
    }
}
