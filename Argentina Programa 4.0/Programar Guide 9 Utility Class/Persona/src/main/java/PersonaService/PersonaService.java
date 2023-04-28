package PersonaService;

import Entidad.Persona;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    Scanner entrada = new Scanner(System.in);
    public Persona crearPersona(){


        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el dia: ");
        int dia = entrada.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = entrada.nextInt();
        System.out.println("Ingrese el año: ");
        int anio = entrada.nextInt();
        Date fechaNac = new Date(anio-1900,mes-1,dia);
        return new Persona(nombre,fechaNac);
    }

    public int calcularEdad(Persona uno){
        Date fechaNac = uno.getFechaNac();
        Date fechaActual = new Date();
//        System.out.println(Math.abs(fechaActual.getYear()-persona.getFechaNacimiento().getYear())+" Años");
        int anios = fechaActual.getYear() - fechaNac.getYear();
        if (fechaNac.getMonth() > fechaActual.getMonth() ||
                (fechaNac.getMonth() == fechaActual.getMonth() && fechaNac.getDate() > fechaActual.getDate())) {
            anios--;
        }
        return anios;
    }

    public boolean menorQue(Persona uno, int edad){
        return calcularEdad(uno)<edad;
    }

    public String mostrarPersona(Persona uno){
        return uno.toString();
    }

}
