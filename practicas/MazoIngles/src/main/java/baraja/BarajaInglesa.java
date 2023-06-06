package baraja;

import baraja.cartas.Carta;
import baraja.cartas.CartaFigura;
import baraja.cartas.CartaJoker;
import baraja.cartas.CartaNumeral;

import java.util.ArrayList;

public class BarajaInglesa {
    private final ArrayList<Carta> cartas;

    public BarajaInglesa() {
        this.cartas = new ArrayList<>();
        generarCartas();
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            carta.darVuelta();
            carta.mostrar();

        }
    }
    private void generarCartas() {
        generarCartasNumerales();
        generarCartasFiguras();
        generarCartasJokers();
    }

    private void generarCartasNumerales() {
        final int MIN_VALOR = 2;
        final int MAX_VALOR = 10;
        Palo[] palos = Palo.values();

        for (Palo paloActual : palos) {
            for (int i = MIN_VALOR; i <= MAX_VALOR; i++) {
                this.cartas.add(new CartaNumeral(paloActual, i));
            }
        }
    }

    private void generarCartasFiguras() {
        char[] letras = {'A', 'J', 'Q', 'K'};
        Palo[] palos = Palo.values();

        for (Palo paloActual : palos) {
            for (char letraActual : letras) {
                this.cartas.add(new CartaFigura(paloActual, letraActual));
            }
        }
    }

    private void generarCartasJokers() {
        this.cartas.add(new CartaJoker(true));
        this.cartas.add(new CartaJoker(false));
    }
}

