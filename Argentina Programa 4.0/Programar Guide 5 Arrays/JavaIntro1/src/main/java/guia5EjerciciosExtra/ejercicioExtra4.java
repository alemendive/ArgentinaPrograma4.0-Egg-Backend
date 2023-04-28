/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia5EjerciciosExtra;

import java.util.Scanner;

/*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas 
por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 *
 * @author Ale
 */
public class ejercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int tamano = 2;
        double[] listaAlumnos = new double[tamano];

        pedirNota(listaAlumnos);
        calcularAprob(listaAlumnos);
        
        
    }

    public static void pedirNota(double listaAlumnos[]) {
        double primerNota = 0;
        double segundaNota = 0;
        double primerIntegrador = 0;
        double segundoIntegrador = 0;
        

        for (int i = 0; i < listaAlumnos.length; i++) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Alumno: " + (i + 1));
            System.out.println("Ingrese nota del primer trabajo Practico: ");
            primerNota = leer.nextInt();
            primerNota = notaMala(primerNota);
            primerNota = primerNota * 0.1;
            System.out.println("Ingrese nota del segundo trabajo Practico: ");
            segundaNota = leer.nextInt();
            segundaNota = notaMala(segundaNota);
            segundaNota = segundaNota * 0.15;
            System.out.println("Ingrese nota del primer Integrador: ");
            primerIntegrador = leer.nextInt();
            primerIntegrador = notaMala(primerIntegrador);
            primerIntegrador = primerIntegrador * 0.25;
            System.out.println("Ingrese nota del segundo Integrador: ");
            segundoIntegrador = leer.nextInt();
            segundoIntegrador = notaMala(segundoIntegrador);
            segundoIntegrador = segundoIntegrador * 0.5;
            
            listaAlumnos[i] = primerNota + segundaNota + primerIntegrador + segundoIntegrador;       
            
        }

    }
    
    public static void calcularAprob(double listaAlumnos[]){
        int aprob = 0;
        int desaprob = 0;
         for (int i = 0; i < listaAlumnos.length; i++) {
             if(listaAlumnos[i] >= 7){
                 aprob++;
             } else {
                 desaprob++;
             }
         }
         System.out.println("Los alumnos aprobados son: "+ aprob);
         System.out.println("Los alumnos desaprobados son: " +desaprob);
     }

    public static double notaMala(double num){        
        Scanner leer = new Scanner(System.in);
        while(num > 10 || num < 1){
        System.out.println("La nota no puede ser mayor a 10 o menor a 1, reingrese");
        num = leer.nextInt();                    
        }
        return num;
    } 
}
