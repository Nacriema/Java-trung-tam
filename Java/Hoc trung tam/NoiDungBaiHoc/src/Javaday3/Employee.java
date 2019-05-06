/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaday3;

/**
 *
 * @author PC
 */
//public class Employee {
//    String name;
//    int id;
//    double Salary;
//    int Age;
//    boolean Married;
//    Job job;
//    public Employee(int id, String name, int age, int Salary, Job job){
//        this.id = id;
//        this.name = name;
//        this.Age = age;
//        this.Salary = Salary;
//        this.job = job;
//    }
//  }
public class Employee {
	private String name;
	private int id;
	private double salary;
	private int age;
	private boolean married;
	private Job job;
	public Employee(String name, int id, double salary, int age, boolean married, Job job) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.married = married;
		this.job = job;
	}
        public String getName(){
            return this.name;
        }
	public int getId(){
            return this.id;
        }
	public double getSalary(){
            return this.salary;
        }
        public void setSalary(double salary){
            this.salary = salary;
        }
        public int getAge(){
            return this.age;
        }
        public boolean getMarried(){
            return this.married;
        }
        public Job getJob(){
            return this.job;
        }
}