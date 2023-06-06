package enumeraciones;

public enum Departamento {
    LENGUAJES("Lenguajes"),
    MATEMATICAS("Matemáticas"),
    HISTORIA("Historia"),
    CIENCIAS("Ciencias"),
    ARQUITECTURA("Arquitectura"),
    COMPUTACION("Computación");

    private String descripcion;

    private Departamento(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
