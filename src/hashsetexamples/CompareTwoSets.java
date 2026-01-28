package hashsetexamples;

import java.util.HashSet;
import java.util.Scanner;

public class CompareTwoSets {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        // Create and empty hash set to store common elements
        HashSet<String> commonElements = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.println("Enter " + n + " elements for the first HashSet:");
        for(int i=0;i<n;i++){
            String element = sc.nextLine();
            set1.add(element);
        }
        System.out.println("Enter " + n + " elements for the second HashSet:");
        for(int i=0;i<n;i++){
            String element = sc.nextLine();
            set2.add(element);
        }
        System.out.println("First HashSet elements:");
        for (String str : set1){
            System.out.println(str);        
        }
        System.out.println("Second HashSet elements:");
        for (String str : set2){
            System.out.println(str);
        }
        // Compare two hash sets
        
        System.out.println("----------------------------------------");
        for(String str :set1){
            System.out.println("Is \""+str+"\" present in both sets? : "+set2.contains(str) );
            if(set2.contains(str)){
             commonElements.add(str);
            }
        }

        System.out.println("Common elements in both sets: " + commonElements);
        sc.close();
    }}
