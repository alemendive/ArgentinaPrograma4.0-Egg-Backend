/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejerciciopoomenu;

import ejerciciopoomenu.Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class EjercicioPOOMenu {

    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner leer = new Scanner(System.in);
        
    
        Operacion m1 = new Operacion();
        int opc=0;
        do {
            
        
        
        System.out.println("MENU");
        System.out.println("");
        
        System.out.println("1.- Ingresar datos");
        System.out.println("2.- Sumar");
        System.out.println("3.- Restar");
        System.out.println("4.- Multiplicar");
        System.out.println("5.- Dividir");
        System.out.println("6.- Salir");
        
        opc=leer.nextInt();
        
        switch (opc){
            case 1:
                m1.crearOperacion();
                break;
            case 2:
                System.out.println(m1.sumar());
                break;
            case 3:
                System.out.println(m1.restar());
                break;
            case 4:
                if (m1.multiplicar()==0){
                    System.out.println("Uno de los valores es 0");
                    break;
                }
                System.out.println(m1.multiplicar());
                
                break;
            case 5:
                System.out.println(String.format("%.2f",m1.dividir()));
                break;
            case 6:
                break;
                
        }
        } while (opc!=6);
        
    }
}