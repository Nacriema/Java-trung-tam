/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaday4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author PC
 */
public class HashSetExample {
    public static void main(String[] args) {
        // Create hashset
        Set<String> set = new HashSet<String>();
        // Add object to hashset
        set.add("Java");
        set.add("PHP");
        set.add("C++");
        set.add("Java");
        // Show set using 
        // 1. Iterator
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + ", ");
            }
        }
    }
//        //2. For-each
//        for(String item: set){
//            System.err.println(item + ", ");
//        }
//    }

