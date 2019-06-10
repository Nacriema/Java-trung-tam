/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author PC
 */
public class ThreadDemoTest {
    public static void main(String[] args) {
        System.out.println("Main thread running...");
        RunnableDemo T1 = new RunnableDemo("Thread 1: HR-Database");
        T1.start();
        RunnableDemo T2 = new RunnableDemo("Thread 2: Send Email");
        T2.start();
    }
}
