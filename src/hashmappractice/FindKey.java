package hashmappractice;

import java.util.HashMap;

public class FindKey
 {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Orange", 2);
        map.put("Guwawa", 3);
        map.put("coca", 4);
        map.put("String", 5);
        map.put("AXSDC", 6);
        System.out.println("HashMap: " + map);
        // Find key by key
        String keyToFind = "coca";
        if(map.containsKey(keyToFind)){
            System.out.println("Value for key "+ keyToFind +" is : "+map.get(keyToFind));
        }
        else{
            System.out.println("Key not found: " + keyToFind);
        }
        // Find key by value
        int valueToFind = 3;
        if(map.containsValue(valueToFind)){
            System.out.println("Value "+ valueToFind +" found in the HashMap.");
        }
        else{
            System.out.println("Value not found: " + valueToFind);
        }
    }
}
