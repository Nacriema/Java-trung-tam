/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaday3;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;

/**
 *
 * @author PC
 */
public class MainProgram {
    public static void main(String args[]) {
                Job job1 = new Job(1, "HR");
		Job job2 = new Job(2, "BA");
		Job job3 = new Job(3, "Tester");
		Job job4 = new Job(4, "Developer");
		Job job5 = new Job(5, "CEO");
		Employee employee1 = new Employee("Nguyen Van A", 1, 3000, 25, false, new Job(1, "HR"));//1
		Employee employee2 = new Employee("Nguyen Van B", 2, 4000, 25, false, job2);
		Employee employee3 = new Employee("Nguyen Van C", 3, 5000, 25, true, job3);
		Employee employee4 = new Employee("Nguyen Van D", 4, 6000, 25, false, job4);
		Employee employee5 = new Employee("Nguyen Van E", 5, 7000, 25, false, job5);
		//Employee[] employees = new Employee[5];
                // Kieu ArrayList kha la huu dung do !!!!!!!!!!!!!
                ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);//2
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
//		employees[0].id = 7;//3
                // Doi voi mang ni thi dung ham size() de lay kich thuoc cua mang kieu ArrayList
		System.out.println("Mang co : " + employees.size() + " phan tu");
		System.out.println("----------------Thong tin employee-----------");
		System.out.println("ID Name             Salary    Job name");
		
                // Duyet qua cai mang ni dung Ilerator 
                Iterator<Employee> itr = employees.iterator();
                while (itr.hasNext()) {
                    // Khai bao mot doi tuong de ep kieu cua itr.next() 
                    // Minh thu ep kieu ma khong can khai bao them mot doi tuong nao khac thu
                    // Ket cuc la khong lam duoc 
                    Employee employee = itr.next();
                    System.out.println(employee.getId() + " " + employee.getName() + "       " + employee.getSalary() + " " + employee.getJob().getName());
                }
                    
           
                // Cach duyet thong qua chi so cua mang
                // Khong dung employee[i] de chi ra phan tu thu i trong mang kieu nay duoc ma dung employee.get(i) moi on ap duoc
                for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i).getId() + " " + employees.get(i).getName() + "       " + employees.get(i).getSalary() + " " + employees.get(i).getJob().getName());
		}
		// Duyet qua dung for-each
                for(Employee employee:employees){
                    System.out.println(employee.getId() + " " + employee.getName() + "       " + employee.getSalary() + " " + employee.getJob().getName());
                }
	}
}
