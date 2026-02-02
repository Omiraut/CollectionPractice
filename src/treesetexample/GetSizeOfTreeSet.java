package treesetexample;

import java.util.TreeSet;

public class GetSizeOfTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Dog");
        treeSet.add("Cat");
        treeSet.add("Elephant");
        treeSet.add("Lion");
        treeSet.add("Tiger");

        System.out.println("TreeSet: " + treeSet);
        System.out.println("Size of TreeSet: " + treeSet.size());
    }
}
