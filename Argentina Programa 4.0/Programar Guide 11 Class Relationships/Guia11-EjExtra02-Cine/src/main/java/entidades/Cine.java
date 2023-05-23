package entidades;

public class Cine {
    private final Pelicula pelicula;
    private final SalaCine sala;
    private final double precio;


    public Cine(Pelicula pelicula, SalaCine sala, double precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Cine{" +
                "pelicula=" + pelicula +
                ", sala=" + sala +
                ", precio=" + precio +
                '}';
    }
}
