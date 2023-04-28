
package ejercicio.empleado.Entidad;

/*Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, 
crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. 
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.e
 */
public class Empleado1 {
    
    public String nombre;
    public int edad;
    public int salario;

    public Empleado1(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    
    
    
    public void calcularAumento(){       
        if(edad > 30){
        double aumento = salario*0.10;
            System.out.println("El salario es: "+(salario+aumento));
        }else{
            System.out.println("El salario es: "+(salario+salario*0.05));
        }
    }
    
}
