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
public class Nhapxuat {
    public static void main(String[] args) {
        // Dung Scanner object de nhap 
//        int a, b;
//        //a =10;
        Scanner input = new Scanner(System.in);
//        System.out.print("Nhap so a: ");
//        a = input.nextInt();
//       
//        System.out.println("So a ban vua nhap la: " + a);
//        b = (a==1)? 20: 30;
//        System.out.println("Value of b is: " + b);
//        b = (a==10)? 20:30;
//        System.out.println("Value of b is: " +b);
//        
//        System.out.print("Nhap so thuc: ");
//        float c = input.nextFloat();
//        System.out.println("So thuc c ban nhap vap la: " + c );
//        
//        System.out.print("Nhap so double: ");
//        double d = input.nextDouble();
//        System.out.println("So double d ban vua nhap la: " + d);
//        
//        System.out.print("Nhap mot xau s: ");
//        String s = input.next();
//        System.out.println("Chuoi ban vua nhap la: " + s);
        
        // Khi muon nhap mot xau voi day du dau cach
        
        System.out.println("Nhap ten cua ban: ");
        String[] m = input.nextLine().split(" ");
        
        for(int i = 0; i<m.length ; i++){
            System.out.print(m[i]);
        }
    }
}
