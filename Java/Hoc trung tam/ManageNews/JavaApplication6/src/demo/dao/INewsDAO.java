/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.dao;

import demo.bo.News;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author PC
 */
public interface INewsDAO {
    public void addNews(News news, Statement statement); // Them bai viet
    public void deleteNewsByName(String Inputname, Statement statement);//Xoa bai viet 
    public List<News> findNewsByName(String name, Statement statement); //Tim bai viet theo ten
    public List<News> findNewsByCategoryName(String categoryname, Statement statement); //Tim bai viet theo danh muc
    public void updateNewsByName(String name, Statement statement);  //Chinh sua bai viet
    public List<News> getNews(Statement statement);  // Hien thi danh sach bai viet
}
