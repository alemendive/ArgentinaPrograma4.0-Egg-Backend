/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encuentro345Extras;
import javax.swing.JOptionPane;
/*Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea. 
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123

 *
 * @author Ale
 */
public class ejercicioExtra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la escalera"));

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < i ; j++){
                System.out.print(j+1);
            }System.out.println();
        }

    }
}
