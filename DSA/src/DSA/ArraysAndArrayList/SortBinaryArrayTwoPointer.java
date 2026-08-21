package DSA.ArraysAndArrayList;

import java.util.Arrays;

public class SortBinaryArrayTwoPointer {

//    Recommendation
//    Easy to understand: sortUsingCounting()
//    Interview favorite: sortUsingTwoPointers()
//    Concise counting version: sortUsingCountingSingleLoop()
//
//    Complexity = O(n)  Space Complexity = O(1)


    // Approach 1: Two Pointer
    public static int[] sortUsingTwoPointers(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return arr;
    }

    // Approach 2: Counting (Two Loops)
    public static int[] sortUsingCounting(int[] arr) {

        int zeroCount = 0;

        // Count number of zeros
        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            }
        }

        // Fill zeros
        for (int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
        }

        // Fill ones
        for (int i = zeroCount; i < arr.length; i++) {
            arr[i] = 1;
        }

        return arr;
    }

    // Approach 3: Counting (Single Loop)
    public static int[] sortUsingCountingSingleLoop(int[] arr) {

        int zeroCount = 0;

        // Count zeros
        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            }
        }

        // Fill array in one loop
        for (int i = 0; i < arr.length; i++) {

            if (i < zeroCount) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr2 = arr1.clone();
        int[] arr3 = arr1.clone();

        System.out.println("Two Pointer:");
        System.out.println(Arrays.toString(sortUsingTwoPointers(arr1)));

        System.out.println("\nCounting:");
        System.out.println(Arrays.toString(sortUsingCounting(arr2)));

        System.out.println("\nCounting (Single Loop):");
        System.out.println(Arrays.toString(sortUsingCountingSingleLoop(arr3)));
    }
}