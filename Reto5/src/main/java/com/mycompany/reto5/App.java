/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto5;
import Vista.VentanaPrincipal;

/**
 *
 * @author Zero_
 */
public class App {
    public static void main(String args[]){        
        //VentanaPrincipal.main(new String[0]);  // Se usa cuando está definido el Main en la otra clase
        //VentanaPrincipal window = new VentanaPrincipal();
        //window.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
}
