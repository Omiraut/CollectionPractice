package linkedlistexamples;

import java.util.LinkedList;

public class IterateElement {

    static void printList(LinkedList<String> list, int index){
        if(index == list.size()){
            return;
        }
        System.out.println("Item on index "+index+" is "+list.get(index));
        printList(list, index+1);
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Rajat");
        list.add("Komal");
        list.add("Shubham");
        list.add("Ravi");
        list.add("Komal");
        for(String str : list){
            System.out.println(str);
        }

            // for(int i = 0 ; i<list.size();i++){
            //     System.out.println("Item on index "+i+" is "+list.get(i));
            // }
            printList(list, 0);
    }
}
