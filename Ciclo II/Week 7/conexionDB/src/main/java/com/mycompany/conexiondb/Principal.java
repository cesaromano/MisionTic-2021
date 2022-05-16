package com.mycompany.conexiondb;

import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    public static void main(String[] args) {
        
        try {
            //java.sql
            //javax.sql
            
            //Cargar driver
            //Forma 1
            Class.forName("org.sqlite.JDBC");
            //Forma 2
            //DriverManager.registerDriver(new org.sqlite.JDBC());
            
            DriverManager.getConnection(String url);
            DriverManager.getConnection(String url, java.util.properties);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
