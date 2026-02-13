package treemapexamples;

import java.util.TreeMap;

public class DeleteAllElement {
    public static void main(String[] args) {
        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("C1","Apple");
        treeMap.put("C2","Orange");
        treeMap.put("C3","PAPAYA");
        treeMap.put("C4","Tarangine");
        treeMap.put("C5","Mango");
        treeMap.put("C6","Pineapple");
        treeMap.put("C7","Watermalen");
        System.out.println("TreeMap: "+treeMap);
        treeMap.clear();
        System.out.println("TreeMap: "+treeMap);
    }
}
