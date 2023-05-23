package enumeraciones;

public enum Razaperro {
    BEAGLE( "Beagle"), BULLDOG( "Bulldog"), BOXER("Boxer"), DALMATA("Dalmata"), GOLDEN_RETRIEVER("Golden Retriever"),
    ROTTWEILER( "Rottweiler"), YORKSHIRE_TERRIER( "Yorkshire Terrier"), CANICHE("Caniche"), WEIMARANER("Weimaraner");


    private final String nombre;

    Razaperro(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return nombre;
    }
}
