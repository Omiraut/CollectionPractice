package arraylistexamples;
import java.util.*;
public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list_String = new ArrayList<String>();
        list_String.add("Red");
        list_String.add("Blue");
        list_String.add("Green");
        list_String.add("Yellow");
        list_String.add("Purple");
        System.out.println(list_String);
        
        ArrayList<String> new_String = new ArrayList<String>();
        new_String.add("ABC");
        new_String.add("XYZ");
        new_String.add("PQR");
        new_String.add("LMN");
        new_String.add("OPQ");
        System.out.println(new_String);
        
        // Copying list_String to new_String
        Collections.copy(list_String, new_String);
        System.out.println(list_String);
        
        
    }
}
