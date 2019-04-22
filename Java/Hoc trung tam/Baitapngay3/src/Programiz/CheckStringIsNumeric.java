/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programiz;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class CheckStringIsNumeric {
    public static void main(String[] args) {
        //String string = "12345.15";
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can kiem tra: ");
        String string = input.next();
        
        boolean numeric = true;
        
        try{
            Double num = Double.valueOf(string);
            //Double num = Double.parseDouble(string);
            // neu ma dong convert nay thuc hien duoc thi gt bollean ko thay doi
        }catch(NumberFormatException e){
            numeric = false;
        }
        if(numeric)
            System.out.println(string + " la mot so");
        else 
            System.out.println( string + " khong la mot so");
    }
}
