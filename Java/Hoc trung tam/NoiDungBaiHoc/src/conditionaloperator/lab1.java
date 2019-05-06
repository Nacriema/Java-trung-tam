/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionaloperator;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b;
        System.out.print("Nhap vao so a: ");
        a = input.nextFloat();
        System.out.print("Nhap vao so b: ");
        b = input.nextFloat();
        System.out.println("Tong cua " + a + " va "+ b + " la: " + (a+b));
        System.out.println("Hieu cua " + a + " va "+ b + " la: " + (a-b));
        System.out.println("So du cua " + a + " chia "+ b + " la: " + (a%b));
        System.out.println("Thuong cua " + a + " va "+ b + " la: " + (a/b));
        System.out.println("Lenh a++ cho ta: " + (a++));
        // sau dong lenh nay se tang a len 1  tuc a = 2
        System.out.println("Lenh b-- cho ta: " + (b--));
        // sau dong lenh nay se giam b xuong 1 tuc b = 1
        String d;
        //(a>b)? System.out.println("a>b"):System.out.println("a<=b");
        d = (a>b)? "a>b" : "a<=b";
        System.out.println(d);
        // vi vay do do se lam cho a>=b
        System.out.println(check(a, b));
    }
      public static String check(float a, float b){
            if(a>b)return("a>b");
            return ("a<=b");
        }
}
