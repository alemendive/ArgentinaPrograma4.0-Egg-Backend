package entidad;

import java.util.Scanner;

public class Camping extends Alojamiento {
    //Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
    //disponibles y si posee o no un restaurante dentro de las instalaciones.
    protected int capacidadMaximaCarpas;
    protected int cantidadBanios;
    protected boolean poseeRestaurante;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public Camping(String nombre, String direccion, String localidad, String gerente, int capacidadMaximaCarpas, int cantidadBanios, boolean poseeRestaurante) {
        super(nombre, direccion, localidad, gerente);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanios = cantidadBanios;
        this.poseeRestaurante = poseeRestaurante;
    }

    public boolean isPoseeRestaurante() {
        return poseeRestaurante;
    }


    @Override
    public String toString() {
        return "Camping{" +
                "capacidadMaximaCarpas=" + capacidadMaximaCarpas +
                ", cantidadBaños=" + cantidadBanios +
                ", poseeRestaurante=" + poseeRestaurante +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
    /*public Camping crearCamping(){
        System.out.println("Ingrese el nombre del alojamiento");
        this.nombre = leer.next();
        System.out.println("Ingrese la dirección del alojamiento");
        this.direccion = leer.next();
        System.out.println("Ingrese la localidad del alojamiento");
        this.localidad = leer.next();
        System.out.println("Ingrese el gerente del alojamiento");
        this.gerente = leer.next();
        System.out.println("Ingrese la capacidad máxima de carpas");
        this.capacidadMaximaCarpas = leer.nextInt();
        System.out.println("Ingrese la cantidad de baños");
        this.cantidadBanios = leer.nextInt();
        System.out.println("Ingrese si posee restaurante (1=Si, 0=No)");
        this.poseeRestaurante = leer.nextInt() == 1;
        return this;
    }*/
}
