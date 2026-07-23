package DSA.ArraysAndArrayList;

import java.util.Arrays;

public class ArrayRefrenceCodingQuestion {

    // Count the number of occurrences of a particular element X;

    static void count_Occurrences(int x) {
        int[] arr = {1, 2, 2, 3, 2};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println(count);

    }

    // Find the Last occurrence of an element x in a given array

    static void Last_occurrence(int x) {
        int[] arr = {1, 2, 5, 2, 5, 3};
        int last_occ = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                last_occ = i;
            }
        }
        System.out.println(last_occ);
    }

    // Count the number of element strictly greater than value X;

    static void strictly_greater(int x) {
        int[] arr = {1, 5, 2, 8, 3, 9};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        System.out.println(count);
    }

    // Check Given array is sorted or not

    static void sorted() {
        int[] arr = {1, 2, 2, 4, 5};

        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }

    static int[] smallestAndLargest(int[] arr){
        Arrays.sort(arr);
        int[] ans= {arr[0],arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {

//        count_Occurrences(2);
//        Last_occurrence(5);
//        strictly_greater(5);
//        sorted();
        int[] arr = {1, 5, 2, 8, 3, 9};
        int[] ans = smallestAndLargest(arr);
        System.out.println(Arrays.toString(ans));
    }

}
