public class Polideportivo extends Edificio {
    private final boolean techado;


    public Polideportivo(double ancho, double alto, double largo, boolean techado) {
        super(ancho, alto, largo);
        this.techado = techado;
    }

    public boolean isTechado() {
        return techado;
    }


    @Override
    public void calcularSuperficie() {
        System.out.println("Superficie: " + ancho * largo + "m2");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Volumen: " + alto * ancho * largo + "m3");
    }
}

