import Entidad.Alumno;
import Service.AlumnoService;

import java.util.ArrayList;

public class Ejercicio3 {


    public static void main(String[] args) {
        AlumnoService service = new AlumnoService();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        service.crearAlumnos(alumnos);
        service.mostrarAlumnos(alumnos);
        service.notaFinal(alumnos);
        service.eliminarAlumno(alumnos);
        service.mostrarAlumnos(alumnos);
        service.modificarAlumno(alumnos);
        service.mostrarAlumnos(alumnos);

    }
}
