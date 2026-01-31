package treesetexample;

import java.util.Scanner;
import java.util.TreeSet;

public class CompareTreeSet {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();

        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.println("Enter " + n + " elements for the first TreeSet:");
        for (int i =0;i<n;i++){
            String element = sc.nextLine();
            set1.add(element);
        }
        System.out.println("Enter " + n + " elements for the second TreeSet:");
        for (int i =0;i<n;i++){
            String element = sc.nextLine();
            set2.add(element);
        }

        System.out.println("First TreeSet elements:");
        for(String str : set1){
            System.out.println(str);
        }
        System.out.println("Second TreeSet elements:");
        for(String str : set2){
            System.out.println(str);
        }

        // Compairing elements of two TreeSets
        System.out.println("----------------------------------------");
        for (String str : set1){
            System.out.println("Is "+str+" present in both sets? :"+set2.contains(str));
        }



    }
}
