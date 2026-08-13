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

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArrayUsingTem(arr)));

    }
}
