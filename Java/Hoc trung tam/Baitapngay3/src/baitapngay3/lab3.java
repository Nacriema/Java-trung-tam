/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapngay3;
//import baitapngay3.Employee;
//import baitapngay3.Job;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class lab3 {
    static Employee[] employee = new Employee[6];
    static char index;
    static int current_size, id, age;
    static String name, jobtext;
    static double Salary;
    static Job job;
   
   
    // can lam la khoi tao cai ni trong class employee 
    static Job job1 = new Job( 1 ,"HR");
    static Job job2 = new Job(2, "Developer");
    static Job job3 = new Job (3, "CEO");
    static Job job4 = new Job(4, "Tester");
    static Job job5 = new Job(5, "BA");
    
//    public static void init(int id, String name, int age, int Salary, String Jobname) {
//        employee[id].id = id;
//        employee[id].name = name;
//        employee[id].Age = age;
//        employee[id].Salary = Salary;
//        employee[id].job.name = Jobname;
//    }
    static Employee employee1 = new Employee(1, "Nguyen Van A", 18, 3000, job1);
    static Employee employee2 = new Employee(2, "Nguyen Van B", 19, 4000, job5);
    static Employee employee3 = new Employee(3, "Nguyen Van C", 20, 5000, job4);
    static Employee employee4 = new Employee(4, "Nguyen Van D", 21, 6000, job2);
    static Employee employee5 = new Employee(5, "Nguyen Van E", 22, 7000, job3);
    
   
 public static void main(String[] args) {
        employee[1] = employee1;
        employee[2] = employee2;
        employee[3] = employee3;
        employee[4] = employee4;
        employee[5] = employee5;
        System.out.println("Program to manage employee");
        System.out.println("Menus: ");
        System.out.println("1. Create employee");
        System.out.println("2. Show the existing employee");
        System.out.println("3. Exit");
        
        do{
        System.out.print("Enter your choosen: ");
        Scanner input = new Scanner(System.in);
        index = input.next().charAt(0);
        switch(index){
            case '1': 
                System.out.println("Creating employee...");
                if (current_size == employee.length){
                    System.out.println(" Cannot insert any employee");
                    break;
                }
                else{
                    System.out.print("Enter id: ");
                    //Scanner input1 = new Scanner(System.in);
                    id = input.nextInt();
                    System.out.print("Enter name: ");
                    name = input.next();
                    System.out.print("Enter age: ");
                    age = input.nextInt();
                    System.out.print("Enter salary: ");
                    Salary = input.nextDouble();
                    System.out.print("Enter job: ");
                    jobtext = input.next();
                    Object job = jobtext;
                    break;
//                    static Employee employee = new Employee(id, name, age, Salary, job);
//                    employee[id] = employee;
//                    break;
                    }
            case '2':
                System.out.println("Showing the existing employee...");
                System.out.println("ID      Name            Age       Salary     Jobname");
                for(int i= 1; i<=employee.length-1; i++){
                    System.out.println(employee[i].id + "      " + employee[i].name + "       "+ employee[i].Age + "      " + employee[i].Salary+"      "+ employee[i].job.name);
                    }
                break;
            case '3':
                System.out.println("Existing...");
                break;
            default:
                System.out.println("Invalid index, please try again...");
                
        }

   }while(index != 3);
       //System.out.println(employee.length);
//        System.out.println("ID      Name            Age       Salary     Jobname");
//        for(int i= 1; i<=employee.length-1; i++){
//            System.out.println(employee[i].id + "      " + employee[i].name + "       "+ employee[i].Age + "      " + employee[i].Salary+"      "+ employee[i].job.name);
//        }
    }    
}
