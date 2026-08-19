package Leet_Code_Problem.ArraysQuestions;

import java.util.Arrays;
import java.util.HashMap;

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

    public int[] smallerNumbersThanCurrentAnotherApproach(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], i);
            }
        }

        for (int i = 0; i < n; i++) {
            ans[i] = map.get(nums[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {8, 1, 2, 2, 3};

        HowManyNumberAreSmallerThanTheCurrentNumber_1365 obj = new HowManyNumberAreSmallerThanTheCurrentNumber_1365();

        int[] result = obj.smallerNumbersThanCurrentAnotherApproach(nums);
//        int[] result = obj.smallerNumbersThanCurrent(nums);

        System.out.println("Input  : " + Arrays.toString(nums));
        System.out.println("Output : " + Arrays.toString(result));
    }
}
