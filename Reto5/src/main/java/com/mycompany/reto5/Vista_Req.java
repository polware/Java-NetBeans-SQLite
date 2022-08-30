/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto5;
import java.util.*;

/**
 *
 * @author Zero_
 */
public class Vista_Req {
    private static final Controlador_Req controlador = new Controlador_Req();
        public static void requerimiento1(){
            System.out.println("====================================================================");
            System.out.println("------------------- LIDERES Y CARGOS BUCARAMANGA -------------------");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Lider | Cargo");
            System.out.println("");
            try{
                ArrayList<Lideres_Cargo_VO> arregloResultados = controlador.consultarLideresCargoBuc();
                for(Lideres_Cargo_VO registro : arregloResultados){
                    System.out.println(registro.getNombre() + " | " + registro.getCargo());
                }
            }
            catch (Exception e){
                System.err.println("Opss... ¡Algo anda mal!" +e.getMessage());
            }
        }

        public static void requerimiento2(){
            System.out.println("\n====================================================================");
            System.out.println("---------------- LISTA DE MATERIALES DE CONSTRUCCION ---------------");
            System.out.println("---------------- PROYECTOS: 157, 386, 172, 264, 306 ----------------");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Nombre Material | Precio Unidad | Total");
            System.out.println("");
            try{
                ArrayList<Proyecto_VO> arregloResultados = controlador.consultarMaterialesProyectos();
                for(Proyecto_VO registro : arregloResultados){
                    System.out.println(registro.getNombre_Material() + " | " + registro.getPrecio_Unidad() + " | " +registro.getTotal());
                }
            }
            catch (Exception e){
                System.err.println("Opss... ¡Algo anda mal!" +e.getMessage());
            }        
        }

        public static void requerimiento3(){
            System.out.println("\n====================================================================");
            System.out.println("------------------ 3 LIDERES MENOR COSTO PROMEDIO ------------------");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Nombre | Promedio");
            System.out.println("");
            try{
                ArrayList<Lideres_MenorCosto_VO> arregloResultados = controlador.consultarLideresMenorCostoProm();
                for(Lideres_MenorCosto_VO registro : arregloResultados){
                    System.out.println(registro.getNombre() + " | " + registro.getPromedio());
                }
            }
            catch (Exception e){
                System.err.println("Opss... ¡Algo anda mal!" +e.getMessage());
            }
        }
}
