import Entidad.Ahorcado;
import Servicios.AhorcadoService;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        AhorcadoService service = new AhorcadoService();
        Ahorcado juego1 = service.crearJuego();
        char[] palabra = new char[juego1.getPalabra().length];
        Arrays.fill(palabra, '*');

        do {
            service.juego(juego1, palabra);
        } while (juego1.getJugadasMax() != 0 && juego1.getLetrasEncontradas() != juego1.getLongitud());

        if (juego1.getJugadasMax() == 0){
            System.out.println("Perdiste");
        }
        if (juego1.getLetrasEncontradas() == juego1.getLongitud()){
            System.out.println("Ganaste");
        }
    }
}