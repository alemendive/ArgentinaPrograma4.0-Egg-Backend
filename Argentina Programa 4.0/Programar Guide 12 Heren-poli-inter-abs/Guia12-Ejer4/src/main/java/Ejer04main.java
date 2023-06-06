import entidades.Circulo;
import entidades.Rectangulo;

public class Ejer04main {
    public static void main(String[] args) {

        Rectangulo rec1 = new Rectangulo(5d, 10d);
        System.out.println("Area: " + rec1.calcularArea() + " Perimetro: " + rec1.calcularPerimetro());
        Rectangulo rec2 = new Rectangulo(10d, 5d);
        System.out.println("Area: " + rec2.calcularArea() + " Perimetro: " + rec2.calcularPerimetro());
        Circulo circulo1 = new Circulo(5, 3.14, 10, 20);
        System.out.println("Area: " + circulo1.calcularArea() + " Perimetro: " + circulo1.calcularPerimetro());
        Circulo circulo2 = new Circulo(5, 3.14, 5, 10);
        System.out.println("Area: " + circulo2.calcularArea() + " Perimetro: " + circulo2.calcularPerimetro());
    }
}