/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopoomenu.Entidad;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class Operacion {
    
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    
    public void crearOperacion(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los dos numeros");
        numero1=leer.nextInt();
        numero2=leer.nextInt();
        
    }    
    public int sumar(){
        return (numero1 + numero2);
    }
    
    public int restar(){
        return (numero1 - numero2);
    }
    public int multiplicar(){
        
        if (numero1!=0 && numero2!=0){
         return (numero1 * numero2);
    } else {
            return 0;
            
        }
    }
    public double dividir(){
        if (numero2!=0){
             return ((double)numero1/(double)numero2);
        } else {
            System.out.println("No se puede dividir x 0");
            return 0;
        }
        
    }
    
}
