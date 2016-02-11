/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author javierOporto
 */
public class Conexion {
    public static Connection get() throws Exception{
        Connection conn = null;
        try 
        {
            String driverClassName="com.mysql.jdbc.Driver";
            String driverUrl="jdbc:mysql://52.34.36.25:3306/CLARITYCOW";
            Class.forName(driverClassName);
            conn=DriverManager.getConnection(driverUrl,"root","sc2015");
            return conn;
            
        } catch (ClassNotFoundException e) 
        {
            throw new Exception("Erro ClassNotFoundException "+e.getMessage());
        }catch (SQLException e)
        {
            throw new Exception("Error SQLException "+e.getMessage());
        }
    }
}
