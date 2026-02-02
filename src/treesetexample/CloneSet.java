
package treesetexample;

import java.util.TreeSet;

public class CloneSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");
        System.out.println("Original TreeSet: " + treeSet);
        
        //Cloneing
        TreeSet<String> clonedSet  = (TreeSet<String>)treeSet.clone(); 
        System.out.println("Cloned TreeSet: " + clonedSet);

    }

    
}
