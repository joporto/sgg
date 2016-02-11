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
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class testConnection {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        ResultSet rs = null;
        
        try {
            String driverClassName="com.mysql.jdbc.Driver";
            String driverUrl="jdbc:mysql://52.34.36.25:3306/CLARITYCOW";
            Class.forName(driverClassName);
            conn=DriverManager.getConnection(driverUrl,"root","sc2015");
            
            System.out.println("Conectado a la base de datos, las tablas encontradas son:");
            DatabaseMetaData dbm = conn.getMetaData();
            rs = dbm.getTables(null, null, "%", new String[] { "TABLE" });
            while (rs.next()) { System.out.println(rs.getString("TABLE_NAME")); }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
            rs.close();
        }
    }
}

