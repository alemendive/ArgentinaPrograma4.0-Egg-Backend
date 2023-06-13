import java.util.InputMismatchException;

public class Principal {
        private static int metodo() {
            int valor=0;
            try{
                valor = valor + 1;
                valor = valor + Integer.parseInt ("W");
                valor = valor + 1;
                System.out.println("valor final del try: " + valor) ;
            } catch ( IllegalArgumentException e ) {
                valor = valor + Integer.parseInt ("42");
                System.out.println("valor final del catch: " + valor) ;
            } finally {
                valor = valor + 1;
                System.out.println("valor final del finally: " + valor) ;
            }
            valor = valor + 1;
            System.out.println("valor antes del return: " + valor) ;
            return valor;
        }
        public static void main (String[] args) {
            try{
                System.out.println ( metodo ()) ;
            } catch(Exception e) {
                System.out.println ( " Excepcion en metodo () " + e.getMessage()) ;
                e.printStackTrace();
            }
        }
    }

