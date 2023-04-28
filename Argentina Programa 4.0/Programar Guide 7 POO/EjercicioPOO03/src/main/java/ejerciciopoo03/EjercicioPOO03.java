/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejerciciopoo03;

import ejerciciopoo03.Entidad.Operacion;

/**
 *
 * @author Ale
 */
public class EjercicioPOO03 {

    public static void main(String[] args) {
        Operacion test = new Operacion();

        test.crearOperacion();
        test.sumar();
        test.restar();
        test.dividir();
        test.multiplicar();

        System.out.println("La suma es de : " + test.sumar());
        System.out.println("La resta es de : " + test.restar());
        System.out.println("La division es de : " + test.dividir());
        System.out.println("La multiplicacion es de : " + test.multiplicar());

        Operacion test2 = new Operacion(2, 2);
        
        test2.sumar();
        test2.restar();
        test2.dividir();
        test2.multiplicar();
        
        System.out.println("La suma es de : " + test2.sumar());
        System.out.println("La resta es de : " + test2.restar());
        System.out.println("La division es de : " + test2.dividir());
        System.out.println("La multiplicacion es de : " + test2.multiplicar());
        
        Operacion test3 = new Operacion();
        
        test3.setNumero1(15);
        test3.setNumero2(30);
        test3.sumar();
        test3.restar();
        test3.dividir();
        test3.multiplicar()
                ;
        System.out.println("La suma es de : " + test3.sumar());
        System.out.println("La resta es de : " + test3.restar());
        System.out.println("La division es de : " + test3.dividir());
        System.out.println("La multiplicacion es de : " + test3.multiplicar());
    }

}
