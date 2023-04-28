package ejercicio03.Persona.Servicios;

import ejercicio03.Persona.Entidad.Persona;

import java.util.Scanner;

public class PersonaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public boolean esMayorDeEdad(Persona nombre){
        boolean mayor = true;
        if(nombre.getEdad()>18){
            mayor = true;
           // System.out.println("Es mayor de edad.");
        } else {
            mayor = false;
           // System.out.println("Es menor de edad.");
        } return mayor;
    }

    public Persona crearPersona() {
        String sexo;
        System.out.println("Crearemos su usuario");
        System.out.println("Ingrese su nombre:");
        String nombre = leer.next();
        System.out.println("ingrese su edad:");
        int edad = leer.nextInt();

        do {
            System.out.println("Ingrese su sexo: " + "H (Hombre) --- M (Mujer) --- O (otro)");
            sexo = leer.next();
            if(!sexo.equalsIgnoreCase("h")&&!sexo.equalsIgnoreCase("m")&&!sexo.equalsIgnoreCase("o")); {
                System.out.println("Ingrese una respuesta correcta");
            }

        } while (!sexo.equalsIgnoreCase("h")&&!sexo.equalsIgnoreCase("m")&&!sexo.equalsIgnoreCase("o"));


        System.out.println("Ingrese el peso: ");
        int peso = leer.nextInt();
        System.out.println("Ingrese su altura: ");
        double altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);

    }
    public int calcularIMC(Persona nombre){
        int peso = nombre.getPeso();
        int resultado;
        double altura = nombre.getAltura();
        double imc = (peso / (Math.pow(altura,2)));
        if(imc < 20){
            resultado = -1;
            //System.out.println("Su peso es menor al peso ideal");
        } else if (imc > 25) {
            resultado = 1;
           // System.out.println("Su peso es mayor al peso ideal");
        } else {
            resultado = 0;
           // System.out.println("Su peso es ideal");
        }
        System.out.println(imc);
        return resultado;
    }

    public int[] edades(Persona uno, Persona dos, Persona tres, Persona cuatro) {
        int edades[] = {uno.getEdad(), dos.getEdad(),tres.getEdad(),cuatro.getEdad()};
        return edades;
    }

}
