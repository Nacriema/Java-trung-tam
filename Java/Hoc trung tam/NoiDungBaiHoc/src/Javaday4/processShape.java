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
public class processShape {
        public static void main(String[] args) {
            Triangle triangle = new Triangle("red", 10 , 5);
            System.out.println("Dien tich tam giac: " + triangle.getArea());
    }
}
