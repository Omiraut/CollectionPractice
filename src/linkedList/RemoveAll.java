package linkedList;

import java.util.LinkedList;

public class RemoveAll {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Rajat");
        list.add("Komal");
        list.add("Shubham");
        list.add("Ravi");
        list.add("Komal");
        System.out.println("List before removing all");
        System.out.println(list);
        list.clear();
        System.out.println("List after removing all");
        System.out.println(list);
    }
}
