package DSA.ArraysAndArrayList;

public class FindRepeatingValue {
    //  Given an array consisting of integers. Return the first value that is repeating in the array if no value
    // is being repated return -1;


    public static int findRepating(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    ans = arr[i];
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,4,6,3,4};
        System.out.println(findRepating(arr));
    }
}
