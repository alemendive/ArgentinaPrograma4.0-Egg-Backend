
package ejercicio.cuenta.Entidad;

import java.util.Scanner;

/*Crea una clase "Cuenta1" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 
 */
public class Cuenta1 {
     Scanner leer = new Scanner(System.in);
    // atributos
    private double saldo;
    private String titular;
    //constructor 

    public Cuenta1(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta1() {
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
//crea un método "retirar_dinero" 
 // que permita retirar una cantidad de dinero del saldo de la cuenta.    
    
    public void creaCuenta(){
      
        System.out.println("Digite el Nombre del titular de la cuenta ->");
        titular=leer.nextLine();
        System.out.println("Ingrese el saldo en cuenta ->");
        saldo=leer.nextDouble();   
        
    }
    
    
    public void  retirar_dinero(){
        System.out.println("Ingrese la cantidad de dinero a retirar");
        double retiro=leer.nextDouble();
        if (saldo>retiro) {
            saldo=saldo-retiro;
            System.out.println("El saldo en cuenta es : "+saldo);
            
        }else {
            System.out.println("No puede retirar esa cantidad de dinero");
            
        }
          
        
        
    }
    
}
