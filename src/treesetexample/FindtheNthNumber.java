package treesetexample;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class FindtheNthNumber {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        TreeSet<Integer> treeHeadSet;
        for(int i = 0; i<=20;i++){
            treeSet.add(i);
        }
        System.out.println(treeSet);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N to find the Nth smallest number: ");
        int n = scanner.nextInt();

        // find no less than given no. n
        treeHeadSet = (TreeSet<Integer>) treeSet.headSet(n);
        Iterator iterator;
        iterator = treeHeadSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+" is less than "+n);
        }

    }
}
