package DSA.ArraysAndArrayList;

public class MaximumValueInArray {

    static int max() {

        int[] arr = {1, 5, 3, 67, 4, 2, 99};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max());
    }
}
