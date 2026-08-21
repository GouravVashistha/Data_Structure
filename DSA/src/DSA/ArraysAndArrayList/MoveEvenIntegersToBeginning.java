package DSA.ArraysAndArrayList;

import java.util.Arrays;

public class MoveEvenIntegersToBeginning {

    /**
     * Moves all even numbers to the beginning of the array
     * followed by all odd numbers.
     *
     * Approach 1: Multiple if statements
     *
     * Time Complexity : O(n)
     * Space Complexity: O(1)
     */
    public static int[] moveEvenNumbersToFrontV1(int[] numbers) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            // If left element is odd and right element is even,
            // swap both elements.
            if (numbers[left] % 2 != 0 && numbers[right] % 2 == 0) {
                swap(numbers, left, right);
                left++;
                right--;
            }

            // Move left pointer if current element is even.
            if (numbers[left] % 2 == 0) {
                left++;
            }

            // Move right pointer if current element is odd.
            if (numbers[right] % 2 != 0) {
                right--;
            }
        }

        return numbers;
    }
    /**
     * Moves all even numbers to the beginning of the array
     * followed by all odd numbers.
     *
     * Approach 2: Two Pointer (Recommended)
     *
     * Time Complexity : O(n)
     * Space Complexity: O(1)
     */
    public static int[] moveEvenNumbersToFrontV2(int[] numbers) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            // Left element is already even.
            if (numbers[left] % 2 == 0) {
                left++;
            }

            // Right element is already odd.
            else if (numbers[right] % 2 != 0) {
                right--;
            }

            // Left is odd and right is even.
            // Swap both elements.
            else {
                swap(numbers, left, right);
                left++;
                right--;
            }
        }

        return numbers;
    }


    /**
     * Swaps two array elements.
     */
    private static void swap(int[] numbers, int firstIndex, int secondIndex) {
        int temp = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = temp;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(moveEvenNumbersToFrontV1(numbers)));
        System.out.println(Arrays.toString(moveEvenNumbersToFrontV2(numbers)));
    }
}