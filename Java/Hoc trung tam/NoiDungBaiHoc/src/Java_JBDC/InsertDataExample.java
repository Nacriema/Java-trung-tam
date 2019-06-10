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
public class InsertDataExample {
    // Yeu cau tao ra mot class news de chua thong tin cua cac phan tu news sau do truyen vao 
    // Hoac co the tao ra ham nhap vao cac thong tin can truyen vao sau do thi pass no vao trong cau lenh sql, cai ni minh lam vo mot cai 
 static  int category_id = 1;
 static String nameInput = "Spider man";
   
    
    public static void main(String[] args) throws SQLException {
        //Lay ra ket noi toi co so du lieu
        Connection connection = ConnectionTest.getSQLServerConnection();
        Statement statement = connection.createStatement();
        String sql = "Insert into news(category_id, name, [description], detail, [image], [date], [user_id]) VALUES(" + category_id + "," + "'"+ nameInput + "'"+ " , 'Action movie', 'A real story about a hero in marvel ...', 'An ant man', '2019-05-02', 2)";
        
        // thuc thi cau lenh
        
        int rowCount = statement.executeUpdate(sql);
        System.out.println("Row count affected = " + rowCount);
        // Nen bo vao trong khoi try catch
    }
}
