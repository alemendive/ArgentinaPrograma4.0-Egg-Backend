import CursosService.CursosService;
import Entidad.Curso;

public class main {
    public static void main(String[] args) {

        CursosService sc = new CursosService();
        Curso uno = sc.crearCurso();
        System.out.println(uno);
        System.out.println("La ganancia por semana es: "+sc.calcularGananciaSemana1(uno));

    }
}
