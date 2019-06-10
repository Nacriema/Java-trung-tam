/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_JBDC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class UpdateDataExample {
     public static void main(String[] args) throws SQLException {
        //Lay ra ket noi toi co so du lieu
        Connection connection = ConnectionTest.getSQLServerConnection();
        Statement statement = connection.createStatement();
        String sql = "Update news set user_id = 3 where id = 2";
        
        // thuc thi cau lenh
        
        int rowCount = statement.executeUpdate(sql);
        System.out.println("Row count affected = " + rowCount);
        // Nen bo vao trong khoi try catch
    }
}
