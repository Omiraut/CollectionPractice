package linkedlistexamples;

import java.util.LinkedList;

public class RelpaceElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hope");
        list.add("You");
        list.add("Are");
        list.add("Doing");
        list.add("Well");
        System.out.println("Original List: " + list);
        // Replacing element at index 2
        list.set(2, "Is");
        System.out.println("List after replacing element at index 2: " + list);
    }
}
