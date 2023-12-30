import java.util.Collections;

import list.MyArrayList;
import list.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        list.add(3);
        list.add(1);
        list.add(10);
        System.out.println(list.get(1));
        list.delete(1);
        System.out.println(list);
        System.out.println(list.size());
    }
    
}