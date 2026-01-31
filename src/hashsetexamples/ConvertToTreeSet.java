package hashsetexamples;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class ConvertToTreeSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
       
        Scanner sc = new Scanner(System.in);
        int n = 10;
        System.out.println("Enter " + n + " elements to add to the HashSet:");
        for (int i = 0;i<n;i++){
            String element = sc.nextLine();
            hashSet.add(element);
        }
        
        System.out.println("HashSet elements:");
        for (String str : hashSet){
            System.out.println(str);
        }
        // Re-displaying HashSet elements to show no particular order
        System.out.println("HashSet elements (re-displayed):");
        for (String str : hashSet){
            System.out.println(str);
        }
        // Convert HashSet to TreeSet
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("Converted TreeSet elements (sorted):");
        for (String str : treeSet){
            System.out.println(str);
        }
        // Printing again to show TreeSet maintains sorted order
        System.out.println("TreeSet elements in sorted order:");
        for (String str : treeSet){
            System.out.println(str);
        }
        sc.close();
    }
}
