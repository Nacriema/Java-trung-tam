/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapngay3;

/**
 *
 * @author PC
 */
public class Employee {
    String name;
    int id;
    double Salary;
    int Age;
    boolean Married;
    Job job;
    public Employee(int id, String name, int age, int Salary, Job job){
        this.id = id;
        this.name = name;
        this.Age = age;
        this.Salary = Salary;
        this.job = job;
    }
  }
