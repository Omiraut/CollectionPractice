package arrayExamples;
import java.util.*;

public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(40);
        list.add("Chart");
        list.add("Table");
        list.add("Graph");
        list.add("Map");
        list.add("Tree");
        System.out.println("List before Update");
        for(String str : list){
            System.out.println(str);
        }
        // Updating element


        list.set(4,"Gorrila");
        System.out.println("List after Update");
        for(String str : list){
            System.out.println(str);
        }   
    }
}
