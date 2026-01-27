package linkedlistexamples;

import java.util.LinkedList;

public class CheckElement {
public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("Ramesh");
    list.add("Rupa");
    list.add("Rupesh");
    list.add("Ravindra");
    list.add("Rajnikant");

    if(list.contains("Sachin")) {
        System.out.println("Thaliva");
    }
    else{
        System.out.println("Not Thaliva");
    }
}
}
