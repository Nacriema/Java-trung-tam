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
// viet cai interface tuong tu nhu class
// Loi the: mot class con co the thua ke duoc nhieu class cha khi class cha la interface
// Tao mot interface == class abstraction
// Cac method trong interface phai la public, khi do nguoi ta moi implement va cai dat duoc no
public interface ATM1 {
    public boolean withdraw(int accNo, double money);
    public boolean deposit(int accNo, double money);
    public double queryBalance(int accNo);
    
}
