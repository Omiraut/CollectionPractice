package hashmappractice;

import java.util.HashMap;
import java.util.Set;

public class GetAllKeys {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Orange", 2);
        map.put("Guwawa", 3);
        map.put("coca", 4);
        map.put("String", 5);
        map.put("AXSDC", 6);
        Set<String> KeySet = map.keySet();
        System.out.println("Keys in the HashMap: " + KeySet);
    }
}
