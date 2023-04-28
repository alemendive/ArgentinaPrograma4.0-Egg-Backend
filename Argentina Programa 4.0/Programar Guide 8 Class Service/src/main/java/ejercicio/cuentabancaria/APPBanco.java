

package ejercicio.cuentabancaria;


import ejercicio.cuentabancaria.Entidad.CuentaEntidad;
import java.util.Scanner;
import ejercicio.cuentabancaria.Servicios.CuentaBancariaServicio;

public class APPBanco {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        //Definimos Servicio para acceder a los metodos de la clase servicio
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        //Creamos cuenta
        CuentaEntidad cuenta = servicio.crearCuenta();

        int menu = -1;
        do {
            System.out.println();
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Ingresar Dinero");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Extraccion Rapida (Max 20% del saldo)");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("0. SALIR");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    servicio.ingresar(cuenta);
                    break;
                case 2:
                    servicio.retirar(cuenta);
                    break;
                case 3:
                    servicio.extraccionRapida(cuenta);
                    break;
                case 4:
                    servicio.consultarSaldo(cuenta);
                    break;
                case 5:
                    servicio.consultarDatos(cuenta);
                    break;
                default:
            }
        } while (menu != 0);


    }
}