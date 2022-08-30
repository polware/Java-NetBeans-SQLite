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
public class Lideres_MenorCosto_DAO {
    public ArrayList<Lideres_MenorCosto_VO> consultarLideresMenorCosto() throws SQLException {
		ArrayList<Lideres_MenorCosto_VO> respuesta = new ArrayList<Lideres_MenorCosto_VO>();
		Connection conexion = JBDC_Utilities.getConnection();
        Statement st = conexion.createStatement();     
        String query ="SELECT Nombre || ' '  || Primer_Apellido || ' ' || Segundo_Apellido Nombre, SUM(c.Cantidad * mc.Precio_Unidad) / COUNT(DISTINCT p.ID_Proyecto) Promedio " +
        "FROM Lider l LEFT JOIN Proyecto p ON l.ID_Lider = p.ID_Lider " +
             "LEFT JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto " +
             "LEFT JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion " +
        "WHERE p.Clasificacion = 'Apartaestudio' " +
        "GROUP BY l.ID_Lider " +
        "HAVING COUNT(DISTINCT p.ID_Proyecto) >= 2 " +
        "ORDER BY Promedio " +
        "LIMIT 3 ";
        ResultSet rs = st.executeQuery(query);
        while( rs.next() ){
                 String Nombre = rs.getString("Nombre");
                 Integer Promedio = rs.getInt("Promedio");
                 Lideres_MenorCosto_VO registro = new Lideres_MenorCosto_VO(Nombre, Promedio);
                 respuesta.add(registro);
             }
        rs.close();
        st.close();
        conexion.close();
        return respuesta;
    }
}
