import java.util.Collections;
import java.util.LinkedList;

import list.MyArrayList;
import list.MyList;

public class Main {
    public static void main(String[] args) {
        // MyList<Integer> list = new MyArrayList<>();
        // list.add(3);
        // list.add(1);
        // list.add(10);
        // System.out.println(list.get(1));
        // list.delete(1);
        // System.out.println(list);
        // System.out.println(list.size());


        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addFirst(3);
        list2.addLast(1);
        System.out.println(list2);
        System.out.println(list2.size());
        list2.addLast(8);
        list2.addLast(5);
        System.out.println(list2);
        System.out.println(list2.size());
        list2.addFirst(1);
        System.out.println(list2);
        System.out.println(list2.size());
        list2.remove(2);
        System.out.println(list2);
        
    }
}