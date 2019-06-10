/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class ConnectionUtils {
    
    public static Connection getSQLServerConnection() throws ClassNotFoundException, SQLException {
     String hostName = "localhost";
     String sqlInstanceName = "MSSQLSERVER";
     String database = "EER Diagram news";
     String userName = "sa";
     String password = "29031998";
 
     return getSQLServerConnection(hostName, sqlInstanceName, database, userName, password);
 }
    public static Connection getSQLServerConnection(String hostName, String sqlInstanceName, String database, String userName, String password) throws ClassNotFoundException, SQLException {
        String connectionURL = "jdbc:sqlserver://" + hostName + ":1433"
             + ";instance=" + sqlInstanceName + ";databaseName=" + database;
 
        Connection conn = DriverManager.getConnection(connectionURL, userName, password);
        return conn;
        
    }
 }
