/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotapp.Entidad;

import java.util.Date;

/**
 *
 * @author Ale
 */
public class Usuario {

    private String nombre;
    private String apellido;
    private Integer dni;
    private Date nacimiento;
    private String pais;
    

    
    
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
    
    

}
