package hashsetexamples;

import java.util.HashSet;

public class CheckSize {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        // check default size of HashSet
        System.out.println("Default size of hashset is : "+set.size());
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        for(String str : set){
            System.out.println(str);
        }
        // to get size of HashSet
        System.out.println("Size of hashset is : "+set.size());
    }
}
