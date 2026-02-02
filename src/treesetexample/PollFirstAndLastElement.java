package treesetexample;

import java.util.TreeSet;

import fuctions.RandomNoGenerator;

public class PollFirstAndLastElement {
    public static void main(String[] args) {
        TreeSet <Integer> treeSet = new TreeSet<>();
        for(int i = 0; i<=10;i++){
            treeSet.add(RandomNoGenerator.getRandomNumber(10));
    }
    System.out.println("Original Set : "+treeSet);
    Integer firstElement = treeSet.pollFirst();
    System.out.println("First Element : "+firstElement);
    System.out.println("Set after Polling First Element : "+treeSet);
    Integer secondElement = treeSet.pollLast();
    System.out.println("Second Element : "+secondElement);
    System.out.println("Set after Polling Last Element : "+treeSet);
}
}
