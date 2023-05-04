import java.util.Scanner;

public class Aerolinea {

    public static void main(String[] args) {

        //crear la matriz
        int[][] vuelos = new int[6][3];

        //cargar la matriz
        Scanner leer = new Scanner(System.in);

        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la cantidad de asientos para el destino: " + f + " horario: " + c);
                vuelos[f][c] = leer.nextInt();
            }
        }
        //venta de asientos
        Scanner leer2 = new Scanner(System.in);
        String bandera = "";
        int destino, horario, asientos;

        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println("Ingrese el Nro de destino");
            destino = leer.nextInt();
            System.out.println("Ingrese el horario de vuelo");
            horario = leer.nextInt();
            System.out.println("Ingrese la cantidad de asientos");
            asientos = leer.nextInt();

            if (destino >= 0 && destino <= 5) {
                if (horario >= 0 && horario <= 2) {
                    if (vuelos[destino][horario] >= asientos) {
                        System.out.println("Su reserva fue realizada con éxito");
                        vuelos[destino][horario] = vuelos[destino][horario] - asientos;
                    } else {
                        System.out.println("No hay asientos disponibles");
                    }
                } else {
                    System.out.println("Horario no existente. Ingrese entre 0 y 2");
                }
            } else {
                System.out.println("Destino no existente. Ingrese entre 0 y 5");
            }
            System.out.println("Desea continuar reservando?. Ingrese finish para terminar o cualquier valor para seguir");
            bandera = leer2.next();
        }
    }
}

