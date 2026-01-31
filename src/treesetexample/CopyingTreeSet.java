package treesetexample;

import java.util.TreeSet;

public class CopyingTreeSet {
    
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Rose");
        treeSet.add("Tulip");
        treeSet.add("Daisy");
        treeSet.add("Sunflower");
        treeSet.add("Lily");
        System.out.println("Original TreeSet: " + treeSet);
        // Copying elements from one TreeSet to another
        TreeSet<String> copiedSet = new TreeSet<>(treeSet);
        System.out.println("Copied TreeSet: " + copiedSet);

        // Adding elements to the original TreeSet
        treeSet.add("Orchid");
        System.out.println("Original TreeSet after adding element: " + treeSet);
        System.out.println("Copied TreeSet remains unchanged: " + copiedSet);


        System.out.println("Adding elements again in Copied tree set using second method:");

        // Second method of copying using addAll()
        copiedSet.clear(); // Clear previous contents
        copiedSet.addAll(treeSet);
        for(String flower : copiedSet){
            System.out.println(flower);
        }

        
    }

}
