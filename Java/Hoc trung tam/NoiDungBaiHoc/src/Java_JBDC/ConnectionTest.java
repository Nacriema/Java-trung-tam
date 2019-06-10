/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_JBDC;
import BussinessObject.News;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
public class ConnectionTest {
 
 // Kết nối vào SQLServer.
 // (Sử dụng thư viện điều khiển SQLJDBC)
 public static Connection getSQLServerConnection() throws SQLException {
     String hostName = "localhost";
     String sqlInstanceName = "MSSQLSERVER";
     String database = "EER Diagram news";
     String userName = "sa";
     String password = "29031998";
 
     //return getSQLServerConnection(hostName, sqlInstanceName, database, userName, password);
     String connectionURL = "jdbc:sqlserver://" + hostName + ":1433"
             + ";instance=" + sqlInstanceName + ";databaseName=" + database;
 
     Connection conn = DriverManager.getConnection(connectionURL, userName, password);
     return conn;
 }
 
 
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        List<News> news = new ArrayList<News>();
        
        try{
            conn = getSQLServerConnection();
            String sql = "Select * From news";
            String sql2 = "Select * From news inner join categories on news.category_id = categories.id";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String category_name = rs.getString("name");
                String name = rs.getString("name");
                Date date = (Date) rs.getDate("date");
                String description = rs.getString("description");
                String detail = rs.getString("detail");
                String image = rs.getString("image");
                int user_id = rs.getInt("user_id");
                News newobj = new News();
                System.out.println("id: " + id + " | " + "category name: " + category_name + " | "+ "name: " + name + " | " + "description: " + description + " | " + "detail: " + detail + " | " + "image: " + image +  " | " + "date: " + date.toString());
            }
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        System.out.println("Connection successful" + conn);
    }
}