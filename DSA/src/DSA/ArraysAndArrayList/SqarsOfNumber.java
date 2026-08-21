package DSA.ArraysAndArrayList;

import java.util.Arrays;

import static java.lang.Math.abs;

public class SqarsOfNumber {
    // Given an innteger array "a" sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order;

    public static int[] sortedSquaresBruteForce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            arr[i] = num * num;
        }
        Arrays.sort(arr);
        return arr;
    }

    public static int[] sortedSquaresTwoPointers(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int index = arr.length - 1;
        int[] ans = new int[arr.length];
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[index--] = arr[left] * arr[left];
                left++;

            } else {
                ans[index--] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-10, -3, -2, 1, 4, 5};
        int[] arr1 = {2, 3, 4, 7, 10};
//        System.out.println(Arrays.toString(sortedSquaresBruteForce(arr)));
//        System.out.println(Arrays.toString(sortedSquaresBruteForce(arr1)));
        System.out.println(Arrays.toString(sortedSquaresTwoPointers(arr)));
    }
}
