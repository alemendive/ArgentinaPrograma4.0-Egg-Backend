public class Principal {
    public static void main(String[] args) {
        CentroEducativo c = new CentroEducativo();

        Alumno pepe = new Alumno("123", "Fulano", "Pepe");
        Alumno juan = new Alumno("456", "Fulano", "Juan");
        Alumno maria = new Alumno("789", "Fulano", "Maria");

        pepe.agregarExamen(new ExamenEscrito("00/00/0000", 40,7 ));
        pepe.agregarExamen(new ExamenOral("00/00/0000", NivelSatisfaccion.SUFICIENTE ));

        maria.agregarExamen(new ExamenEscrito("00/00/0000", 60,4 ));
        maria.agregarExamen(new ExamenEscrito("00/00/0000", 65,8 ));
        maria.agregarExamen(new ExamenOral("00/00/0000", NivelSatisfaccion.EXCELENTE ));

        juan.agregarExamen(new ExamenEscrito("00/00/0000", 100,9 ));
        juan.agregarExamen(new ExamenOral("00/00/0000", NivelSatisfaccion.INSUFICIENTE ));
        juan.agregarExamen(new ExamenOral("00/00/0000", NivelSatisfaccion.EXCELENTE ));


        c.agregarAlumno(pepe);
        c.agregarAlumno(maria);
        c.agregarAlumno(juan);

        System.out.println("Cantidad de aprobados: " + c.cantAprobados());





    }
}
