package Leet_Code_Problem.ArraysQuestions;

import java.util.Arrays;

public class ValidMountainArray_941 {
    public boolean validMountainArray(int[] arr) {

        if (arr.length < 3) {
            return false;
        }

        int max = arr[0];
        int n = arr.length;
        int max_ind = 0;

        // Find peak element
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                max_ind = i;
            }
        }

        // Peak cannot be first or last element
        if (max_ind == 0 || max_ind == arr.length - 1) {
            return false;
        }

        // Check strictly increasing
        for (int i = 1; i <= max_ind; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }

        // Check strictly decreasing
        for (int i = max_ind + 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        int[] arr = {0, 3, 2, 1};

        ValidMountainArray_941 obj = new ValidMountainArray_941();

        boolean result = obj.validMountainArray(arr);

        System.out.println("Input  : " + Arrays.toString(arr));
        System.out.println("Output : " + result);
    }

}
