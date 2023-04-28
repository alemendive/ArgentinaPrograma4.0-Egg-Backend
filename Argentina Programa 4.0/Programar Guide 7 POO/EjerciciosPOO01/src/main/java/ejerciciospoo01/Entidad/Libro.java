/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospoo01.Entidad;

import java.util.Scanner;

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas,
y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
 *
 * @author Ale
 */
public class Libro {
    Scanner leer = new Scanner(System.in);

    public int isbn;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    //CONSTRUCTOR VACIO

    public Libro() {
    }
    // METODO PARA CARGAR EL LIBRO
    public void cargarLibro(){
        System.out.println("Por favor ingrese el Titulo del libro.");
        titulo = leer.nextLine();
        System.out.println("Por favor ingrese el Autor del libro.");
        autor = leer.nextLine();
        System.out.println("Por favor ingrese cuantas paginas tiene el libro.");
        paginas = leer.nextInt();
        System.out.println("Por favor ingrese el ISBN del libro.");
        isbn = leer.nextInt();
        
    }
}
