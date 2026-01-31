package treesetexample;

import java.util.TreeSet;

public class FetchFirstAndLast {
    public static void main(String[] args) {
        
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Green");
        treeSet.add("Yellow");
        treeSet.add("Purple");
        treeSet.add("Orange");
        treeSet.add("Pink");
        System.out.println("Printing TreeSet:");
        for(String color : treeSet){
            System.out.println(color);
        }
        System.out.println("Printing First and Last Element:");
        System.out.println("First Element: "+treeSet.first() +" \nLast Element : "+treeSet.last());
    }
}
