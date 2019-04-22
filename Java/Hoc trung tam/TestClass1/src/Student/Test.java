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
public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Dave", 6, "nam");
        Student student2 = new Student("Join", 7, "nam");
        Student student3 = new Student("Huy", 21, "nam");
        student1.print_info();
        student2.print_info();
        student3.print_info();
        
     }
}
