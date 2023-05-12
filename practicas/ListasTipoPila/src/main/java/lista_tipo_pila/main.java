package lista_tipo_pila;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        int opcion = 0, nodo = 0;
        Pila pila = new Pila();

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones\n\n"
                                + "1. Insertar un Nodo\n"
                                + "2. Eliminar un Nodo\n"
                                + "3. ¿La Pila está Vacia?\n"
                                + "4. ¿Cual es el último valor ingresado en la Pila? \n"
                                + "5. ¿Cuantos nodos tiene la pila?\n"
                                + "6. Vaciar Pila\n"
                                + "7. Mostrar contenido de la Pila\n"
                                + "8. Salir.\n\n"));
                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el valor del nodo a guardar"));
                        pila.insertarNodo(nodo);
                        break;
                    case 2:
                        if (!pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se ha eliminado el nodo correctamente"
                                    + pila.eliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                    case 3:
                        if (pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia");
                        }
                        break;
                    case 4:
                        if (!pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El Último valor ingresado en la pila es: "
                                    + pila.mostrarUltimoValorIngresado());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila tiene " + pila.tamanoPila() + " nodos.");
                        break;
                    case 6:
                        if (!pila.pilaVacia()) {
                            pila.vaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                    case 7:
                        pila.mostrarValores();
                        break;
                    case 8:
                        opcion = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve a intentar nuevamente.");
                        break;
                }
            } catch (NumberFormatException e) {
            }

        } while (opcion != 8);
    }
}
