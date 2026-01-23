package linkedList;

import java.util.LinkedList;

public class AddOnSpecificPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Tiffin");
        list.add("Breakfast");
        list.add("Lunch");
        list.add("Dinner");

        System.out.println(list);

        // Adding element on specific position
        list.add(2,"Snacks");
        System.out.println(list);

    }
}
