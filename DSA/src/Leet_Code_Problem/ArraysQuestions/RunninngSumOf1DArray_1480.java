package Leet_Code_Problem.ArraysQuestions;

import java.util.Arrays;

public class RunninngSumOf1DArray_1480 {

    //    https://leetcode.com/problems/running-sum-of-1d-array/description/


    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
           sum += nums[i];
           ans[i] =sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
