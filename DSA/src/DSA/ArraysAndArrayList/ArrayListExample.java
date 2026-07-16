package DSA.ArraysAndArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(3);
        list.add(54);
        list.add(3);
        list.add(2);
        list.add(76);
        System.out.println(list);
        list.set(4,99);
        System.out.println(list);
    }

}
