
public abstract class Funcionario {

    private String nombre;
    private String documento;
    protected double salario;
    private int tipo;

    public double getSalario() {
        return salario;
    }

    public double getBonificacion() {
        System.out.println("Llamando metodo del Funcionario");
        return this.salario * 0.1;
    }


}

