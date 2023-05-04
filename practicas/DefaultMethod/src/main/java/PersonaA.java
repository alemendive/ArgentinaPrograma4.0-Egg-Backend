public interface PersonaA {
    public void caminar();

    default public void hablar() {
        System.out.println("Hola soy una persona A");
    }
}
