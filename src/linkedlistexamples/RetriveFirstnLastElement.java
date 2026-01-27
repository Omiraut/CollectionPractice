package linkedlistexamples;

import java.util.LinkedList;

public class RetriveFirstnLastElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("kanchana");
        list.add("Kanhchana 2");
        list.add("Kanchana 3");
        System.out.println("Original List: " + list);
        // Retrieving first element
        String firstElement = list.getFirst();
        System.out.println("First Element: " + firstElement);
        // diff between getFirst() and peekFirst() : if the list is empty, getFirst() throws an exception, while peekFirst() returns null.
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());



    }
}
