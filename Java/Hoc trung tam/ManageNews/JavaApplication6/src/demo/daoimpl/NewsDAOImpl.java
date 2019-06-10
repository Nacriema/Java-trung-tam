/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.daoimpl;

import demo.bo.News;
import demo.dao.INewsDAO;
import demo.utils.ConnectionUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.regexp.joni.ast.ConsAltNode;

/**
 *
 * @author PC
 */
public class NewsDAOImpl implements INewsDAO{
    @Override
    public List<News> getNews(Statement statement){
        List<News> news = new ArrayList<News>();
        //Connection conn = null;
        
        try{
            //conn = ConnectionUtils.getSQLServerConnection();
            String sql = "Select * From news";
            //Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                News newobj = new News();
                int id = rs.getInt("id");
                newobj.setId(id);
                //String category_name = rs.getString("name");
                
                String name = rs.getString("name");
                newobj.setName(name);
                Date date = (Date) rs.getDate("date");
                newobj.setDate(date);
                
                String description = rs.getString("description");
                newobj.setDescription(description);
                
                String detail = rs.getString("detail");
                newobj.setDetail(detail);
                
                String image = rs.getString("image");
                newobj.setImage(image);
                
                int user_id = rs.getInt("user_id");
                newobj.setUser_id(user_id);
                
                news.add(newobj);
            
               // System.out.println("id: " + id + " | " + "category name: " + category_name + " | "+ "name: " + name + " | " + "description: " + description + " | " + "detail: " + detail + " | " + "image: " + image +  " | " + "date: " + date.toString());
            }      
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return news;
 }
    //@Override
     public List<News> findNewsByName(String name, Statement statement){
         List<News> news = new ArrayList<News>();
         try{
            //conn = ConnectionUtils.getSQLServerConnection();
            String sql = "Select * from news where name = '" + name +"'";
            //Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                News newobj = new News();
                int id = rs.getInt("id");
                newobj.setId(id);
                
                String Newsname = rs.getString("name");
                newobj.setName(Newsname);
                
                Date date = (Date) rs.getDate("date");
                newobj.setDate(date);
                
                String description = rs.getString("description");
                newobj.setDescription(description);
                
                String detail = rs.getString("detail");
                newobj.setDetail(detail);
                
                String image = rs.getString("image");
                newobj.setImage(image);
                
                int user_id = rs.getInt("user_id");
                newobj.setUser_id(user_id);
                
                news.add(newobj);
            
               // System.out.println("id: " + id + " | " + "category name: " + category_name + " | "+ "name: " + name + " | " + "description: " + description + " | " + "detail: " + detail + " | " + "image: " + image +  " | " + "date: " + date.toString());
            }      
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
         return news;
     }
    @Override
    public List<News> findNewsByCategoryName(String categoryname, Statement statement){
        List<News> news = new ArrayList<News>();
         try{
            //conn = ConnectionUtils.getSQLServerConnection();
            String sql = "Select news.* from news inner join categories on news.category_id = categories.id where cat_name = '" + categoryname + "'";
            //Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                News newobj = new News();
                
                int id = rs.getInt("id");
                newobj.setId(id);
                
                String Newsname = rs.getString("name");
                newobj.setName(Newsname);
                
                Date date = (Date) rs.getDate("date");
                newobj.setDate(date);
                
                String description = rs.getString("description");
                newobj.setDescription(description);
                
                String detail = rs.getString("detail");
                newobj.setDetail(detail);
                
                String image = rs.getString("image");
                newobj.setImage(image);
                
                int user_id = rs.getInt("user_id");
                newobj.setUser_id(user_id);
                
                news.add(newobj);
            
               // System.out.println("id: " + id + " | " + "category name: " + category_name + " | "+ "name: " + name + " | " + "description: " + description + " | " + "detail: " + detail + " | " + "image: " + image +  " | " + "date: " + date.toString());
            }      
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
         return news;
    }
    
    @Override
    public void addNews (News news, Statement statement){
        try{
            //conn = ConnectionUtils.getSQLServerConnection();
            
            String sql = "INSERT INTO news(category_id, name, [description], detail, [image], [date], [user_id]) VALUES(" + news.getCategory_id()+ ", '" + news.getName() + "', '" + news.getDescription()+ "', '" + news.getDetail() + "', '" + news.getImage() + "', '" + news.getDate().toString() + "'," + news.getUser_id() + ")";
            //Statement statement = conn.createStatement();
            int rowCount = statement.executeUpdate(sql);
            System.out.println("Row count affected = " + rowCount);
            
               // System.out.println("id: " + id + " | " + "category name: " + category_name + " | "+ "name: " + name + " | " + "description: " + description + " | " + "detail: " + detail + " | " + "image: " + image +  " | " + "date: " + date.toString());
                  
            
            
        }catch(SQLException e){
            e.printStackTrace();
            
        }
    }
    
    @Override
    public void deleteNewsByName(String Inputname, Statement statement){
        
        try{
        String sql = "Delete from news where name = '" + Inputname +"'";
        
        // thuc thi cau lenh
        
        int rowCount = statement.executeUpdate(sql);
        System.out.println("Row count affected = " + rowCount);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    @Override
    public void updateNewsByName(String Inputname, Statement statement){
        // Update truong category cua news
        try{
        String sql = "UPDATE news SET category_id = 1 WHERE name = '" + Inputname + "'";
        
        // thuc thi cau lenh
        
        int rowCount = statement.executeUpdate(sql);
        System.out.println("Row count affected = " + rowCount);
        }catch(SQLException e){
            e.printStackTrace();
        }
    
    }
    
}