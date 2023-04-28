/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopoo02.Entidad;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class Circunferencia {

    private double radio;
    // METODO CONSTRUCTOR QUE INICIALICE EL RADIO PASADO POR PARAMETRO.

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cual es el radio? ");
        radio = leer.nextDouble();

    }

    public double calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double calcularPerimetro() {
        double Circunferencia = Math.PI * radio;
        return Circunferencia;

    }

}
