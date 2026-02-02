package treesetexample;

import java.util.TreeSet;

import fuctions.RandomNoGenerator;

public class HigherThanNth {

public static void main(String[] args) {
    
    // int n = RandomNoGenerator.getRandomNumber(2);
    // System.out.println("Generated Random Number: " + n);

    TreeSet<Integer> treeSet = new TreeSet<>();
    for(int i = 0; i<=10;i++){
        treeSet.add(RandomNoGenerator.getRandomNumber(2));
    }
    for(Integer num : treeSet){
        System.out.println(num);
    }
    Integer n = treeSet.last()/2;
    Integer o = n+10;
    
    System.out.println("Numbers higher than "+n+" are:"+ treeSet.ceiling(n));
    System.out.println("Numbers higher than "+o+" are:"+ treeSet.ceiling(o));
    
}

    

}
