

public class Gerente extends Funcionario implements Autenticable {
    public double getBonificacion() {
        System.out.println("Llamando metodo desde Gerente");
        return 2000;
    }

    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }
}

