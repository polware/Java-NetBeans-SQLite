/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto5;

/**
 *
 * @author Zero_
 */
public class Lideres_MenorCosto_VO {
    private String Nombre;
    private Integer Promedio;    

    public Lideres_MenorCosto_VO(){

    }
    
    public Lideres_MenorCosto_VO(String Nombre, Integer Promedio){
        this.Nombre = Nombre;
        this.Promedio = Promedio;        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getPromedio() {
        return Promedio;
    }

    public void setPromedio(Integer promedio) {
        Promedio = promedio;
    }
}
