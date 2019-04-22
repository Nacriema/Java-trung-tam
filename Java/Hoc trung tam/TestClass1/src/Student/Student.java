/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;


/**
 *
 * @author PC
 */
public class Student {
    private final String name;
    private final int age;
    private final String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public void print_info() {
        System.out.println(name + " " + age + " " + gender);
    }
 }
