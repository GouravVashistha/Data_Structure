package DSA.ArraysAndArrayList;

import java.util.Arrays;

public class BasicTraversalArrayCodingQuestions {

    /**
     * ============================================================
     * Problem:
     * Find the smallest element in an array.
     * ============================================================
     *
     * Approach:
     * - Assume the first element is the smallest.
     * - Traverse the complete array.
     * - Whenever a smaller element is found, update the smallest value.
     *
     * Intuition:
     * Every element gets exactly one chance to become the smallest.
     *
     * Algorithm:
     * 1. Initialize smallest = arr[0].
     * 2. Traverse the array.
     * 3. Compare current element with smallest.
     * 4. Update if required.
     *
     * Time Complexity:
     * O(n)
     *
     * Space Complexity:
     * O(1)
     *
     * Edge Cases:
     * - Empty array
     * - Negative numbers
     * - Duplicate minimum values
     */
    static void smallestElement() {

        int[] arr = {3, 5, 2, 9, 1};

        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest Element : " + smallest);
    }

    /**
     * ============================================================
     * Problem:
     * Find the second largest DISTINCT element without sorting.
     * ============================================================
     *
     * Approach:
     * Maintain two variables:
     * 1. largest
     * 2. secondLargest
     *
     * Traverse once and keep updating both values.
     *
     * Better than sorting because sorting takes O(n log n).
     *
     * Time Complexity:
     * O(n)
     *
     * Space Complexity:
     * O(1)
     *
     * Edge Cases:
     * - Array size < 2
     * - Duplicate largest values
     * - All elements same
     * - Negative values
     */
    static int secondLargestElementOptimal() {

        int[] arr = {3, 5, 2, 9, 1};

        if (arr == null || arr.length < 2)
            return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {

                secondLargest = largest;
                largest = num;

            } else if (num > secondLargest && num != largest) {

                secondLargest = num;
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    /**
     * ============================================================
     * Problem:
     * Find second largest element using sorting.
     * ============================================================
     *
     * Brute Force:
     * Sort the array.
     * Largest becomes last element.
     * Traverse backwards until a different value is found.
     *
     * Time Complexity:
     * O(n log n)
     *
     * Space Complexity:
     * O(1)
     *
     * Better Approach:
     * Use one traversal (previous method).
     */
    static void secondLargestElementSorting() {

        int[] arr = {3, 5, 2, 9, 1};

        Arrays.sort(arr);

        int largest = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] != largest) {

                System.out.println("Second Largest : " + arr[i]);
                return;
            }
        }

        System.out.println("Second Largest doesn't exist.");
    }

    /**
     * ============================================================
     * Problem:
     * Find second smallest DISTINCT element.
     * ============================================================
     *
     * Approach:
     * Maintain:
     * firstSmallest
     * secondSmallest
     *
     * Traverse once.
     *
     * Time Complexity:
     * O(n)
     *
     * Space Complexity:
     * O(1)
     *
     * Edge Cases:
     * - Duplicate minimum values
     * - Array length < 2
     * - Negative values
     */
    static int secondSmallestElement() {

        int[] arr = {3, 5, 2, 9, 1};

        if (arr == null || arr.length < 2)
            return -1;

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num < firstSmallest) {

                secondSmallest = firstSmallest;
                firstSmallest = num;

            } else if (num < secondSmallest && num != firstSmallest) {

                secondSmallest = num;
            }
        }

        return secondSmallest == Integer.MAX_VALUE ? -1 : secondSmallest;
    }

    /**
     * ============================================================
     * Problem:
     * Count even and odd numbers.
     * ============================================================
     *
     * Approach:
     * Traverse array once.
     * Check remainder using modulo operator.
     *
     * num % 2 == 0
     * -> Even
     *
     * else
     * -> Odd
     *
     * Time Complexity:
     * O(n)
     *
     * Space Complexity:
     * O(1)
     *
     * Edge Cases:
     * - Zero is even.
     * - Negative numbers.
     */
    static void evenAndOdd() {

        int[] input = {1, 2, 3, 4, 5};

        int even = 0;
        int odd = 0;

        for (int num : input) {

            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Count : " + even);
        System.out.println("Odd Count  : " + odd);
    }

    /**
     * ============================================================
     * Problem:
     * Find sum of all array elements.
     * ============================================================
     *
     * Approach:
     * Initialize sum = 0.
     * Traverse the array.
     * Keep adding current element.
     *
     * Time Complexity:
     * O(n)
     *
     * Space Complexity:
     * O(1)
     *
     * Edge Cases:
     * - Empty array
     * - Negative values
     * - Integer overflow
     */
    static void sumOfArray() {

        int[] input = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int num : input) {
            sum += num;
        }

        System.out.println("Sum : " + sum);
    }

    public static void main(String[] args) {

        smallestElement();

        System.out.println("Second Largest (Optimal): "
                + secondLargestElementOptimal());

        secondLargestElementSorting();

        System.out.println("Second Smallest: "
                + secondSmallestElement());

        evenAndOdd();

        sumOfArray();
    }
}