package Service;

import Entidad.Productos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void agregarProducto(HashMap<String, Double> productos) {
        Productos producto = new Productos();
        System.out.println("Ingrese el nombre del nuevo producto:");
        producto.setNombre(leer.next());
        System.out.println("Ingrese el precio del producto:");
        producto.setPrecio(leer.nextDouble());
        productos.put(producto.getNombre(), producto.getPrecio());
    }

    public void modificarProducto(HashMap<String, Double> productos) {
        System.out.println("Ingrese el nombre del producto que desea modificar:");
        String nombre = leer.next();
        System.out.println("Ingrese el nuevo precio del producto:");
        Double precio = leer.nextDouble();
        if (productos.containsKey(nombre)) {
            productos.put(nombre, precio);
            System.out.println("El producto ha sido modificado");
        } else {
            System.out.println("El producto no existe!");
        }
    }

    public void eliminarProducto(HashMap<String, Double> productos) {
        System.out.println("Ingrese el nombre del producto que desea eliminar");
        String nombre = leer.next();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("El producto ha sido eliminado");
        } else {
            System.out.println("El producto no existe!");
        }
    }

    public void mostrarProductos(HashMap<String, Double> productos) {
        ArrayList<String> lista = new ArrayList<>(productos.keySet());
//        System.out.println("Lista de productos:");
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i)+" "+productos.get(lista.get(i)));
//        }
//        System.out.println();
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    //Calcular promedio de los precios de los productos
    public void promedioProductos(HashMap<String, Double> productos) {
        double suma = 0;
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            suma += entry.getValue();
        }
        System.out.println("El promedio de los productos es: " + suma / productos.size());
    }

}
