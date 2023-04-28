import java.util.Scanner;

public class Main {

    public static int buscarNumeroCuenta(Cuenta cuentas[], int n){
        int i = 0, indice = 0;
        boolean encontrado = false;

        //Busqueda Secuencial
        while ((i<cuentas.length) && (encontrado==false)){
            if(cuentas[i].getNumeroCuenta() == n){
                encontrado = true;
                indice = i;
            }
            i++;
        }
        if (encontrado == false){
            indice = -1;
        }


        return indice;
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido, dni;
        int numeroCuenta, nCuentas, opcion, indiceCuenta;
        double saldo,cantidad;
        Cuenta cuentas[];
        Cliente cliente;

        System.out.println("Digite el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.println("Digite el apellido del cliente: ");
        apellido = entrada.nextLine();
        System.out.println("Digite el dni del cliente: ");
        dni = entrada.nextLine();
        System.out.println("Ahora, digite cuantas cuentas tiene: ");
        nCuentas = entrada.nextInt();

        cuentas = new Cuenta[nCuentas];

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("\nDigite los datos para la cuenta "+(i+1)+":");
            System.out.println("Digite el numero de cuenta: ");
            numeroCuenta = entrada.nextInt();
            System.out.println("Digite el saldo de la cuenta: ");
            saldo = entrada.nextDouble();

            cuentas[i] = new Cuenta(numeroCuenta, saldo);
         }

        cliente = new Cliente(nombre, apellido,dni,cuentas);

        do{
            System.out.println("\t .:MENU:.");
            System.out.println("1. Ingresar dinero en la cuenta");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Consultar saldo de la cuenta");
            System.out.println("4. SALIR");
            System.out.println("Digite la opcion de menu: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("\nDigite el numero de cuenta");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if(indiceCuenta == -1){
                        System.out.println("\nEl numero de cuenta ingresado no existe");
                    } else {
                        System.out.println("\nDigite la cantidad de dinero a ingresar: ");
                        cantidad = entrada.nextDouble();

                        cliente.ingresar_dinero(indiceCuenta, cantidad);
                        System.out.println("\nIngreso realizado correctamente");
                        System.out.println("Saldo disponible: "+cliente.consultar_saldo(indiceCuenta));
                    }
                    break;
                case 2:
                    System.out.println("\nDigite el numero de cuenta");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if(indiceCuenta == -1){
                        System.out.println("\nEl numero de cuenta ingresado no existe");
                    }
                    else {
                        System.out.println("\nDigite la cantidad de dinero que desea retirar: ");
                        cantidad = entrada.nextDouble();

                        if(cantidad>cliente.consultar_saldo(indiceCuenta)){
                            System.out.println("\nSaldo insuficiente");
                        }
                        else {
                            cliente.retirar_dinero(indiceCuenta,cantidad);
                            System.out.println("\nRetiro realizado correctamente");
                            System.out.println("Saldo disponible: "+cliente.consultar_saldo(indiceCuenta));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nDigite el numero de cuenta");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if(indiceCuenta == -1){
                        System.out.println("\nEl numero de cuenta ingresado no existe");
                    }
                    else {
                        System.out.println("Saldo disponible: "+cliente.consultar_saldo(indiceCuenta));
                    }
                    break;

                case 4: break;
                default:
                    System.out.println("Error de opcion de menu");

            }


        } while (opcion !=4);
        System.out.println("");
    }

}
