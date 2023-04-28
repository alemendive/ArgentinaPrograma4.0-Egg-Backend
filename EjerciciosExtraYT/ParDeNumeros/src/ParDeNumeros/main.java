package ParDeNumeros;

import ParDeNumeros.Entidad.ParDeNumeros;
import ParDeNumerosServicios.ParDeNumerosService;

public class main {

    public static void main(String[] args) {
        ParDeNumerosService service = new ParDeNumerosService();
        ParDeNumeros numeros = new ParDeNumeros();
//        Random aleatorio = new Random();
//        double numeroAleatorio = aleatorio.nextDouble(-100,100);
//        System.out.println(numeroAleatorio);
//        System.out.println(numeros.toString());
        service.mostrarValores(numeros);
        service.devolverMayor(numeros);
        service.calcularPotencia(numeros);
        service.calculaRaiz(numeros);
    }
}

