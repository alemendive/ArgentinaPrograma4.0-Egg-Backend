import Entidad.Arreglos;
import Service.ArregloService;



import Service.ArregloService;


public class main {


    public static void main(String[] args) {

        double [] arregloA = new double[50];
        double [] arregloB = new double[20];
        ArregloService SC = new ArregloService();

        //Arreglos uno = new Arreglos();
        SC.inicializarA(arregloA);
        System.out.println("");
        SC.mostrar(arregloA);
        System.out.println("");
        SC.ordenar(arregloA);
        SC.inicializarB(arregloB, arregloA);
        System.out.println("");
        SC.mostrar(arregloA);
        System.out.println(" ");
        SC.mostrarB(arregloB);


        // Arreglos dos = SC.inicializarA(arregloB);

    }

}
