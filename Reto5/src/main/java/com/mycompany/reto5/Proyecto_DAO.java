/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto5;
import java.util.*;
import java.sql.*;
/**
 *
 * @author Zero_
 */
public class Proyecto_DAO {
    public ArrayList<Proyecto_VO> TotalesMaterialesProyectos() throws SQLException{
        ArrayList<Proyecto_VO> respuesta = new ArrayList<Proyecto_VO>();
        Connection conexion = JBDC_Utilities.getConnection();
        Statement st = conexion.createStatement();
        String query = "SELECT mc.Nombre_Material, mc.Precio_Unidad, SUM(c.Cantidad) Total " +
            "FROM Proyecto p JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto " +
            "JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion " +
            "WHERE c.ID_Proyecto IN (157, 386, 172, 264, 306) " +
            "GROUP BY mc.Nombre_Material " +
            "ORDER BY mc.Nombre_Material ";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            String Nombre_Material = rs.getString("Nombre_Material");
            Integer Precio_Unidad = rs.getInt("Precio_Unidad");
            Integer Total = rs.getInt("Total");
            Proyecto_VO registro = new Proyecto_VO(Nombre_Material, Precio_Unidad, Total);
            respuesta.add(registro);
        }
        rs.close();
        st.close();
        conexion.close();
        return respuesta;
    }
}
