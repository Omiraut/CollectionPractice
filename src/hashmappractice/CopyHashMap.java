package hashmappractice;

import java.util.HashMap;

public class CopyHashMap {
    public static void main(String[] args) {
     HashMap<Integer, String> originalMap = new HashMap<>();
     originalMap.put(1, "One");
     originalMap.put(2, "Two");
     originalMap.put(3, "Three");
    HashMap<Integer, String> copiedMap = new HashMap<>();
        copiedMap.put(1, "New");
        copiedMap.put(4, "Four");
        copiedMap.put(5, "Five");
        copiedMap.put(6, "Six");
    copiedMap.putAll(originalMap);
    System.out.println("Copied HashMap: " + copiedMap);

    // Clear hashmap
    copiedMap.clear();
    System.out.println("Cleared HashMap: " + copiedMap);

    // check if map is empty
    if(copiedMap.isEmpty()){
        System.out.println("HashMap is empty");

    }
    else{
        System.out.println("HashMap is not empty");
    }
    }

    
}
