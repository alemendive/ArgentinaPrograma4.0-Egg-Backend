import entidades.Cine;
import entidades.Espectador;
import entidades.SalaCine;
import service.CineService;

import java.util.ArrayList;
import java.util.Scanner;

public class Extra02main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CineService cineService = new CineService();
        SalaCine salaCine = cineService.crearSalaCine();
        ArrayList<Espectador> espectadores = new ArrayList<>();
        Espectador espectador1 = new Espectador("Mery", 25, 300.0);
        espectadores.add(espectador1);
        Espectador espectador2 = new Espectador("Carolina", 30, 150.0);
        espectadores.add(espectador2);
        Espectador espectador3 = new Espectador("Alejandro", 35, 700.0);
        espectadores.add(espectador3);
        Espectador espectador4 = new Espectador("Martin", 17, 1000.0);
        espectadores.add(espectador4);

        System.out.println("Ingrese el precio de la pelicula:");
        double precio = leer.nextDouble();

        Cine cine = cineService.crearCine(salaCine.getPelicula(), salaCine, precio);
        cineService.mostrarSalaCine(cine, salaCine);
        for (Espectador espectadore : espectadores) {
            System.out.println("Vendiendo butaca a: " + espectadore.nombre());
            System.out.println("Dinero disponible: " + espectadore.dineroDisponible());
            System.out.println("Edad: " + espectadore.edad());
            cineService.venderButaca(cine, salaCine, espectadore);
        }
    }
}