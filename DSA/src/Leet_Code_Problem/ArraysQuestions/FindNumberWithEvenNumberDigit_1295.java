package Leet_Code_Problem.ArraysQuestions;

public class FindNumberWithEvenNumberDigit_1295 {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int digit = 0;
            int num = nums[i];

            while (num != 0) {
                num = num / 10;
                digit++;
            }

            if (digit % 2 == 0) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};

        FindNumberWithEvenNumberDigit_1295 obj = new FindNumberWithEvenNumberDigit_1295();
        int result = obj.findNumbers(nums);

        System.out.println("Count of numbers with even number of digits: " + result);

    }
}
