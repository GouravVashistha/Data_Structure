package DSA.ArraysAndArrayList;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArrayUsingTem(int[] arr) {
        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    // rever without using new variable
    static void swapInArray(int[] arr, int i,int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static int[] reverseArraywithoutusingNewVariable(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swapInArray(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(reverseArrayUsingTem(arr)));
        System.out.println(Arrays.toString(reverseArraywithoutusingNewVariable(arr)));

    }
}
