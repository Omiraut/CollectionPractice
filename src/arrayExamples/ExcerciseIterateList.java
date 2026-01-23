package arrayExamples;
import java.util.ArrayList;

public class ExcerciseIterateList {
    public static void main(String[] args) {
        ArrayList<String> list_String = new ArrayList<String>();
        list_String.add("Red");
        list_String.add("Blue");
        list_String.add("Green");
        list_String.add("Yellow");
        list_String.add("Purple");
        for(String srt : list_String){
            System.out.println(srt);
        }
    }
}
