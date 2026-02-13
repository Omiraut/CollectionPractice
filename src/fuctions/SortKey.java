package fuctions;

import java.util.Comparator;

public class SortKey implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        System.out.println("Called compare method");
        return o1.compareTo(o2);
    }
        
    }
