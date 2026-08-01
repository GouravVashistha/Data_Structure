package DSA.ArraysAndArrayList;

import java.util.Arrays;
import java.util.HashMap;

public class BasicsProblemSolving {

    // Q 1 :- Find the total number of paires in the array whose sum is equal to the fix given value X;

    /**
     * just for try
     * public static  boolean sum(int[] arr,int X){
     * boolean sum = true;
     * for(int i = 0; i< arr.length; i++){
     * for(int j = 0 ;j < arr.length; j++){
     * if (arr[i] + arr[j]==X) {
     * return sum;
     * }
     * }
     * }
     * return false;
     * }
     **/
    // first way brute force approach
    public static int sum(int[] arr, int X) {
        int ans = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == X) {
                    ans++;
                }
            }
        }
        return ans;
    }

    // using hashMap approch

    public static int countPairs(int[] arr, int target) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int need = target - num;
            if (map.containsKey(need)) {
                count += map.get(need);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public static int countPairsUsingTwoPointer(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                count++;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 5, 8, 2};
        int target = 7;
//        System.out.println(sum(arr, target));
//        System.out.println(countPairs(arr, target));
        System.out.println(countPairsUsingTwoPointer(arr, target));
    }

}
