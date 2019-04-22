/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dog;

/**
 *
 * @author PC
 */
public class Puppy {

    /**
     * @param args the command line arguments
     */
    public Puppy(String name){
        System.out.println("Passed Name is: " + name);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Puppy myPuppy = new Puppy( "Tommy" );
    }
    
}
