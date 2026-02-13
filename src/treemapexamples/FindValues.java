package treemapexamples;

import java.util.ArrayList;
import java.util.TreeMap;

public class FindValues {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(0,"Apple");
        treeMap.put(1,"Orange");
        treeMap.put(2,"PAPAYA");
        treeMap.put(5,"Tarangine");
        treeMap.put(4,"Mango");
        treeMap.put(3,"Pineapple");
        System.out.println("TreeMap: "+treeMap);
        
        //  finding Multiple Values in Treemap
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Apple");
        arr.add("Lichi");
        arr.add("Pineapple");

        for(int i = 0;i<arr.size();i++){
            if(treeMap.containsValue(arr.get(i))){
                System.out.println("Value "+arr.get(i)+" found in TreeMap");
            }
            else{
                System.out.println("Value "+arr.get(i)+" not found in TreeMap");
            }
        }

    }
    }
