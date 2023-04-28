package Service;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Date fechaNacimiento(){
//Método fechaNacimiento que pregunte al usuario día, mes y año de
//su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
//El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
//new Date(anio, mes, dia);
        int dia;
        int mes;
        int anio;

        System.out.println("Ingrese su fecha de nacimiento: ");
        System.out.println("Ingrese el día: ");
        dia= leer.nextInt();
        System.out.println("Ingrese el mes: ");
        mes= leer.nextInt();
        System.out.println("Ingrese el año: ");
        anio= leer.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        System.out.println(fecha);
        return fecha;

    }

    public Date fechaActual(){
//Método fechaActual que cree un objeto fecha con el día actual. Para
//esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new Date();
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        return fechaActual;
    }

    public int diferencia(Date Fecha1, Date Fecha2){
//Método diferencia que reciba las dos fechas por parámetro y retorna
//la diferencia de años entre una y otra (edad del usuario).

        long diff = Fecha1.getTime() - Fecha2.getTime();
        long diffYears = diff / (24 * 60 * 60 * 1000) / 365; // calcula la diferencia en años
        System.out.println(diffYears);
        return (int) diffYears;

    }
    public void diferencia2(Date fecha1, Date fecha2){
        System.out.print("Edad del usuario: ");
        int restaDia = Math.abs(fecha1.getDate()-fecha2.getDate());
        int difAnio= Math.abs(fecha1.getYear()-fecha2.getYear());
        if (restaDia==0) {
            System.out.print(Math.abs(fecha1.getDate()-fecha2.getDate())+" Dias ");
            System.out.print(Math.abs(fecha1.getMonth()-fecha2.getMonth())+" Mes/es ");
            System.out.print(Math.abs(fecha1.getYear()-fecha2.getYear())+" Años");
        }else {
            difAnio = difAnio-1;
            System.out.print(difAnio + " Años");
            System.out.println(" ");
        }
    }
}
