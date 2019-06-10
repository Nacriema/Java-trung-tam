/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitapnhom;

/**
 *
 * @author PC
 */
// Sao ky vay ta ???
public class Hoanvi{
    static int a = 2;
    static int b = 3;
    static int c[] = {3, 2, 5, 6, 4, 8, 1};
    public static void Hoanvi1(int a, int b) 
    {
        a = a+b;
        b = a-b;
        a = a-b;
    }
    public static void Hoanvi2(int a, int b) {
        Hoanvi.a = b;
        Hoanvi.b = a;
    }
    public static void Xepmang(int c[]){
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c.length; j++){
                if(c[i] > c[j]) Hoanvi2(c[i], c[j]);
            }
        }
    }
    public static void main(String[] args) {
        Hoanvi2(a,b);
        int c[] = {3, 2, 5, 6, 4, 8, 1};
        System.out.println(a + " " + b);
        Xepmang(c);
        for(int i= 0; i<c.length; i++){
            System.out.print(c[i]+ " ");
        }
    }
}
