/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encuentro345Extras;

/**
 *
 * @author Ale
 */
public class ejercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        System.out.println("Los valores iniciales son: A="+ A +" B="+ B+ " C="+ C +" D="+ D );
        
        int inter = B;
        B = C;
        C = A;
        A = D;
        D = B;
        B = inter;
        System.out.println("Los valores invertidos son A="+ A +" B="+ B+ " C="+ C +" D="+ D );
               
               
        
    }
    
}
