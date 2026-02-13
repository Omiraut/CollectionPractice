package treemapexamples;

import java.util.Map;
import java.util.TreeMap;

public class CopingTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(0,"Apple");
        treeMap.put(1,"Orange");
        treeMap.put(2,"PAPAYA");
        treeMap.put(5,"Tarangine");
        treeMap.put(4,"Mango");
        treeMap.put(3,"Pineapple");
        System.out.println("TreeMap: "+treeMap);
        TreeMap<Integer,String> copiedTreeMap = new TreeMap<>();
        copiedTreeMap.put(12,"Watermalen");
        copiedTreeMap.put(13,"Somras");
        System.out.println("New Treemap before coping: "+copiedTreeMap);
        copiedTreeMap.putAll(treeMap);
        System.out.println("New Treemap after coping: "+copiedTreeMap);
        for(Map.Entry<Integer,String> entry : copiedTreeMap.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
    }
}
