package baraja.cartas;

import baraja.Palo;

public abstract class CartaConPalo extends Carta {
    private final Palo palo;

    public CartaConPalo(Palo palo) {
        this.palo = palo;
    }


    @Override
    public String getRepresentacion() {
        return " de " + palo;
    }

}
