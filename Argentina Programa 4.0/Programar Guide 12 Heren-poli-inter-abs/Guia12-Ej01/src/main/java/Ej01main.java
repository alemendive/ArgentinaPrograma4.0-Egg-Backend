import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;
import services.AnimalService;

import java.util.ArrayList;

public class Ej01main {
    public static void main(String[] args) {
        AnimalService animalesService = new AnimalService();
        ArrayList<Animal> animales = new ArrayList<>();

        Perro perroObj = new Perro("Firulais", "Carne", 7, "Pitbull");
        animales.add(perroObj);
        perroObj.alimentarse();

        Gato gatoObj = new Gato("Pelusa", "Croquetas", 5, "Siames");
        animales.add(gatoObj);
        gatoObj.alimentarse();

        Caballo caballoObj = new Caballo("Pegaso", "Alfalfa", 10, "Caballo andaluz");
        animales.add(caballoObj);
        caballoObj.alimentarse();

        System.out.println("\nTipo de animal: ");
        animalesService.mostrarTipo(animales);
    }
}
