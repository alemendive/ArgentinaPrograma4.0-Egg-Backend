package entidades;


public class Estudiante extends Persona {
    protected String curso;

    public Estudiante(String nombre, String apellidos, String DNI, String estadoCivil, String curso) {
        super(nombre, apellidos, DNI, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    public void matricular() {
        System.out.println("Ingrese el nombre del curso: ");
        curso = leer.next();
    }

    @Override
    public String toString() {
        return "Estudiante {" +
                "curso='" + curso + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
