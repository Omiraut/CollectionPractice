package treesetexample;

import java.util.TreeSet;

import fuctions.RandomNoGenerator;

public class LessThanN {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i = 0; i<=20;i++){
            treeSet.add(RandomNoGenerator.getRandomNumber(2));
    }
    System.out.println(treeSet);
    Integer n = RandomNoGenerator.getRandomNumber(2)/2+20;

    System.out.println("Number less than "+n+" is : "+treeSet.headSet(n));

    System.out.println("Numbers less than "+n+" are : "+treeSet.floor(n));
}
}
