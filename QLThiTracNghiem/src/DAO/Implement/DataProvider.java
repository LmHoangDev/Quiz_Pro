/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataProvider {
    
    private Connection conn;
    private static DataProvider instance;

    public static DataProvider getInstance() {
        if(instance == null)
        {
            instance = new DataProvider();
        }
        return instance;
    }

    public static void setInstance(DataProvider instance) {
        DataProvider.instance = instance;
    }

    public DataProvider() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;database=TracNghiemCNPM;";
            String username = "sa";
            String password = "vietloc123";
            conn = DriverManager.getConnection(connectionUrl, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Failed");
        }
    }
    
    public Connection Connection()
    {
        return conn;
    }
}
