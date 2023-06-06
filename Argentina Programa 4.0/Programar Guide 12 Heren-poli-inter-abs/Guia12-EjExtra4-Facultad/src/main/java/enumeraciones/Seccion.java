package enumeraciones;

public enum Seccion {
    BIBLIOTECA("Biblioteca"), DECANO("Decano"), SECRETARIA("Secretaria"), ADMINISTRATIVO("Administrativo"), SEGURIDAD("Seguridad"),TALLERES("Talleres"),
    INGENIERIA("Ingenieria"), MANTENIMIENTO("Mantenimiento"), SISTEMAS("Sistemas"), ELECTRONICA("Electronica");

    private String descripcion;

    private Seccion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
