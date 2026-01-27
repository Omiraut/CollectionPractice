package linkedlistexamples;

import java.util.LinkedList;

public class AddFristAndLastPosition {
    public static void main(String[] args) {
        LinkedList<String> s_list = new LinkedList<String>();
        s_list.add("Red");
        s_list.add("Gray");
        s_list.add("Purple");

        System.out.println("List Befor adding first and last");
        System.out.println(s_list);

        s_list.addFirst("White");
        s_list.addLast("Black");
        System.out.println("List After adding first and last");
        System.out.println(s_list);
    }
}
