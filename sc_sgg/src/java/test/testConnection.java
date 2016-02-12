/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author javierOporto
 */
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class testConnection {
    public static void main(String[] args) throws SQLException {
       
        
        try {
             
            Connection conn = dal.Conexion.get();
            
            System.out.println("Conectado a la base de datos, las tablas encontradas son:");
            DatabaseMetaData dbm = conn.getMetaData();
            ResultSet rs = dbm.getTables(null, null, "%", new String[] { "TABLE" });
            while (rs.next()) { System.out.println(rs.getString("TABLE_NAME")); }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }
}

