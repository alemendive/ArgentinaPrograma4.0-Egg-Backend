public abstract class Edificio {
    //atributos: ancho, alto y largo.
    protected double ancho;
    protected double alto;
    protected double largo;



    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public abstract void calcularSuperficie();

    public abstract void calcularVolumen();

}
