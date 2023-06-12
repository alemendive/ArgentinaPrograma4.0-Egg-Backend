import entidad.Persona;
import service.PersonaService;
/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
 */

public class Principal {
    public static void main(String[] args) {


        PersonaService crear = new PersonaService();

        Persona uno1 = null;
        try {
            crear.esMayorDeEdad(uno1);
        } catch (NullPointerException npe) {
            System.out.println("Persona no creada " + npe.getMessage());
        }
        System.out.println("Adios!");
    }
}


