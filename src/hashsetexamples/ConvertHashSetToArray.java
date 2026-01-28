package hashsetexamples;

import java.util.HashSet;

public class ConvertHashSetToArray {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("JavaScript");
        System.out.println("HashSet elements:");
        for (String str : set){
            System.out.println(str);
        }

        // Convert HashSet to Array
        String[] array = new String[set.size()];
        set.toArray(array);
        System.out.println("Set converted to Array:");
        for(String str : array){
        System.out.println(str);
        }


    }
}
