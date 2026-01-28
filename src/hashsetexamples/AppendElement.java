package hashsetexamples;

import java.util.HashSet;
import java.util.Scanner;

public class AppendElement {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        // Adding elements to the HashSet : to add we use object.add() method
        set.add("Kola");
        set.add("Chimpanzee");
        set.add("Rose");
        set.add("Gold");
        set.add("Diamond");
        System.out.println(set);
        // iterate through the elements
        for(String element : set){
            System.out.println(element);
        }

        HashSet<String> newSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you want to add in HashSet:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++){
            String element = sc.next();
            newSet.add(element);
        }
        System.out.println(newSet);

        


    }

}
