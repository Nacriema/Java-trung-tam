/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaday3;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public interface EmployeeIntp {
    public void addEmployee(ArrayList<Employee> employees);
    public void showEmployee(ArrayList<Employee> employees);
    public Employee searchByName(ArrayList<Employee> employees, String nameInput);
    public void updateEmployeeByName(ArrayList<Employee> employees, String nameInput, Double newSalary);
}
