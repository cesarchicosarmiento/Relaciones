/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relaciones;
/*
import com.mycompany.proyectocero.LugarMatriculacion;
import com.mycompany.proyectocero.Propietario;
*/
/**
 *
 * @author Usuario R
 */
public class Auto {

    String placa;
    String marca;
    int year;
    String color;
    double precio;
    int cilindrajeMotor;
    Propietario owner;
    LugarMatriculacion lugar;

    public String mostrarInfo() {
        var retorno = " El auto tiene placa: " + this.placa + " \n Es de marca: "
                + this.marca + "\n El propietario es: " + this.owner.nombre
                + "\n La dirección del propietario es: " + this.owner.direccion
                + "\n El auto cuesta " + this.precio + " USD y es modelo: " + this.year
                + "\n El auto esta matriculado en el centro: " + this.lugar.descripcion
                + "\n El telefono del propietario es: " + this.lugar.telefono 
                + "\n En la provincia: " + this.lugar.provincia
                + "\n En la ciudad de: " + this.lugar.ciudad;
                
                

        return retorno;
    }
}
