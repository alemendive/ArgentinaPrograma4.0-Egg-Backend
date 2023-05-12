package lista_tipo_pila;

import javax.swing.*;

public class Pila {
    private Nodo ultimoValorIngresado;
    int tamano = 0;
    String Lista = "";

    public Pila() {
        ultimoValorIngresado = null;
        tamano = 0;
    }

    // Metodo para saber cuando la pila esta vacia
    public boolean pilaVacia() {
        return ultimoValorIngresado == null;
    }
    // Metodo para insertar un nodo en la pila

    public void insertarNodo(int nodo) {
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = ultimoValorIngresado;
        ultimoValorIngresado = nuevo_nodo;
        tamano++;
    }
    // Metodo para eliminar un nodo de la pila

    public int eliminarNodo() {
        int aux = ultimoValorIngresado.informacion;
        ultimoValorIngresado = ultimoValorIngresado.siguiente;
        tamano--;
        return aux;
    }

    // Metodo para conocer cual es el ultimo valor ingresado
    public int mostrarUltimoValorIngresado() {
        return ultimoValorIngresado.informacion;
    }

    // Metodo para conocer el tamaño de la pila
    public int tamanoPila() {
        return tamano;
    }

    //Metodo para vaciar la pila
    public void vaciarPila() {
        while (!pilaVacia()) {
            eliminarNodo();
        }
    }

    //Metodo para mostrar el contenido de la pila
    public void mostrarValores() {
        Nodo recorrido = ultimoValorIngresado;
        while (recorrido != null) {
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
