package treemapexamples;

import java.util.TreeMap;

public class SearchKeyInMao {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();        
        treeMap.put(0,"Apple");
        treeMap.put(1,"Orange");
        treeMap.put(2,"PAPAYA");
        treeMap.put(5,"Tarangine");
        treeMap.put(4,"Mango");
        treeMap.put(3,"Pineapple");
        
        System.out.println("Find Key: ");
        Integer key = 10;
        if(treeMap.containsKey(key)){
            System.out.println("Key "+key+" found in TreeMap");
        }
        else{
            System.out.println("Key "+key+" not found in TreeMap");
        }
    }
}
