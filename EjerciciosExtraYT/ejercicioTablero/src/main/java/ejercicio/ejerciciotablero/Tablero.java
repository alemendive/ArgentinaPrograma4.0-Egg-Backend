/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.ejerciciotablero;

/**
 *
 * @author Ale
 */
public class Tablero {
    private int x;
    private int y;

    //Constructor
    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void moverArriba(int incremento){
        y += incremento;
    }
    
    public void moverAbajo(int incremento){
        y -= incremento;
    }
    
    public void moverDerecha(int incremento){
        x += incremento;
    }
    
    public void moverIzquierda(int incremento){
        x -= incremento;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
}

