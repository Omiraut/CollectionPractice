package arraylistexamples;
import java.util.*;

public class InsertAtFirstPosition {
    public static void main(String[] args) {
        ArrayList<String> list_String = new ArrayList<String>();
        list_String.add("Red");
        list_String.add("Blue");
        list_String.add("Green");
        list_String.add("Yellow");
        list_String.add("Purple");

        // Here we will insert value at 1st position
        list_String.add(0,"Pink");

        for(String str : list_String){
            System.out.println(str);
        }
    }
}
