package Leet_Code_Problem.ArraysQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SquaresOfASortedArray_977 {

    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            ans[i] = num * num;
        }
        Arrays.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        SquaresOfASortedArray_977 ans = new SquaresOfASortedArray_977();
        System.out.println(Arrays.toString(ans.sortedSquares(arr)));
    }
}
