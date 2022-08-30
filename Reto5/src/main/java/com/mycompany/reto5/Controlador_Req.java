/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto5;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Zero_
 */
public class Controlador_Req {
    private final Proyecto_DAO proyecto_DAO;
    private final Lideres_Cargo_DAO lideres_Cargo_DAO;
    private final Lideres_MenorCosto_DAO lideres_MenorCosto_DAO;

    public Controlador_Req(){
        proyecto_DAO = new Proyecto_DAO();
        lideres_Cargo_DAO = new Lideres_Cargo_DAO();
        lideres_MenorCosto_DAO = new Lideres_MenorCosto_DAO();
    }

    public ArrayList<Proyecto_VO> consultarMaterialesProyectos() throws SQLException {
        return proyecto_DAO.TotalesMaterialesProyectos();
    }

    public ArrayList<Lideres_Cargo_VO> consultarLideresCargoBuc() throws SQLException {
        return lideres_Cargo_DAO.consultarLideresBucag();
    }

    public ArrayList<Lideres_MenorCosto_VO> consultarLideresMenorCostoProm() throws SQLException {
        return lideres_MenorCosto_DAO.consultarLideresMenorCosto();
    }
}
