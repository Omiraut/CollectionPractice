package treemapexamples;

import java.util.Map;
import java.util.TreeMap;

public class AddElements {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(0,"Apple");
        treeMap.put(1,"Orange");
        treeMap.put(2,"PAPAYA");
        treeMap.put(5,"Tarangine");
        treeMap.put(4,"Mango");
        treeMap.put(3,"Pineapple");
        System.out.println("TreeMap: "+treeMap);
        for(Integer key : treeMap.keySet()){
            System.out.println("Key: "+key+" Value: "+treeMap.get(key));
        }
        System.out.println("Using Entry Set");
        
        for(Map.Entry<Integer,String> entry : treeMap.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
        System.out.println("checkin Size of TreeMap: "+treeMap.size());

    }
}
