import entidades.*;
import service.AlquilerServicios;

import java.util.ArrayList;
import java.util.Scanner;

public class EjExtra01main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlquilerServicios alquilerServicios = new AlquilerServicios();

        ArrayList<Barco> barcoArrayList = new ArrayList<>();

        Velero veleroObj = new Velero("ASD789", 20d, 2020, 3);
        barcoArrayList.add(veleroObj);
        BarcosaMotor barcoObJ = new BarcosaMotor("EFG123", 50d, 2012, 100);
        barcoArrayList.add(barcoObJ);
        Yate yateObj = new Yate("HIJ456", 30d, 2022, 110, 3);
        barcoArrayList.add(yateObj);

        System.out.println("Qué barco desea alquilar?");
        for (Barco aux : barcoArrayList) {
            if (aux instanceof Velero) {
                System.out.println("Velero: " + aux.getMatricula());
            }
            if (aux instanceof BarcosaMotor) {
                System.out.println("Barco a Motor: " + aux.getMatricula());
            }
            if (aux instanceof Yate) {
                System.out.println("Yate: " + aux.getMatricula());
            }
        }
        String barcoAlquiler = leer.next();
        for (Barco aux : barcoArrayList) {
            if (aux.getMatricula().equalsIgnoreCase(barcoAlquiler)) {
                Alquiler alquiler = new Alquiler();
                Alquiler alquilerBarco = alquiler.alquiler(aux);
                aux.setAlquiler(alquilerBarco);
                aux.totalAlquiler();
            }
        }
        alquilerServicios.mostrarAlquileres(veleroObj);

    }
}
