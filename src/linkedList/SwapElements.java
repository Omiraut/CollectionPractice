package linkedList;

// import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class SwapElements {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();

        list.add("Newl");
        list.add("York");
        list.add("City");
        System.out.println(list);

        Collections.swap(list,1, 2);
        System.out.println(list);
    }
}
