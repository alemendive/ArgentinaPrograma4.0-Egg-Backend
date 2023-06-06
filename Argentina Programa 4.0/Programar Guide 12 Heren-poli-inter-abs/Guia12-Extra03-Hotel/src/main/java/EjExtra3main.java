import entidad.*;
import service.AlojamientoService;

import java.util.ArrayList;

public class EjExtra3main {
    public static void main(String[] args) {
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();

        Hotel4Estrellas hotel1 = new Hotel4Estrellas("Hotel Horizonte 4 Estrellas", "Calle Sarmiento 4456", "Cordoba", "Rodolfo Perez", 10, 2, 5, 50, "B", "Restaurante 4 Estrellas", 20);
        Hotel4Estrellas hotel2 = new Hotel4Estrellas("Hotel Feliz 4 Estrellas", "Calle Salta 100", "Salta", "Marcelo Sanchez", 2, 2, 3, 50, "B", "Comedor General", 10);
        Hotel5Estrellas hotel3 = new Hotel5Estrellas("Hotel Deluxe 5 Stars", "Av. Rosas 546", "Rosario", "Guillermo Francella", 50, 3, 10, 50, "A", "Restaurante Deluxe", 40, 2, 3, 5);
        Hotel5Estrellas hotel4 = new Hotel5Estrellas("Hotel International 5 Stars", "Av. 9 de Julio 123", "Buenos Aires", "Ricardo Darin", 150, 4, 15, 50, "A", "Restaurante Internacional Open Bar", 150, 2, 6, 15);
        hotel1.calcularPrecioHabitacion();
        hotel2.calcularPrecioHabitacion();
        hotel3.calcularPrecioHabitacion();
        hotel4.calcularPrecioHabitacion();
        alojamientos.add(hotel1);
        alojamientos.add(hotel2);
        alojamientos.add(hotel3);
        alojamientos.add(hotel4);
        Camping camping1 = new Camping("Camping Lobos", "Calle Pedro 435", "Buenos Aires", "Enzo Perez", 100, 20, true);
        Camping camping2 = new Camping("Camping El Pino", "Calle Tomas 152", "Santa Fe", "Luisa Godoy", 50, 15, false);
        alojamientos.add(camping1);
        alojamientos.add(camping2);
        Residencia residencia1 = new Residencia("Residencia Los Palos", "Av Siempre Viva 49", "Mar del Plata", "Rosa Maria", 5, true, false);
        Residencia residencia2 = new Residencia("Residencia Bien Estar", "Calle La Falda 789", "La Plata", "Juan Ackerman", 10, false, true);
        alojamientos.add(residencia1);
        alojamientos.add(residencia2);

        AlojamientoService alojamientoService = new AlojamientoService();
        alojamientoService.menu(alojamientos);

    }
}