import Entidad.Cadena;
import Servicios.CadenaServicio;

public class main {
    public static void main(String[] args) {
        CadenaServicio ss=new CadenaServicio();
        Cadena frase=ss.crearFrase();
        ss.mostrarVocales(frase);
        ss.invertirFrase(frase);
        ss.vecesRepetido(frase);
        ss.comparaLongitud(frase);
        ss.unirFrase(frase);
        ss.remplazarLetra(frase);
        System.out.println(ss.contieneLetra(frase));

    }

}

