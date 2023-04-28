/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mascotapp;

import mascotapp.Entidad.Mascota;
import mascotapp.servicios.ServicioMascota;

/**
 *
 * @author Ale
 */
public class MascotAPP {

    public static void main(String[] args) {

        ServicioMascota sm = new ServicioMascota();

        Mascota m1 = sm.crearMascota();
        
        System.out.println(m1.toString());
        
        m1.pasear(100);

        System.out.println(m1.toString());

        m1 = null;
        
    }
}
