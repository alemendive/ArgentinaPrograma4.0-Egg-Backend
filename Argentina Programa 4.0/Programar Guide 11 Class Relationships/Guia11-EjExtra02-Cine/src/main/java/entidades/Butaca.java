package entidades;

public class Butaca {
    private final String numero;
    private final String letra;
    private String estado;

    public Butaca(String numero, String letra, String estado) {
        this.numero = numero;
        this.letra = letra;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return numero + letra + estado + "|";
    }
}
