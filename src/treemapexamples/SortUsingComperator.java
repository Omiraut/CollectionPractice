package treemapexamples;
import java.util.Map;
import java.util.TreeMap;
import fuctions.SortKey;

public class SortUsingComperator {
    public static void main(String[] args) {
        
        TreeMap<String,String> treeMap = new TreeMap<String,String>(new SortKey());
        treeMap.put("C7","Watermalen");
        treeMap.put("C1","Apple");
        treeMap.put("C3","PAPAYA");
        treeMap.put("C4","Tarangine");
        treeMap.put("C2","Orange");
        treeMap.put("C5","Mango");
        treeMap.put("C6","Pineapple");
        
       for(Map.Entry<String, String> entry : treeMap.entrySet()){
           System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
       }

    }
    
}

