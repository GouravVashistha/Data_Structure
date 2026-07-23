package DSA.ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRefrence {
    static  void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("original array");
        printArr(arr);
        int[] arr_2 = arr;
        System.out.println("copyed  array");
        printArr(arr_2);

        arr[0] = 0;
        arr[1] = 0;
        System.out.println("original array after change");
        printArr(arr);
        System.out.println("copyed  array after changes");
        printArr(arr_2);

        /*
        Output:-
                original array
                1 2 3 4 5
                copyed  array
                1 2 3 4 5
                original array after change
                0 0 3 4 5
                copyed  array after changes
                0 0 3 4 5
         */

        
    }
}
