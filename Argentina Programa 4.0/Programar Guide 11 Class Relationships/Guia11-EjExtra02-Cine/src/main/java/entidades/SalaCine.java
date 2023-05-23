package entidades;

import java.util.Arrays;

public class SalaCine {
    private final Butaca[][] butacas;
    private final String[] filas;
    private final String[] columnas;
    private Pelicula pelicula;

    public SalaCine(Butaca[][] butacas, String[] filas, String[] columnas) {
        this.butacas = butacas;
        this.filas = filas;
        this.columnas = columnas;
    }

    public Butaca[][] getButacas() {
        return butacas;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "SalaCine{" +
                "butacas=" + Arrays.toString(butacas) +
                ", filas=" + Arrays.toString(filas) +
                ", columnas=" + Arrays.toString(columnas) +
                ", pelicula=" + pelicula +
                '}';
    }
}
