import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*
        numero1 = a + bi
        numero2 = c + di
         */
        NumeroComplejo numero1, numero2, suma, multi;
        double a,b,c,d;
        int opcion,numero;



        do{
            System.out.println("\t.:Operaciones con Numeros Complejos:.");
            System.out.println("1. Sumar dos numeros complejos");
            System.out.println("2. Multiplicar 2 numeros complejos");
            System.out.println("3. Comparar 2 numeros complejos(iguales o no)");
            System.out.println("4. Multiplicar un numero complejo por un entero");
            System.out.println("5. SALIR");
            System.out.println("Digite la opcion de menu: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                System.out.println("\nDigite el primer numero complejo: ");
                System.out.println("Digite la parte real: ");
                a = entrada.nextDouble();
                System.out.println("Digite la parte imaginaria: ");
                b = entrada.nextDouble();
                System.out.println("\nDigite el segundo numero complejo: ");
                System.out.println("Digite la parte real: ");
                c = entrada.nextDouble();
                System.out.println("Digite la parte imaginaria: ");
                d = entrada.nextDouble();

                numero1 = new NumeroComplejo(a,b);
                numero2 = new NumeroComplejo(c,d);

                suma = numero1.calcularSuma(numero2);
                System.out.println("\nLa suma es: "+suma.getA()+" + "+suma.getB()+"i");
                break;

                case 2:
                System.out.println("\nDigite el primer numero complejo: ");
                System.out.println("Digite la parte real: ");
                a = entrada.nextDouble();
                System.out.println("Digite la parte imaginaria: ");
                b = entrada.nextDouble();
                System.out.println("\nDigite el segundo numero complejo: ");
                System.out.println("Digite la parte real: ");
                c = entrada.nextDouble();
                System.out.println("Digite la parte imaginaria: ");
                d = entrada.nextDouble();

                numero1 = new NumeroComplejo(a,b);
                numero2 = new NumeroComplejo(c,d);

                multi = numero1.calcularProducto(numero2);
                System.out.println("\nLa multiplicacion es: "+multi.getA()+" + "+multi.getB()+"i");
                break;

                case 3:
                System.out.println("\nDigite el primer numero complejo: ");
                System.out.println("Digite la parte real: ");
                a = entrada.nextDouble();
                System.out.println("Digite la parte imaginaria: ");
                b = entrada.nextDouble();
                System.out.println("\nDigite el segundo numero complejo: ");
                System.out.println("Digite la parte real: ");
                c = entrada.nextDouble();
                System.out.println("Digite la parte imaginaria: ");
                d = entrada.nextDouble();

                numero1 = new NumeroComplejo(a,b);
                numero2 = new NumeroComplejo(c,d);

                if(numero1.comprobarIgualdad(numero2)){
                    System.out.println("\nLos numeros complejos son iguales");
                } else {
                    System.out.println("\nLos numeros complejos NO son iguales");
                }
                break;

                case 4:
                System.out.println("\nDigite el primer numero complejo: ");
                System.out.println("Digite la parte real: ");
                a = entrada.nextDouble();
                System.out.println("Digite la parte imaginaria: ");
                b = entrada.nextDouble();
                System.out.println("Ahora digite un numero entero: ");
                numero = entrada.nextInt();

                numero1 = new NumeroComplejo(a,b);

                multi = numero1.multiplicarPorEntero(numero);
                System.out.println("\nLa multiplicacion es: "+multi.getA()+" + "+multi.getB()+"i");


            }



        } while(opcion !=5);
        System.out.println("");
    }
}