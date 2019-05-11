/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaday4;

import java.util.LinkedList;

/**
 *
 * @author PC
 */
public class LinklistExample {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Java");
        linkedlist.add("PHP");
        linkedlist.add("Python");
        linkedlist.add("C++");
    // Show linkedlist by iterator
    // Sow LinkedList by for-each
    // Show LinkedList by loop for()
    
    //Some operator with LinkedList
    //1. addFirst
    linkedlist.addFirst("Ruby");
    //2. addLast
    linkedlist.addLast("C#");
    //3. remove(index)
    linkedlist.remove(3);
    }
}
