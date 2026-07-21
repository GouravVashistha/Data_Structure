package DSA.ArraysAndArrayList;

import java.util.ArrayList;

public class SearchElementInTheArray {
    // Search the given element x in the array. if present then return the index else return -1 ;
    // find first occurrence
    static int search(int x) {
        int[] arr = {1, 3, 5, 7, 5, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    static ArrayList<Integer> searchAll(int x){
        int[] arr = {1, 3, 5, 7, 5, 3};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(search(5));
        System.out.println(searchAll(5));
    }
}
