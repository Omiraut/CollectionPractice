package linkedlistexamples;

import java.util.LinkedList;

public class IndexOfSpecificElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Mango");
        String elementToFind = "Banana";
        int indexOf = list.indexOf(elementToFind);
        System.out.println("Index of" + elementToFind + " is: " + indexOf);
        int lastIndexOf = list.lastIndexOf(elementToFind);
        System.out.println("Last Index of " + elementToFind + " is: " + lastIndexOf);


    }
}
