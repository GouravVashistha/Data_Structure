package Leet_Code_Problem.ArraysQuestions;

public class RichestCustomerWealth_1672 {
    public static int ricestMan(int[][] arr) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }


        return maxSum;
    }


    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(ricestMan(arr));

    }
}
