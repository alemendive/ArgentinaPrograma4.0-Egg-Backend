package entidades;

public class Empleado extends Persona {
    private final int anioIncorporacion;
    private int numeroDespacho;

    public Empleado(String nombre, String apellidos, String DNI, String estadoCivil, int anioIncorporacion, int numeroDespacho) {
        super(nombre, apellidos, DNI, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public void reasignarDespacho() {
        System.out.println("Reasignando despacho");
        System.out.println("Ingrese el nuevo número de despacho");
        numeroDespacho = leer.nextInt();
    }

@Override
public String toString(){
        return"Empleado{"+
        "anioIncorporacion="+anioIncorporacion+
        ", numeroDespacho="+numeroDespacho+
        ", nombre='"+nombre+'\''+
        ", apellidos='"+apellidos+'\''+
        ", DNI='"+DNI+'\''+
        ", estadoCivil='"+estadoCivil+'\''+
        '}';
        }
        }

