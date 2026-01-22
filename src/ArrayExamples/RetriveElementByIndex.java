package ArrayExamples;
import java.util.*;

public class RetriveElementByIndex {
    public static void main(String[] args) {
        ArrayList<String> list_String = new ArrayList<String>(30);
        list_String.add("Red");
        list_String.add("Blue");
        list_String.add("Green");
        list_String.add("Yellow");
        list_String.add("Purple");

        // Retriving element by index
        String str = list_String.get(2);
        System.out.println("Element at index 2: "+str);


    }
}