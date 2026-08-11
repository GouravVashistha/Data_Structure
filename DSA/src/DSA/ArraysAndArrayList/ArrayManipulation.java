package DSA.ArraysAndArrayList;

public class ArrayManipulation {

    // Find the unique number in a given array where all the elements are being
    // repeated twice with one value being unique. ( Only positve number values in array)

    public static int Findunique(int[] arr) {
        int ans = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(Findunique(arr));
    }


}
