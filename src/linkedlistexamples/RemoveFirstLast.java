package linkedlistexamples;

import java.util.LinkedList;

public class RemoveFirstLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Rajat");
        list.add("Komal");
        list.add("Shubham");
        list.add("Ravi");
        list.add("Komal");
        System.out.println(list);
        Object FirstOb = list.removeFirst();
        System.out.println("First Removed Element :  "+FirstOb);
        Object LastOb = list.removeLast();
        System.out.println("Last Removed Object is : "+LastOb);
    }
}
