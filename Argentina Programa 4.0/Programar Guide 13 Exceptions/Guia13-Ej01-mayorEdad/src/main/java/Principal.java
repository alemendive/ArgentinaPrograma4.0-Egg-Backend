import entidad.Persona;
import service.PersonaService;

public class Principal {
    public static void main(String[] args) {


        PersonaService crear = new PersonaService();

        Persona uno1 = null;
        try {
            crear.esMayorDeEdad(uno1);
        } catch (Exception e) {
            System.out.println("Persona no creada" + e.getMessage());
        }
        System.out.println("*****");


        Persona uno = crear.crearPersona();
        crear.esMayorDeEdad(uno);
        crear.calcularIMC(uno);

        Persona dos = crear.crearPersona();
        crear.esMayorDeEdad(dos);
        crear.calcularIMC(dos);

        Persona tres = crear.crearPersona();
        crear.esMayorDeEdad(tres);
        crear.calcularIMC(tres);

        Persona cuatro = crear.crearPersona();
        crear.esMayorDeEdad(cuatro);
        crear.calcularIMC(cuatro);

            int[] IMCs = {crear.calcularIMC(uno), crear.calcularIMC(dos), crear.calcularIMC(tres), crear.calcularIMC(cuatro)};
            int mayores = 0;
            int menores = 0;
            int menor = 0;
            int ideal = 0;
            int mayor = 0;

            for (int imc : IMCs) {
                switch (imc) {
                    case -1 -> menor++;
                    case 0 -> ideal++;
                    case 1 -> mayor++;
                }
            }

            int[] edades = crear.edades(uno, dos, tres, cuatro);

            for (int edade : edades) {
                if (edade > 18) {
                    mayores++;
                } else {
                    menores++;
                }
            }
            System.out.println("En el grupo de personas hay: " + mayores + " mayores de edad");
            System.out.println("El porcentaje de personas mayores es: " + (mayores * 100 / 4));

            System.out.println("En el grupo de personas hay: " + menores + " menores de edad");
            System.out.println("El porcentaje de personas menores es: " + (menores * 100 / 4));

            System.out.println("En el grupo de personas hay: " + menor + " debajo de su peso ideal");
            System.out.println("El porcentaje de personas debajo de su peso ideal es: " + (menor * 100 / 4));

            System.out.println("En el grupo de personas hay: " + ideal + " con su peso ideal");
            System.out.println("El porcentaje de personas con su peso ideal es: " + (ideal * 100 / 4));

            System.out.println("En el grupo de personas hay: " + mayor + " con sobrepeso");
            System.out.println("El porcentaje de personas con sobrepeso es: " + (mayor * 100 / 4));

        }

    }


