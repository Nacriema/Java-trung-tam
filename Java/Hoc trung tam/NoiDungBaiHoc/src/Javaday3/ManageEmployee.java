/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Mot khi da viet ham thi phai de cao tinh tai su dung cua no !!!!!!!!11
package Javaday3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
//public class ManageEmployee {
//    public static Employee[] employees;
//    static char index;
////    static int current_size, id, age;
////    static String name, jobtext;
////    static double Salary;
////    static Job job;
//    public static Scanner input = new Scanner(System.in);
////   
////    // can lam la khoi tao cai ni trong class employee 
////    static Job job1 = new Job( 1 ,"HR");
////    static Job job2 = new Job(2, "Developer");
////    static Job job3 = new Job (3, "CEO");
////    static Job job4 = new Job(4, "Tester");
////    static Job job5 = new Job(5, "BA");
////    
//////    public static void init(int id, String name, int age, int Salary, String Jobname) {
//////        employee[id].id = id;
//////        employee[id].name = name;
//////        employee[id].Age = age;
//////        employee[id].Salary = Salary;
//////        employee[id].job.name = Jobname;
//////    }
////    static Employee employee1 = new Employee(1, "Nguyen Van A", 18, 3000, job1);
////    static Employee employee2 = new Employee(2, "Nguyen Van B", 19, 4000, job5);
////    static Employee employee3 = new Employee(3, "Nguyen Van C", 20, 5000, job4);
////    static Employee employee4 = new Employee(4, "Nguyen Van D", 21, 6000, job2);
////    static Employee employee5 = new Employee(5, "Nguyen Van E", 22, 7000, job3);
////    
//   
//// public static void main(String[] args) {
////        employee[1] = employee1;
////        employee[2] = employee2;
////        employee[3] = employee3;
////        employee[4] = employee4;
////        employee[5] = employee5;
////        System.out.println("Program to manage employee");
////        System.out.println("Menus: ");
////        System.out.println("1. Create employee");
////        System.out.println("2. Show the existing employee");
////        System.out.println("3. Exit");
////        
////        do{
////        System.out.print("Enter your choosen: ");
////        Scanner input = new Scanner(System.in);
////        index = input.next().charAt(0);
////        switch(index){
////            case '1': 
////                System.out.println("Creating employee...");
////                if (current_size == employee.length){
////                    System.out.println(" Cannot insert any employee");
////                    break;
////                }
////                else{
////                    System.out.print("Enter id: ");
////                    //Scanner input1 = new Scanner(System.in);
////                    id = input.nextInt();
////                    System.out.print("Enter name: ");
////                    name = input.next();
////                    System.out.print("Enter age: ");
////                    age = input.nextInt();
////                    System.out.print("Enter salary: ");
////                    Salary = input.nextDouble();
////                    System.out.print("Enter job: ");
////                    jobtext = input.next();
////                    Object job = jobtext;
////                    break;
//////                    static Employee employee = new Employee(id, name, age, Salary, job);
//////                    employee[id] = employee;
//////                    break;
////                    }
////            case '2':
////                System.out.println("Showing the existing employee...");
////                System.out.println("ID      Name            Age       Salary     Jobname");
////                for(int i= 1; i<=employee.length-1; i++){
////                    System.out.println(employee[i].id + "      " + employee[i].name + "       "+ employee[i].Age + "      " + employee[i].Salary+"      "+ employee[i].job.name);
////                    }
////                break;
////            case '3':
////                System.out.println("Existing...");
////                break;
////            default:
////                System.out.println("Invalid index, please try again...");
////                
////        }
////
////   }while(index != 3);
////       //System.out.println(employee.length);
//////        System.out.println("ID      Name            Age       Salary     Jobname");
//////        for(int i= 1; i<=employee.length-1; i++){
//////            System.out.println(employee[i].id + "      " + employee[i].name + "       "+ employee[i].Age + "      " + employee[i].Salary+"      "+ employee[i].job.name);
//////        }
////    }   1
//    public static void main(String[] args) {
//        showmenu();
//        System.out.println("The program ended.");
//    }
//    public static void showmenu(){
////        System.out.println("Program to manage employee");
////        System.out.println("Menus: ");
////        System.out.println("1. Create employee");
////        System.out.println("2. Show the existing employee");
////        System.out.println("3. Exit");
//        do{
//        System.out.println("-------------------||-------------------");
//        System.out.println("Program to manage employee");
//        System.out.println("Menus: ");
//        System.out.println("1. Create employee");
//        System.out.println("2. Show the existing employee");
//        System.out.println("3. Exit");
//        System.out.println("4. Find an employee");
//        System.out.println("5. Update employee by name");
//        System.out.print("Enter your choosen: ");
//        
//        index = input.next().charAt(0);
//        
//        switch(index){
//            case '1': 
//                addEmployee();
//                
////                System.out.println("Creating employee...");
////                if (current_size == employee.length){
////                    System.out.println(" Cannot insert any employee");
////                    break;
////                }
////                else{
////                    System.out.print("Enter id: ");
////                    //Scanner input1 = new Scanner(System.in);
////                    id = input.nextInt();
////                    System.out.print("Enter name: ");
////                    name = input.next();
////                    System.out.print("Enter age: ");
////                    age = input.nextInt();
////                    System.out.print("Enter salary: ");
////                    Salary = input.nextDouble();
////                    System.out.print("Enter job: ");
////                    jobtext = input.next();
////                    Object job = jobtext;
//                    break;
////                    static Employee employee = new Employee(id, name, age, Salary, job);
////                    employee[id] = employee;
////                    break;
//                    
//            case '2':
//                // Thu lai xem 
//                if (employees != null && employees.length >0){
//                    showEmployee();
//                } else {
//                    System.out.println("You should add employee first !!!");
//                
////                System.out.println("Showing the existing employee...");
////                System.out.println("ID      Name            Age       Salary     Jobname");
////                for(int i= 1; i<=employee.length-1; i++){
////                    System.out.println(employee[i].id + "      " + employee[i].name + "       "+ employee[i].Age + "      " + employee[i].Salary+"      "+ employee[i].job.name);
//                   }
//                break;
//            case '3':
//                System.out.println("Existing...");
//                break;
//            case '4':
//                System.out.println("Enter name you want to find: ");
//                String keyname = input.next();
//                Employee employee = searchforEmployee(keyname); // can co mot cai object de hung no
//                System.out.println("Information you need: ");
//                System.out.println(employee.id + "      " + employee.name + "       "+ employee.Age + "      " + employee.Salary+"      "+ employee.job.name);
//                break;
//            case '5':
//                System.out.println("Enter name you want to update: ");
//                String name = input.next();
//                System.out.println("Enter salary you want to update: ");
//                Double newSalary = input.nextDouble();
//                updateEmployeeByName(name, newSalary);
//            default:
//                System.out.println("Invalid index, please try again...");
//                
//            }
//        }while(index != '3');
//    }
//
// public static void addEmployee(){
//    System.out.println("This is add employee");
//    System.out.println("How many employee do you want to add ?");
//    int employeeno = input.nextInt();
//    employees = new Employee[employeeno];
//    for (int i= 0; i < employees.length; i++){
//           // support input
//           System.out.println("Add information for employee: " + (i+1));
//           System.out.print("Enter name: ");
//           String name = input.next();
//           System.out.print("Enter Salary: ");
//           int Salary = input.nextInt();
//           System.out.print("Enter Age: ");
//           int age = input.nextInt();
//           System.out.print("Enter name of job: ");
//           String jobname = input.next();
//           Employee employee = new Employee(i+1 , name, age, Salary, new Job(i, jobname));
//           employees[i] = employee;
//    }
//    
// }
// 
// public static void showEmployee(){
//    System.out.println("This is show employee");
//    System.out.println("Showing the existing employee...");
//                System.out.println("ID      Name            Age       Salary     Jobname");
//                for(int i= 0; i<=employees.length-1; i++){
//                    System.out.println(employees[i].id + "      " + employees[i].name + "       "+ employees[i].Age + "      " + employees[i].Salary+"      "+ employees[i].job.name);
//                    }
// }
//  public static Employee searchforEmployee(String name) {
//      Employee employee = null;
//      for(int i = 0; i<employees.length; i++){
//          if(name.equals(employees[i].name)){ 
//              employee = employees[i];
//              break;
//          }
//       }
//      return employee;
//   }
//    public static void askforcontinue() {
//      
//        
//    }
//    public static void updateEmployeeByName(String keyname, Double newSalary){
//        Employee employee = null;
//    
//        for(int i = 0; i<employees.length; i++){
//          if(keyname.equals(employees[i].name)){ 
//              employees[i].Salary = newSalary;
//              break;
//         }
//       }
//    }
//   // Toi ve edit lai cai code ni  
//    
//    
//}
public class ManageEmployee {
	public static Scanner scanner = new Scanner(System.in);
	public static int inputNumber = 0;
	public static int employeeNo = 0;
	public static Employee[] employees;
	public static boolean isEndProgram = false;
	public static void main(String[] args) {
		showMenu();
		System.out.println("The program end!!!");
	}
	
	public static void showMenu() {
		do {
			if (isEndProgram) {
				break;
			}
			System.out.println("Choose one numbers below : ");
			System.out.println("1: Create  new Employees");
			System.out.println("2: Show the existing Employees");
			System.out.println("4: Search employee by name");
			System.out.println("5: Update employee by name");
			System.out.println("3: exit");
			System.out.println("-------------------------------");
			System.out.println("Type your input number : ");
			inputNumber = scanner.nextInt();
			switch (inputNumber) {
			case 1:
				addEmployee();
				askForContinue();
				break;
			case 2:
				if (employees != null && employees.length > 0) {
					showEmployee();
				} else {
					System.out.println("Please add new employee first!");
					System.out.println("-------------------------------");
				}
				askForContinue();
				break;
			case 3:
				break;
			case 4:
				System.out.println("Please input name to search : ");
				String nameInput = scanner.next();
				Employee employee = searchByName(nameInput);
				System.out.println("-----Thong tin tim kiem --------");
				System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
				askForContinue();
			case 5:
				System.out.println("Please input name to update : ");
				String nameInputUpdate = scanner.next();
                               
				System.out.println("Please input new salary : ");
				double newSalary = scanner.nextDouble();
				/*String fullName = "nguyen tam thanh";
				if (fullName.contains(nameInputUpdate)) {
					//do somethings
				}*/
				updateEmployeeByName(nameInputUpdate, newSalary);
				askForContinue();
			default:
				System.out.println("your input number is wrong, please input again!");
				System.out.println("-------------------------------");
				showMenu();
			}

		} while (inputNumber != 3);
	}
	
	public static void addEmployee() {
		System.out.println("How many employee you want to create? : ");
		employeeNo = scanner.nextInt();
		employees = new Employee[employeeNo];
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
			employees[i] = employee;
		}
	}
	
	public static void showEmployee() {
		System.out.println("----------------List of employee-----------");
		System.out.println("ID Name             Salary    Job name");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getId() + " " + employees[i].getName() + "       " + employees[i].getSalary() + " " + employees[i].getJob().getName());
		}
	} 
	
	public static Employee searchByName(String nameInput) {
		Employee employee = null;
		for (int i = 0; i< employees.length; i++) {
			if (nameInput.equals(employees[i].getName())) {
				employee = employees[i];
				break;
			}
		}
		return employee;
	}
	
	public static void updateEmployeeByName(String nameInput, Double newSalary) {
		for (int i = 0; i< employees.length; i++) {
			if (nameInput.equals(employees[i].getName())) {
				employees[i].setSalary(newSalary);
				break;
			}
                    }
		}
	
	
	public static void askForContinue() {
		System.out.println("Do you want to continue? (Press 3 to end proram, 0 to come back menu) : ");
		int inputNo = scanner.nextInt();
		switch (inputNo) {
		case 0:
			showMenu();
			break;
		case 3:
			isEndProgram = true;
			break;
		default:
			break;
		}
	}
}
