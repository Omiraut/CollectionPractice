package treesetexample;

import java.util.Iterator;
import java.util.TreeSet;

public class ReverceIteration {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Green");
        treeSet.add("Yellow");
        treeSet.add("Purple");
        treeSet.add("Orange");
        treeSet.add("Pink");
        System.out.println("Original TreeSet: " + treeSet);
        System.out.println("Iterating original tree set:");
        for (String color : treeSet){
            System.out.println(color);
        }

        // 1st Method: Using descendingIterator()
        System.out.println("Iterating in reverse order using descendingIterator():");
        Iterator it = treeSet.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 2nd Method: Using descendingSet()
        System.out.println("Iterating in reverse order using descendingSet():");
        for (String color : treeSet.descendingSet()){
            System.out.println(color);
        }




    }
}
