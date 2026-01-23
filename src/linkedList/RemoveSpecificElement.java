package linkedList;

import java.util.LinkedList;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Rajat");
        list.add("Komal");
        list.add("Shubham");
        list.add("Ravi");
        list.add("Komal");

        System.out.println("Removing using index");
        String value = list.remove(1);
        System.out.println(list);
        System.out.println("Element of value "+value+" is been removed");
        boolean bool = list.remove("Rajat");
        System.out.println("Is Rajat Removed from List "+ bool);
        System.out.println(list);
        System.out.println(list.size());
    }
}
