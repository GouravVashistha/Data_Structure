package DSA.ArraysAndArrayList;

import java.util.Arrays;

public class BasicTraversalArrayCodingQuestions {
    //Find the smallest element in an array.
    static void smallestElement() {
        int[] arr = {3, 5, 2, 9, 1};
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }

    //  Find the second largest element.
    static int secondLargestElementAnotherWay() {
        int[] arr = {3, 5, 2, 9, 1};
        if (arr == null || arr.length < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > largest && arr[i] != largest) {
                secondLargest = largest;
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;

    }

    static void secondLargestElement() {
        int[] arr = {3, 5, 2, 9, 1};
        Arrays.sort(arr);
        int larget = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != larget) {
                System.out.println(arr[i]);
                break;
            }
        }
    }

    // Find the second smallest element.

    static int secondSmallestElement() {
        int[] arr = {3, 5, 2, 9, 1};
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            } else if (arr[i] < firstSmallest && arr[i] != firstSmallest) {
                secondSmallest = secondSmallest;
            }
        }

        return secondSmallest > Integer.MAX_VALUE ? -1 : secondSmallest;
    }

    //    Count even and odd numbers in an array.
    static void evenAndOdd() {
        int[] input = {1, 2, 3, 4, 5};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);
    }

//    Calculate the sum of all elements.

    static void sumOfArray() {
        int[] input = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
//        smallestElement();
//        secondLargestElement();
//        System.out.println(secondLargestElementAnotherWay());
//        System.out.println(secondSmallestElement());
//        evenAndOdd();
        sumOfArray();
    }
}
