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

    public static void main(String[] args) {
//        smallestElement();
//        secondLargestElement();
        System.out.println(secondLargestElementAnotherWay());
    }
}
