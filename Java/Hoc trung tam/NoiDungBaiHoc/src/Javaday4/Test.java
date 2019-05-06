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
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Kiki", 3, "dog");
        System.out.println("Name of "+ dog.getTypeAnimal()+" is: "+  dog.getname()+ " Age: " + dog.getAge());
        Tiger tiger = new Tiger("Maxim", 2, "tiger");
        System.out.println("Name of "+tiger.getTypeAnimal()+" is: "+ tiger.getname()+ " Age: " + tiger.getAge());
    }
    
}
