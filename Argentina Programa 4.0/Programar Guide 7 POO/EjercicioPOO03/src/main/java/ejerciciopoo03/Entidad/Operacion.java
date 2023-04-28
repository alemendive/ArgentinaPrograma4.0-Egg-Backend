/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopoo03.Entidad;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class Operacion {
Scanner leer = new Scanner(System.in);
   private int numero1;
   private int numero2;
   
   //Método constructor con todos los atributos pasados por parámetro.

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
   
   //Método constructor sin los atributos pasados por parámetro.

    public Operacion() {
    }
    
    //Métodos get y set.

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
    
    //Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    
    public void crearOperacion(){
        System.out.println("Porfavor ingrese 2 numeros.");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
    }
    
    //Método sumar(): calcular la suma de los números y devolver el resultado al main.
    
    public int sumar(){
      int suma = numero1 + numero2;
       
        return suma;
    }
    
    //Método restar(): calcular la resta de los números y devolver el resultado al main
    
    public int restar(){
       int resta = numero1 - numero2;
        return resta;
    }
    
    /*Método multiplicar(): primero valida que no se haga una multiplicación por
cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al 
usuario el error. Si no, se hace la multiplicación y se devuelve el resultado 
al main*/
    
    public int multiplicar(){
       int mult=0;
        if (numero2 == 0 || numero1 ==0) {
            numero2 = 0;
            System.out.println("Error no se puede multiplicar por 0 por ende el resultado es :" + numero2);
            
        }else{
            mult = numero1 * numero2;
            
        }
        return mult;
    }
    
    /*Método dividir(): primero valida que no se haga una división por cero, 
si fuera a pasar una división por cero, el método devuelve 0 y se le informa 
al usuario el error se le informa al usuario. Si no, se hace la división y se 
devuelve el resultado al main.*/
    
    public int dividir(){
        int div =0;
        if (numero2 == 0 || numero1 == 0) {
            System.out.println("Error no se puede divir por 0 por ende el resultado es :" + div);  
            
        }else{
            div =  numero1 /  numero2;
        }
        return div;
    }
    

   
   
}