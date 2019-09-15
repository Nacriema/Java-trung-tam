/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import demo.bo.News;
import demo.dao.INewsDAO;
import demo.daoimpl.NewsDAOImpl;
import demo.utils.ConnectionUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class MainProgram {
    public static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
	public static int inputNumber = 0;
    public static List<News>news = new ArrayList<News>();
	public static boolean isEndProgram = false;

        // Ham main
        public static void main(String{} args) throws SQLException, ClassNotFoundException {
		showMenu();
		System.out.println("The program end!!!");
	}
	
        public static void showMenu() throws SQLException, ClassNotFoundException {
           
            INewsDAO Newsin = new NewsDAOImpl() {};
           
                do {
			if (isEndProgram) {
				break;
			}
			System.out.println("Choose one numbers below : ");
			System.out.println("1: Create news");
			System.out.println("2: Show the existing News");
			System.out.println("3: Search news by name");
                        System.out.println("4: Search news by category");
                        System.out.println("5: Delete news by name");
                        System.out.println("6: Update news by name (update category)");
			System.out.println("7: exit");
			System.out.println("-------------------------------");
			System.out.println("Type your input number : ");
			inputNumber = scanner.nextInt();
			switch (inputNumber) {
			case 1:
                            
                                News objnews  = new News();
				System.out.println("Please input the information of news");
                                
                                 
//                                int id = rs.getInt("id");
//                                newobj.setId(id);
                                System.out.print("Name: ");
                                String Newsname = scanner.next();
                                
                                objnews.setName(Newsname);
                                
                                System.out.print("Category_id: ");
                                int catid = scanner.nextInt();
                                
                                objnews.setCategory_id(catid);
                                
                                System.out.print("Date: ");
                                String date = scanner.next();
                               
                                Date Newsdate=Date.valueOf(date);
                                objnews.setDate(Newsdate);
                                
                                System.out.print("Description: ");
                                String description = scanner.next();
                                objnews.setDescription(description);
                                
                                System.out.print("Detail: ");
                                String detail = scanner.next();
                                objnews.setDetail(detail);
                                
                                System.out.print("Image: ");
                                String image = scanner.next();
                                objnews.setImage(image);
                                
                                System.out.print("User id: ");
                                int user_id = scanner.nextInt();
                                objnews.setUser_id(user_id);
                                
                                // Sau do dung ham trong implements de chen objnews vao db
                                Connection conn = ConnectionUtils.getSQLServerConnection();
                                Statement statement = conn.createStatement();
                                Newsin.addNews(objnews, statement);
                                
				askForContinue();
				break;
			case 2:
                                
                                conn = ConnectionUtils.getSQLServerConnection();
                        
                            try {
                                statement = conn.createStatement();
                                news = Newsin.getNews(statement);
                        
				if (news != null && news.size() > 0) {
                                        //Duyet list news
                                        
                                        for(News news:news){
                                        System.out.println("id: " + news.getId() + " | " + "name: " + news.getName() + " | " + "description: " + news.getDescription() + " | " + "detail: " + news.getDetail() + " | " + "image: " + news.getImage() +  " | " + "date: " + news.getDate().toString());
                                        }
					
				} else {
					System.out.println("Please add any news first!");
					System.out.println("-------------------------------");
				}
				askForContinue();
				break;
                            } catch (SQLException ex) {
                            }
                        
                            
			
			case 3:
				System.out.println("Please input name to search : ");
				String nameInput = scanner.next();
                                //Employee employee4 = null;
                                
                                conn = ConnectionUtils.getSQLServerConnection();
                            try{
                                statement = conn.createStatement();
                                news = Newsin.findNewsByName(nameInput, statement);
                                
                                if(news == null || news.isEmpty()){
                                    System.out.println("There is no employee that you find in the data base.");
                                    askForContinue();
                                    break;
                                }
                                else{
				System.out.println("-----Thong tin tim kiem --------");
                                
                                for(News news:news){
                                    System.out.println("id: " + news.getId() + " | " + "name: " + news.getName() + " | " + "description: " + news.getDescription() + " | " + "detail: " + news.getDetail() + " | " + "image: " + news.getImage() +  " | " + "date: " + news.getDate().toString());
                                    }
                                }
                                askForContinue();
                                break;
                            }catch(SQLException ex){
                            }
                        case 4:
				System.out.println("Please input name of category: ");
				String categoryname = scanner.next();
                                //Employee employee4 = null;
                                
                                conn = ConnectionUtils.getSQLServerConnection();
                            try{
                                statement = conn.createStatement();
                                news = Newsin.findNewsByCategoryName(categoryname, statement);
                                
                                if(news == null || news.isEmpty()){
                                    System.out.println("There is no news in the category.");
                                    askForContinue();
                                    break;
                                }
                                else{
				System.out.println("------Thong tin tim kiem --------");
                                
                                for(News news:news){
                                    System.out.println("id: " + news.getId() + " | " + "name: " + news.getName() + " | " + "description: " + news.getDescription() + " | " + "detail: " + news.getDetail() + " | " + "image: " + news.getImage() +  " | " + "date: " + news.getDate().toString());
                                    }
                                }
                                askForContinue();
                                break;
                            }catch(SQLException ex){
                            }    
                            
                            
			case 5:
				System.out.println("Please input name of news to delete: ");
				String nameInputDelete = scanner.next();
                                
                                conn = ConnectionUtils.getSQLServerConnection();
                                try{
                                    statement = conn.createStatement();
                                    Newsin.deleteNewsByName(nameInputDelete, statement);
                                    askForContinue();
                                    break;
                                    
                                }catch(SQLException ex){
                                }                                
                        case 6:
                                System.out.println("Please input name of news to update: ");
                                String nameInputUpdate = scanner.next();
                              
                                conn = ConnectionUtils.getSQLServerConnection();
                                try{
                                    statement = conn.createStatement();
                                    Newsin.updateNewsByName(nameInputUpdate, statement);
                                    askForContinue();
                                    break;
                                    
                                }catch(SQLException ex){
                                }                    
                                
                        case 7:
				break;
			default:
				System.out.println("your input number is wrong, please input again!");
				System.out.println("-------------------------------");
				showMenu();
			}

		} while (inputNumber != 7);
	}
        


public static void askForContinue() throws SQLException, ClassNotFoundException {
		System.out.println("Do you want to continue? (Press 3 to end proram, 0 to come back menu) : ");
		int inputNo = scanner.nextInt();
		switch (inputNo) {
		case 0:
			showMenu();
			break;
		case 3:
			isEndProgram = true;
			break;
		default:
			break;
		}
	}
}
