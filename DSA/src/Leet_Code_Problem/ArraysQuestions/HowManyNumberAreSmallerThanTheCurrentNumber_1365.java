package Leet_Code_Problem.ArraysQuestions;

import java.util.Arrays;

public class HowManyNumberAreSmallerThanTheCurrentNumber_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (nums[j] < nums[i]) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {8, 1, 2, 2, 3};

        HowManyNumberAreSmallerThanTheCurrentNumber_1365 obj = new HowManyNumberAreSmallerThanTheCurrentNumber_1365();

        int[] result = obj.smallerNumbersThanCurrent(nums);

        System.out.println("Input  : " + Arrays.toString(nums));
        System.out.println("Output : " + Arrays.toString(result));
    }
}
