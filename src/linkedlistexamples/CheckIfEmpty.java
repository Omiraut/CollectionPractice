package linkedlistexamples;

import java.util.LinkedList;

public class CheckIfEmpty {
    public static void main(String[] args) {
        // Creating a linked list
        LinkedList<String> list = new LinkedList<>();
        // Checking if the list is empty
        System.out.println("Is the linked list empty? " + list.isEmpty());
        // Adding elements to the list
        list.add("Element1");
        list.add("Element2");
        // Checking if the list is empty again
        System.out.println("Is the linked list empty after adding elements? " + list.isEmpty());
        // Clearing the list 
        list.clear();
        // Checking if the list is empty again
        System.out.println("Is the linked list empty after clearing elements? " + list.isEmpty());
    }
}
