package ArrayExamples;
import java.util.ArrayList;
public class PrintElementUsingPosition {
    public static void main(String[] args) {
        ArrayList<String> list_String = new ArrayList<String>();
        list_String.add("Red");
        list_String.add("Blue");
        list_String.add("Green");
        list_String.add("Yellow");
        list_String.add("Purple");
        ArrayList<String> new_String = new ArrayList<String>();
        System.out.println("in below loop we have printed using for each loop");
        for(String str : list_String){
            System.out.println(str);
        }
        System.out.println("In below loop we have printed using for loop and index");
        for(int i = 0 ; i<list_String.size();i++){
            System.out.println(list_String.get(i));
        }
        System.out.println("In below loop we have printed using for loop and reverse index");
        for(int i = list_String.size()-1 ; i>=0;i--){
            System.out.println(list_String.get(i));
            new_String.add(list_String.get(i));

        }

        System.out.println("we have stored orignnal arraylist in new arraylist in reversed order");
        for(String str : new_String){
            System.out.println(str);
        }

    }
}
