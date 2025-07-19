/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SampathFoodCity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author a
 */
public class databasecon {
     private static final String DB_URL ="jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=SampathFood;encrypt=true;TrustServerCertificate=true;";
    private static final String USER = "vishwa";
    private static final String PASS = "Vishwag@0415";
    
        public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            throw new SQLException("SQL Server JDBC Driver not found. Please include the driver in your classpath.", e);
        }
        }
    
}
