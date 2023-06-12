public class Principal {
    public static void main(String[] args) {

         /* Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
          generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
          de rango).*/

        int[] numeros = {1,2,3,4,5};
        try{
            System.out.println(numeros[10]);
        } catch (ArrayIndexOutOfBoundsException aibe){
            System.out.println("Longitud incorrecta");
            System.out.println(aibe.getMessage());
            aibe.fillInStackTrace();
        } finally {
            System.out.println("Adios");
        }
    }
}
