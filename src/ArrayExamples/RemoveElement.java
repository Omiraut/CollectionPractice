package ArrayExamples;
import java.util.*;
public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<String> list_String = new ArrayList<String>();
        list_String.add("Red");
        list_String.add("Blue");
        list_String.add("Green");
        list_String.add("Yellow");
        list_String.add("Purple");

        for(String str : list_String){
            System.out.println(str);
        }

        System.out.println("--------------------");
        // Removing element
        list_String.remove(2);
        for(String str : list_String){
            System.out.println(str);
        }
    }
}
