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
public class Proyecto_VO {
    private String nombre_Material;
    private Integer Precio_Unidad;
    private Integer Total;

    public Proyecto_VO(){

    }
    
    public Proyecto_VO(String nombre_Material, Integer Precio_Unidad, Integer Total){
        this.nombre_Material = nombre_Material;
        this.Precio_Unidad = Precio_Unidad;
        this.Total = Total;
    }

    public String getNombre_Material() {
        return nombre_Material;
    }

    public void setNombre_Material(String nombre_Material) {
        this.nombre_Material = nombre_Material;
    }

    public Integer getPrecio_Unidad() {
        return Precio_Unidad;
    }

    public void setPrecio_Unidad(Integer precio_Unidad) {
        Precio_Unidad = precio_Unidad;
    }

    public Integer getTotal() {
        return Total;
    }

    public void setTotal(Integer total) {
        Total = total;
    }
}
