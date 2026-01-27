package arraylistexamples;
import java.util.ArrayList;
public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Blue");
        listString.add("Green");
        listString.add("Yellow");
        listString.add("Purple");

        // Searching element
        boolean isPresent = listString.contains("Yellow");
        System.out.println("Is Yellow present: "+isPresent);
    }
}
