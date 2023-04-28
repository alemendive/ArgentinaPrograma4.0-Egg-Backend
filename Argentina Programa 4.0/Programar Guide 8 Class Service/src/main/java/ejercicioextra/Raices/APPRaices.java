package ejercicioextra.Raices;


import ejercicioextra.Raices.Entidad.Raices;
import ejercicioextra.Raices.Services.RaicesServices;



public class APPRaices {

    public static void main(String[] args) {


        RaicesServices R1 = new RaicesServices();

        Raices raices = new Raices(2,5,-3);

        System.out.println(R1.getDiscriminante(raices));
            System.out.println(R1.tieneRaices());
            R1.obtenerRaices(raices);
            R1.obtenerRaiz(raices);


        R1.calcular(raices);


    }
}
