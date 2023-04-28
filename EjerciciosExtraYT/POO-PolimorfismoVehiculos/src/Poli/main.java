package Poli;

public class main {
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("GH67","Ferrari","A89");
        misVehiculos[1] = new VehiculoTurismo(4, "78HJ","Audi","P14");
        misVehiculos[2] = new VehiculoDeportivo(500,"45GH","Toyota","KJ8");
        misVehiculos[3] = new VehiculoFurgoneta(2000,"JI8G","Toyota","J9");

        //upcasting
        Vehiculo vehiculo1 = new VehiculoTurismo(4,"GT67","Ferrari","A09");
        System.out.println(vehiculo1);

        //downcasting
        VehiculoTurismo nuevoVehiculo = (VehiculoTurismo) vehiculo1;
        System.out.println(nuevoVehiculo);


        //up and downcasting
        Vehiculo vehiculo2 = new VehiculoDeportivo(500,"TY34","Audi","H19");
        VehiculoDeportivo nuevoVehiculo2 = (VehiculoDeportivo) vehiculo2;
        System.out.println(nuevoVehiculo2);







        for (Vehiculo vehiculo: misVehiculos) {
            System.out.println(vehiculo.mostrarDatos());
            System.out.println("");

        }
    }
}
