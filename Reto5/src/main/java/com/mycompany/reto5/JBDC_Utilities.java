/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto5;
import java.sql.*;

/**
 *
 * @author Zero_
 */
public class JBDC_Utilities {
    //private static final String ubicacionBD = "D:/POLDOWN/Misión TIC/Programacion/ProyectosConstruccion.db";    
    private static final String currentDir = System.getProperty("user.dir");
    public static Connection getConnection() throws SQLException {
        //String url = "jdbc:sqlite:" + ubicacionBD;
        String url = "jdbc:sqlite:"+currentDir+"//BD/ProyectosConstruccion.db";
        return DriverManager.getConnection(url);
    }
}
