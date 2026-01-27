package linkedlistexamples;

import java.util.LinkedList;

public class AddAtSpecificPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Lily");
        list.add("Lotus");
        list.add("Rose");
        list.add("Tulip");
        list.add("Jasmine");
        System.out.println("List before adding at specific position");

        System.out.println(list);
        System.out.println("List after adding at specific position");
        list.add(2,"Orchid");
        System.out.println(list);
    }
}
