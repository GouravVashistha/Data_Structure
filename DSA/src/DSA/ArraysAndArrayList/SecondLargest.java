package DSA.ArraysAndArrayList;

public class SecondLargest {
    // Find the second largest element in the give array.


    /**
     * ===============================================================
     * Problem:
     * Find the second largest DISTINCT element in an array.
     * ===============================================================
     *
     * Approach:
     * - Maintain two variables:
     *      1. firstLargest
     *      2. secondLargest
     * - Traverse the array only once.
     * - If a new largest element is found:
     *      Move current largest to secondLargest,
     *      then update firstLargest.
     * - Otherwise, if current element lies between
     *      firstLargest and secondLargest,
     *      update secondLargest.
     *
     * Time Complexity:
     * O(n)
     *
     * Space Complexity:
     * O(1)
     */
    public static int secondLargestElement(int[] arr) {

        int secontlarget = Integer.MIN_VALUE;
        int firstLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secontlarget = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secontlarget && arr[i] != firstLargest) {
                secontlarget = arr[i];
            }
        }

        return secontlarget;
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 9, 6, 9, 5, 8};
        System.out.println(secondLargestElement(arr));
    }
}
