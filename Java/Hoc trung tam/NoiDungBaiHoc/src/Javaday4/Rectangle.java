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
public class Rectangle extends Shape{
    private int length;
    private int width;
    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    // tao phuong thuc get set
    public int getLength(){
        return this.length;
    }
    
    public void setLenght(int lenght){
        this.length = length;
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public void setWidth(int width){
        this.width = width;
    }
    // Thua ke tu thang cha va ghi de len phuong thuc cua thang cha 
    @Override
    public double getArea() {
        return this.length*this.width; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return this.getColor(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
