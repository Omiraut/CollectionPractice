package treesetexample;

import java.util.Scanner;
import java.util.TreeSet;

import fuctions.RandomNoGenerator;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
    System.out.print("Type 'exit' to quit or 'continue' to proceed: ");
    String input = scanner.next();

    if (input.equalsIgnoreCase("exit")) {
        scanner.close();
        System.out.println("Exiting program.");
        break;
    } else if (input.equalsIgnoreCase("continue")) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println("Adding elements to the TreeSet:");

        System.out.print("Enter the number of elements to add: ");
        int n = scanner.nextInt();
        for (int i =0;i<n;i++){
        treeSet.add(RandomNoGenerator.getRandomNumber(2));
        }
        System.out.println("TreeSet elements: " + treeSet);

        for (Integer i : treeSet){
            System.out.println("Element : "+i);
        }
        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();
        if (treeSet.remove(elementToRemove)) {
            System.out.println("Element " + elementToRemove + " removed successfully.");
        } else {
            System.out.println("Element " + elementToRemove + " not found in the TreeSet.");
        }
        System.out.println("Updated TreeSet elements: " + treeSet);
    }
}

    }
}