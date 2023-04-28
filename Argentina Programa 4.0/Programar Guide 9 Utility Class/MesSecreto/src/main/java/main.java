import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        char resp = 'S';
        String [] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio"
                , "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        String mesSecreto = meses[(int) (Math.random() * 12)];

        do{
            System.out.println("Adivine el mes secreto");
            String adivine = leer.next();
            if(adivine == mesSecreto){
                System.out.println("Ha acertado");
                break;
            }
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
                System.out.println("Desea continuar intentando? (s/n)");
                resp = leer.next().toLowerCase().charAt(0);

            } while (resp=='s');
        }


    }

