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
public class Triangle extends Shape{
    private int base;
    private int height;
    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    
    // them 2 phuon thuc get set 
    public int getBase(){
        return this.base;
    }
    
    public void setBase(int base){
        this.base = base;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public void setHeight(int height){
        this.height = height;
    }
    // muon co duoc o duoi chi can go get.. sau do xem goi y ben duoi
    // Khi da cai dat abstrac class cha thi may chu class con can phai 
    // khai bao day du cac method cua class cha, khong trinh bien dich se bao loi 
    // va goi y them cac method vao 
    @Override
    public double getArea() {
        //return super.getArea(); //To change body of generated methods, choose Tools | Templates.
        return 0.5*this.base*this.height;
    }
    // ghi de len noi dung cua thang cha 
    @Override
    public String toString() {
        return this.getColor(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
