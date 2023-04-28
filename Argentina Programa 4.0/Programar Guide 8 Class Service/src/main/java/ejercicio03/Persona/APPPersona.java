package ejercicio03.Persona;

import ejercicio03.Persona.Entidad.Persona;
import ejercicio03.Persona.Servicios.PersonaServicios;

/**
 Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad, sexo
 (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
 En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona.
 Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje


 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
 Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
 Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0.
 Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 A continuación, en la clase main hacer lo siguiente:
 Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto,
 deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
 Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
 para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
 también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.
**/

public class APPPersona {
    public static void main(String [] args){
        int mayores = 0;
        int menores = 0;
        int menor = 0;
        int ideal = 0;
        int mayor = 0;

        PersonaServicios crear = new PersonaServicios();
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

        int IMCs[] = { crear.calcularIMC(uno), crear.calcularIMC(dos), crear.calcularIMC(tres),crear.calcularIMC(cuatro)};
        for (int i = 0; i < IMCs.length; i++) {
            switch (IMCs[i]){
                case -1:
                    menor++;
                    break;
                case 0:
                    ideal++;
                    break;
                case 1:
                    mayor++;
                    break;
            }
        }

        int edades[] = crear.edades(uno, dos,tres, cuatro);

        for (int i = 0; i < edades.length; i++) {
            if (edades[i] > 18){
                mayores++;
            } else {
                menores++;
            }
        }
        System.out.println("En el grupo de personas hay: "+ mayores+ " mayores de edad");
        System.out.println("El porcentaje de personas mayores es: "+(mayores*100/4));

        System.out.println("En el grupo de personas hay: "+ menores+ " menores de edad");
        System.out.println("El porcentaje de personas menores es: "+(menores*100/4));

        System.out.println("En el grupo de personas hay: "+ menor+ " debajo de su peso ideal");
        System.out.println("El porcentaje de personas debajo de su peso ideal es: "+(menor*100/4));

        System.out.println("En el grupo de personas hay: "+ ideal+ " con su peso ideal");
        System.out.println("El porcentaje de personas con su peso ideal es: "+(ideal*100/4));

        System.out.println("En el grupo de personas hay: "+ mayor+ " con sobrepeso");
        System.out.println("El porcentaje de personas con sobrepeso es: "+(mayor*100/4));



    }



}
