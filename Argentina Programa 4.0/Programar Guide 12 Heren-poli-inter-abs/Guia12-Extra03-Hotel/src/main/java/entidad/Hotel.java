package entidad;

import java.util.Scanner;

public class Hotel extends Alojamiento {
    //Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
    //Pisos, Precio de Habitaciones.
    protected int cantidadHabitaciones;
    protected int numeroCamas;
    protected int cantidadPisos;
    protected double precioHabitaciones;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "cantidadHabitaciones=" + cantidadHabitaciones +
                ", numeroCamas=" + numeroCamas +
                ", cantidadPisos=" + cantidadPisos +
                ", precioHabitaciones=" + precioHabitaciones +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
}