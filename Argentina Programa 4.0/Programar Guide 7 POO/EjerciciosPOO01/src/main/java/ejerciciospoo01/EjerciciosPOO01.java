/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejerciciospoo01;

import ejerciciospoo01.Entidad.Libro;

/**
 *
 * @author Ale
 */
public class EjerciciosPOO01 {

    public static void main(String[] args) {
       Libro libro1 = new Libro();
       
       libro1.cargarLibro();
       
        System.out.println("El titulo del libro es: "+ libro1.titulo);
        System.out.println("El autor del libro es: "+ libro1.autor);
        System.out.println("La cantidad de paginas del libro es de : "+libro1.paginas);
        System.out.println("El ISBN del libro es: "+libro1.isbn);
        
        Libro libro2 = new Libro(345534, "Harry", "Rowling", 30);
        
    }
}
