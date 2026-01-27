package linkedlistexamples;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffelElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Rajat");
        list.add("Komal");
        list.add("Shubham");
        list.add("Ravi");
        list.add("Komal");
        int i = 0;
        for(String str : list){
            
            System.out.println("element of index "+i+" is "+str);
            i++;
        }
        i = 0;
        Collections.shuffle(list);
        System.out.println("Shuffled List");
        for(String str : list){
           System.out.println("element of index "+i+" is "+str);
            i++;
        }
    
    }
}
