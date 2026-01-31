package treesetexample;

import java.util.TreeSet;

public class CreateNPrintSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Grapes");
        treeSet.add("Orange");
        treeSet.add("Pineapple");
        treeSet.add("Mango");
        System.out.println(treeSet);

        // Irrespective of the order of insertion, TreeSet stores elements in sorted order
        // this helps in retrieving elements in a sorted manner
        System.out.println("Elements in ascending order:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

    }
}
