/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaday4;

import com.sun.org.apache.xml.internal.security.encryption.AgreementMethod;

/**
 *
 * @author PC
 */
public class Animal {
    private String name;
    private int Age;
    private String TypeOfAnimal;
    
    // Ham dung
    public Animal(String name, int Age) {
        this.name = name;
        this.Age = Age;
    }
// encaplusated 
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getAge(){
        return Age;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
}
