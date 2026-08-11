package DSA.ArraysAndArrayList;

import java.util.Arrays;

public class TripletsSum {
    /**
     * ===============================================================
     * Problem:
     * Count the total number of triplets whose sum is equal to target.
     * ===============================================================
     *
     * Brute Force Approach:
     * - Generate every possible triplet using three nested loops.
     * - Check whether the sum of the triplet equals the target.
     * - If yes, increment the count.
     *
     * Why does this work?
     * Every possible combination of three indices is visited exactly once,
     * so no valid triplet is missed.
     *
     * Pattern:
     * Array Traversal
     * Brute Force
     *
     * Algorithm:
     * Step 1:
     * Pick first element using loop i.
     *
     * Step 2:
     * Pick second element using loop j.
     *
     * Step 3:
     * Pick third element using loop k.
     *
     * Step 4:
     * Check whether
     * arr[i] + arr[j] + arr[k] == target.
     *
     * Step 5:
     * If yes, increment count.
     *
     * Time Complexity:
     * O(n³)
     *
     * Space Complexity:
     * O(1)
     *
     * Edge Cases:
     * - Null array
     * - Array size less than 3
     * - Duplicate elements
     * - Negative numbers
     *
     * Interview Follow-up:
     * Can we optimize it to O(n²)?
     */
    public static int countTriplets(int[] arr, int X) {

        if (arr == null || arr.length < 3)
            return 0;

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int K = j + 1; K < arr.length; K++) {
                    if (arr[i] + arr[j] + arr[K] == X) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    /**
     * ===============================================================
     * Problem:
     * Count triplets using Sorting + Two Pointer Technique.
     * ===============================================================
     *
     * Approach:
     * 1. Sort the array.
     * 2. Fix one element.
     * 3. Use two pointers to find the remaining two elements.
     *
     * Intuition:
     * After sorting:
     *
     * If current sum is smaller than target,
     * move left pointer to increase the sum.
     *
     * If current sum is greater than target,
     * move right pointer to decrease the sum.
     *
     * Since the array is sorted,
     * we can eliminate many unnecessary combinations.
     *
     * Pattern:
     * Sorting
     * +
     * Two Pointer
     *
     * Algorithm:
     * Step 1:
     * Sort the array.
     *
     * Step 2:
     * Traverse every element using i.
     *
     * Step 3:
     * Initialize
     * left = i + 1
     * right = last index.
     *
     * Step 4:
     * Calculate current sum.
     *
     * Step 5:
     * If sum == target
     * count++
     * move both pointers.
     *
     * Step 6:
     * If sum < target
     * move left.
     *
     * Step 7:
     * If sum > target
     * move right.
     *
     * Why does this work?
     * Sorting guarantees:
     * - Moving left increases the sum.
     * - Moving right decreases the sum.
     *
     * Time Complexity:
     * Sorting  -> O(n log n)
     * Two Pointer Traversal -> O(n²)
     *
     * Overall:
     * O(n²)
     *
     * Space Complexity:
     * O(1)
     * (Ignoring sorting implementation.)
     *
     * Limitation:
     * This implementation assumes distinct elements.
     * For arrays with duplicates, additional duplicate handling
     * is required to count all valid triplets correctly.
     *
     * Interview Follow-up:
     * How would you modify this to correctly count duplicate triplets?
     */
    public static int countTripletsTwoPointerAppro(int[] arr, int target) {
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    count++;
                    left++;
                    left++;
                }else {
                    right--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 3};
        int target = 12;
        System.out.println(countTriplets(arr, target));
        System.out.println(countTripletsTwoPointerAppro(arr, target));
    }
}
