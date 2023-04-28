package ejercicioextra.Raices.Services;

import ejercicioextra.Raices.Entidad.Raices;


public class RaicesServices {



    double discriminante;

    double positivo, negativo;

    public double getDiscriminante(Raices raiz) {
        //(b^2)-4*a*c
        discriminante = (Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC();
        return discriminante;
    }

    public boolean tieneRaices() {

        return discriminante >= 0;
    }

    public boolean tieneRaiz(Raices raiz) {

        double discriminante = getDiscriminante(raiz);
        return discriminante == 0;
    }

    public void obtenerRaices(Raices raiz) {

        if (tieneRaiz(raiz)) {
            positivo = (-raiz.getB() + Math.sqrt((Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC())) / (2 * raiz.getA());
            negativo = (-raiz.getB() - Math.sqrt((Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC())) / (2 * raiz.getA());

            System.out.println(positivo);
            System.out.println(negativo);

        } else {
            System.out.println("No existe unica solucion.");
        }

    }

    public void obtenerRaiz(Raices raiz) {


        if (tieneRaiz(raiz)) {


            positivo = (-raiz.getB() + Math.sqrt((Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC())) / (2 * raiz.getA());
            System.out.println(positivo);
        }
    }
    public void calcular(Raices raiz){
        if (tieneRaices()) {
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz)) {
            obtenerRaiz(raiz);
        } else {
            System.out.println("No existen soluciones reales.");
        }
        System.out.println("================================================");

    }
}
