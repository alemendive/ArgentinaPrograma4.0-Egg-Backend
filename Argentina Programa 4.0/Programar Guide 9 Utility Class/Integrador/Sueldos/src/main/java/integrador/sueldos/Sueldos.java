/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package integrador.sueldos;

import Entidades.Vendedor;
import Servicio.VendedorServicio;

/**
 *
 * @author Ale
 */
public class Sueldos {

    public static void main(String[] args) {
       VendedorServicio vs = new VendedorServicio();
       Vendedor v1 = vs.altaVendedor();
       vs.SueldoMensual(v1);
       vs.vacaciones(v1);
       
    }
}
