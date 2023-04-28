/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio.cuenta;
import ejercicio.cuenta.Entidad.Cuenta1;


/*
 Crea una clase "Cuenta1" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" 
que permita retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
public class Cuenta {

   
     public static void main(String[] args) {
        Cuenta1 cliente1=new Cuenta1();
        cliente1.creaCuenta();
        cliente1.retirar_dinero();
    }
  }
