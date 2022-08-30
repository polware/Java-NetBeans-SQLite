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
public class Lideres_Cargo_DAO {
    public ArrayList<Lideres_Cargo_VO> consultarLideresBucag() throws SQLException {
		ArrayList<Lideres_Cargo_VO> respuesta = new ArrayList<Lideres_Cargo_VO>();
		Connection conexion = JBDC_Utilities.getConnection();
        Statement st = conexion.createStatement();     
        String query =" SELECT Nombre || \" \" || Primer_Apellido || \" \" || Segundo_Apellido Nombre, Cargo " +
        "FROM Lider " + 
        "WHERE Ciudad_Residencia = 'Bucaramanga' " +
        "ORDER BY Nombre ";
        ResultSet rs = st.executeQuery(query);
        while( rs.next() ){
                 String Nombre = rs.getString("Nombre");
                 String Cargo = rs.getString("Cargo");     
                 Lideres_Cargo_VO registro = new Lideres_Cargo_VO(Nombre, Cargo);     
                 respuesta.add(registro);
             }
        rs.close();
        st.close();
        conexion.close();
        return respuesta;
    }
}
