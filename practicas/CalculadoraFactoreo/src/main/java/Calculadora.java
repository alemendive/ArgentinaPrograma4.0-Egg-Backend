public class Calculadora {
    public int factorial (int num){
        if (num < 0) {
            throw new ArithmeticException("No se permiten numeros negativos");
        }
        if (num > 12) {
            throw new IllegalArgumentException("Por limitaciones técnicas, no se puede calcular factoriales de mas de 12");
        }
        int fact = 1;
        for (int i = 2; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }
}
