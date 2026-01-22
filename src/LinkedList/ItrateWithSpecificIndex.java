package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ItrateWithSpecificIndex {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Mogra");
        list.add("Lahore");
        list.add("Multan");
        list.add("Faisalabad");
        list.add("Quetta");
        list.add("Karachi");

        Iterator<String> p = list.listIterator(2);

        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
}
