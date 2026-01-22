package LinkedList;

import java.util.LinkedList;

public class PrintPositionWithElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Rajat");
        list.add("Komal");
        list.add("Shubham");
        list.add("Ravi");
        list.add("Komal");

        for(int i = 0 ;i<list.size();i++){
            System.out.println("Item on index "+i+" is "+list.get(i));
        }
        
    }
}
