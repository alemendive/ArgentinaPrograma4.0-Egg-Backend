import Service.TiendaService;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        TiendaService tiendaService = new TiendaService();
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("coca-cola", 10.0);
        productos.put("leche", 5.0);
        productos.put("pan", 2.0);
        productos.put("arroz", 3.0);
        productos.put("huevos", 4.0);
        productos.put("carne", 15.0);
        int menu = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Promedio productos");
            System.out.println("6. Salir");

            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    tiendaService.agregarProducto(productos);
                    break;
                case 2:
                    tiendaService.modificarProducto(productos);
                    break;
                case 3:
                    tiendaService.eliminarProducto(productos);
                    break;
                case 4:
                    tiendaService.mostrarProductos(productos);
                    break;
                case 5:
                    tiendaService.promedioProductos(productos);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (menu != 6);
    }
}
