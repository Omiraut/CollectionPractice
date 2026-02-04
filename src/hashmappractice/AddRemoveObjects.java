package hashmappractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddRemoveObjects {
    
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        AddRemoveObjects obj = new AddRemoveObjects();
        map = (HashMap<Integer, String>) obj.addObjecttoMap(map,5);
        // System.out.println("Hash Map after adding objects: "+map);     
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
        map = (HashMap<Integer, String>)  obj.removeObjectFromMap(map,2);
        System.out.println("Hash Map after removing object with key 2: "+map);
    }

    public Map<Integer, String> addObjecttoMap(HashMap<Integer, String> map,int value){ 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add values to hash map");
        for(int i =0; i<value; i++){
            Integer key = i;
            map.put(key,scanner.nextLine());
        }
        scanner.close();
        return map;       
    }
    public Map<Integer, String> removeObjectFromMap(HashMap<Integer, String> map ,Integer key){

        map.remove(key);
        return map;
    }
}