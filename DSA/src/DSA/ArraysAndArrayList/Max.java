package DSA.ArraysAndArrayList;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 44, 6, 3, 8};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));
    }

    private static int max(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    private static int maxRange(int[] arr, int start, int end) {
        if (end > start) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }

        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
