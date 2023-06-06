package entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    protected int carga;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Lavadora() {

    }

    public Lavadora(Double precio, String color, Character consumoEnergetico, Double peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }


    public void crearLavadora() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga: ");
        this.carga = leer.nextInt();
        precioFinal();
    }

    /**
     * Método precioFinal(): este método será heredado y se le sumará la siguiente
     * funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
     * carga es menor o igual, no se incrementará el precio. Este método debe llamar al
     * método padre y añadir el código necesario. Recuerda que las condiciones que hemos
     * visto en la clase Electrodoméstico también deben afectar al precio.
     */
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precio=" + precio +
                ", color='" + color +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
