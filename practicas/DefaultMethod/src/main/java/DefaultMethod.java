public class DefaultMethod implements PersonaA, PersonaB {
        @Override
        public void caminar() {
            System.out.println("Caminando...");
        }

    @Override
    public void hablar() {
        /*PersonaB.super.hablar();*/
        System.out.println("Hola que tal");
    }


    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.hablar();

    }
}


