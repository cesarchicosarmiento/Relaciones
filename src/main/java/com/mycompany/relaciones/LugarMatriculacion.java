/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relaciones;

/**
 *
 * @author Usuario R
 */
public class LugarMatriculacion {
   String descripcion;
   String telefono;
   String provincia;
   String ciudad;
   
       public String mostrarInfo() {
        var retorno = " El auto esta matriculada en el centro: " + this.descripcion + " el telefono del propietario es: "
                + this.telefono + ", en la provincia: " + this.provincia
                + " en la ciudad de: " + this.ciudad;

        return retorno;
    }
}
