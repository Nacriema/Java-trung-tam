/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Bua 8/5/2019 thay co chi them 2 cach duyet mot mang ma khong can biet kich thuoc mang : 
//1. Dung interator 
//2. Dung 
package Javaday3;
import static Javaday3.ManageEmployee.scanner;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public abstract class EmployeeImpl implements EmployeeIntp {

    @Override
    public void addEmployee(ArrayList<Employee> employees) {
        	System.out.println("How many employee you want to create? : ");
		int employeeNo = scanner.nextInt();
		//employees = new Employee[employeeNo];
                // Dung kieu ArrayList<>
                // Minh nghi la khong can goi no nua: employees = new ArrayList<Employee>();
                for (int i = 0; i < employeeNo; i++) {
			System.out.println("Please input the information of employee[" + (i + 1) + "] : ");
			System.out.println("Name : ");
			String name = scanner.next();
			System.out.println("Salary : ");
			double salary = scanner.nextDouble();
			System.out.println("Age : ");
			int age = scanner.nextInt();
			System.out.println("Job name : ");
			String jobName = scanner.next();
			Employee employee = new Employee(name, i + 1, salary, age, true, new Job(i + 1, jobName));
                        //employees[i] = employee;
                        employees.add(employee);
    }
    }

    @Override
    public void showEmployee(ArrayList<Employee> employees) {
                
                System.out.println("----------------List of employee-----------");
		System.out.println("ID   Name      Salary    Job name");
		
//                for (int i = 0; i < employees.length; i++) {
//			System.out.println(employees[i].getId() + "  " + employees[i].getName() + "       " + employees[i].getSalary() + " " + employees[i].getJob().getName());
//		}

                // Duyet mang kieu for-each
                for(Employee employee: employees){
                        System.out.println(employee.getId() + "    " + employee.getName() + "       " + employee.getSalary() + "    " + employee.getJob().getName());
                }
    }

    @Override
    public Employee searchByName(ArrayList<Employee> employees, String nameInput) {
                Employee employee = null;
                              
//		for (int i = 0; i< employees.length; i++) {
//			if (nameInput.equals(employees[i].getName())) {
//				employee = employees[i];
//				break;
//			}
//		}
                for(int i =0; i<employees.size(); i++){
                        if(nameInput.equals(employees.get(i).getName())){
                                employee = employees.get(i);
                                break;
                        }
                }
		return employee;
    }

    @Override
    public void updateEmployeeByName(ArrayList<Employee> employees, String nameInput, Double newSalary) {

//        for (int i = 0; i< employees.length; i++) {
//			if (nameInput.equals(employees[i].getName())) {
//				employees[i].setSalary(newSalary);
//				break;
//			}
//                  }
//            }
    // Code moi dung lap for dv kieu mang ArrayList
  for (int i = 0; i< employees.size(); i++) {
			if (nameInput.equals(employees.get(i).getName())) {
				employees.get(i).setSalary(newSalary);
				break;
			}
                  }
            }
}
