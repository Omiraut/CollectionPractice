package hashsetexamples;

import java.util.HashSet;

public class CreateClone {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Yellow");
        System.out.println("Original HashSet:");
        for(String str : set){
            System.out.println(str);
        }
        HashSet<String> clonedSet = (HashSet) set.clone();
        System.out.println("Cloned HashSet:");
        for(String str :clonedSet){
            System.out.println(str);
        }

        set.add("null");
        System.out.println("After adding 'null' to original HashSet:");
        System.out.println("Original HashSet:");
        for(String str : set){
            System.out.println(str);
        }
        System.out.println("Cloned HashSet remains unchanged:");
        for (String srt :clonedSet){
            System.out.println(srt);
        }
    }
}