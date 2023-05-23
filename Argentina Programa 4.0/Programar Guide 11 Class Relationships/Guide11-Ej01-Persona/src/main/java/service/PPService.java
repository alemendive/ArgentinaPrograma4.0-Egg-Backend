package service;

import entidad.Perro;
import entidad.Persona;
import enumeraciones.Razaperro;

import java.util.Scanner;

public class PPService {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        //Datos persona
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona:");
        persona.setApellido(leer.next());
        System.out.println("Ingrese la edad de la persona:");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el dni de la persona:");
        persona.setDni(leer.nextInt());
        return persona;
    }

    public Perro crearPerro() {
        //Datos perro
        Perro perro = new Perro();
        System.out.println("Ingrese el nombre del perro:");
        perro.setNombre(leer.next());
        System.out.println("Ingrese la raza del perro:");
        perro.setRaza(leer.next());

        for (Razaperro aux : Razaperro.values()){
            if(aux.toString().equals(perro.getRaza())){
                perro.setRaza(String.valueOf(aux));
                break;
            }
        }

            System.out.println("Ingrese la edad del perro:");
            perro.setEdad(leer.nextInt());
            System.out.println("Ingrese el tamaño del perro:");
            perro.setTamanio(leer.nextInt());
            return perro;
        }
    }

