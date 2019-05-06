/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaday3;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Sumoffirstnnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so n: ");  // system.out.print chi thuc thi trong class main
        int n = input.nextInt();
        int sum = 0, temp = n;
//        while(n>=0){
//            sum+=n;
//            n--;
//        }
// dung do ... while
        do{
            sum+=n;
            n--;
        }while(n>0);
        System.out.println("Tong cac so tu 0 den " + temp +" la: "+ sum);
    }
    
}
