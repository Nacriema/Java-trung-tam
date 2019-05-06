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
public class Dog extends Animal {
    private String TypeOfAnimal;
    public Dog(String name, int Age, String TypeOfAnimal) {
        super(name, Age);  // no co moi cai ham khoi tao thua ke cac thuoc tinh cua thang cha thoi tinh ke thua tu class Animal do vay cac ham setname, getname auto tu hieu
        this.TypeOfAnimal = TypeOfAnimal;
    }
    public String getTypeAnimal() {
        return TypeOfAnimal;
    }
    public void setTypeAnimal(String TypeOfAnimal){
        this.TypeOfAnimal = TypeOfAnimal;
    }
}
