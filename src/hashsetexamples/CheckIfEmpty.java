package hashsetexamples;

import java.util.HashSet;
import java.util.Scanner;

public class CheckIfEmpty {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        // check if HashSet is empty
        System.out.println("Is Empty : "+set.isEmpty());
        System.out.println("Size of hashset is : "+set.size());
        System.out.println("Adding Elements : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter element "+(i+1));
            set.add(sc.nextLine());
        }
        System.out.println("After adding elements check if Empty : "+set.isEmpty());
        System.out.println("Size of Hashset is : "+set.size());
        sc.close();
        for(String str : set){
            System.out.println(str);
        }
        // clear the HashSet
        set.clear();
        System.out.println("After clearing HashSet");
        System.out.println("Is Empty : "+set.isEmpty());
        System.out.println("Size of hashset is : "+set.size());
    }
}
