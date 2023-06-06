package baraja.cartas;

import baraja.Palo;

public class CartaFigura extends CartaConPalo {
    private final char letra;

    public CartaFigura(Palo palo, char letra) {
        super(palo);
        this.letra = letra;
    }

    @Override
    public String getRepresentacion() {
        return letra + " de " + super.getRepresentacion();
    }
}
