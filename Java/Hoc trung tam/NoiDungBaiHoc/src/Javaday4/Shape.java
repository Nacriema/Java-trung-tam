/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaday4;

/**
 *
 * @author PC
 */
// Abstract class co the co hoac khong method abstract, vi du nhu la method ma ko can code cu the ben trong
public abstract class Shape {
    private String color;
    
    public Shape(String color) {
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    // De han che tinh trang duoi thi dung abstraction, chi can dua ra phuong thuc
    // ma khong can cai dat bo khung ben trong, class con thi minh trien khai ben trong 
    // co 2 cach, dung abstract va interface
    
//    public double getArea(){
//        return 0;
//    }
//    public String toString(){
//        return "";
//    }
      public abstract double getArea();
      public abstract String toString();
}
