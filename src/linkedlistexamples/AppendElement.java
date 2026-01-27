package linkedlistexamples;

import java.util.LinkedList;

public class AppendElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Rajat");
        list.add("Komal");
        list.add("Shubham");

        // Adding element to the end of the list
        // .add will add element at last
        list.add("Ravi");
        System.out.println(list);
        for(String str : list){
            System.out.println(str);
        }
    }
}
