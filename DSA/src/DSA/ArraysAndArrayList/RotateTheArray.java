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

    // without using extra space

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void revers(int[] arr, int i,int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static int[] rotateAnotherWay(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        revers(arr, 0, n - k - 1);
        revers(arr, n - k, n - 1);
        revers(arr, 0, n - 1);


        return arr;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int steps = 2;
//        System.out.println(Arrays.toString(rotate(arr, steps)));
        System.out.println(Arrays.toString(rotateAnotherWay(arr, steps)));
    }
}
