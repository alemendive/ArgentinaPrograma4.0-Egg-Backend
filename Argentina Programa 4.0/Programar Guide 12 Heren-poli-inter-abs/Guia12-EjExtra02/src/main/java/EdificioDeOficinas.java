
public class EdificioDeOficinas extends Edificio {

    private final int numOficinas;
    private final int cantPersonasOficina;
    private final int numPisos;

    public EdificioDeOficinas(double ancho, double alto, double largo, int numOficinas, int cantPersonasOficina, int numPisos) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonasOficina = cantPersonasOficina;
        this.numPisos = numPisos;
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("Superficie: " + ancho * alto + "m2");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Volumen: " + alto * alto * largo + "m3");
    }

    public void cantPersonas() {
        System.out.println("Cantidad de personas por Piso: " + cantPersonasOficina * numOficinas);
        System.out.println("Cantidad de personas por Edificio: " + cantPersonasOficina * numOficinas * numPisos);
    }
}


