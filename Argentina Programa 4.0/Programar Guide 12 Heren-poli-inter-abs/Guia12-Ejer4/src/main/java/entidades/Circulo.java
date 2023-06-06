package entidades;

import Interfaces.calculosFormas;

public class Circulo implements calculosFormas {
    protected double radio;
    protected double pi = 3.14;
    protected double area;
    protected double perimetro;

    public Circulo() {
    }

    public Circulo(double radio, double pi, double area, double perimetro) {
        this.radio = radio;
        this.pi = pi;
        this.area = area;
        this.perimetro = perimetro;
    }

    @Override
    public double calcularArea() {
        this.area = pi * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro = 2 * pi * radio;
        return perimetro;
    }
}
