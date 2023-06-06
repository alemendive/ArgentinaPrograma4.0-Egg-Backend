package entidades;

import java.util.concurrent.TimeUnit;

public class Yate extends Barco {
    private final int  potenciaCV;
    private final int numCamarotes;



    public Yate(String matricula, double eslora, int anioFabricacion, int potenciaCV, int numCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    @Override
    public void totalAlquiler() {
        long diferencia = alquiler.getFechaDevolucion().getTimeInMillis() - alquiler.getFechaAlquiler().getTimeInMillis();
        long dias = TimeUnit.DAYS.convert(diferencia, TimeUnit.MILLISECONDS);
        System.out.println("Total Alquiler: " + (dias * (eslora + potenciaCV + numCamarotes) * 10));
    }

    @Override
    public String toString() {
        return "Yate{" +
                "potenciaCV=" + potenciaCV +
                ", numCamarotes=" + numCamarotes +
                ", matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }
}