
package ejercicio.Cuadrilatero;


public class Cuadrilatero {
     
    //Atributos
    private float lado1;
    private float lado2;
    
    //Metodos
    //Metodo Constructor 1 (cuadrilatero)
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //Metodod constructor 2 (cuadrado)
    
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
        
    }
    
    public float getPerimetro(){
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
        
    }
    
    public float getArea(){
        float area = (lado1*lado2);
        return area;
    }
    
    
}
