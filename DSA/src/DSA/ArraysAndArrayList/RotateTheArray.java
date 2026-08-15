package DSA.ArraysAndArrayList;

import java.util.Arrays;

public class RotateTheArray {

//      Rotate the give array "a" by k steps, where k is  non-negative
//      Note: k can be greater than n as well\

    public static int[] rotate(int[] arr, int steps) {
        int n = arr.length;
//        System.out.println(n);
        int[] ans = new int[n];
        int k = steps % n;
        int index = 0;
        for (int i = n - k; i < n; i++) {
            ans[index++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[index++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int steps = 2;
        System.out.println(Arrays.toString(rotate(arr, steps)));
    }
}
