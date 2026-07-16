package DSA.ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {

    static void oneD() {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[4];

        for (int i = 0; i <= str.length - 1; i++) {
            str[i] = sc.next();
        }

        for (String element : str) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(str));

    }

    static void twoD() {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(arr1[0][1]);

        // input

        int[][] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println(arr.length);

        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                // taking input for array
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }


    public static void main(String[] args) {

        // one Dimensional Array
//        oneD();
        // Two Dimensional Array
//        twoD();
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }


        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }


    }
}
