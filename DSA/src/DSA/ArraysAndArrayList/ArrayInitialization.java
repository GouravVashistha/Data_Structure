package DSA.ArraysAndArrayList;

public class ArrayInitialization {
    public static void main(String[] args) {
        /*
         * ==========================
         * WHAT IS AN ARRAY?
         * ==========================
         *
         * Array is a collection of similar data types
         * stored in contiguous memory locations.
         *
         * Example:
         * Instead of creating:
         * int a = 10;
         * int b = 20;
         * int c = 30;
         *
         * We can create:
         * int[] arr = {10, 20, 30};
         *
         * Arrays are used when we need to store multiple
         * values of the same type.
         */

        // ==========================
        // ARRAY DECLARATION
        // ==========================
        // datatype[] variable_name;
        int[] rollNumbers;

        // ==========================
        // ARRAY CREATION
        // ==========================

        // datatype[] variable_name = new datatype[size];

        int[] rollNUmber = new int[5];

        int[] rollNumber2 = {23,123,4,234,6,43,3};

        /*
         * Memory Representation:
         *
         * Index:  0   1   2   3   4
         * Value:  0   0   0   0   0
         */
// Accessing elements
        System.out.println(rollNumber2[0]); // 0

        // Assign values
        rollNumber2[0] = 10;
        rollNumber2[1] = 20;
        rollNumber2[2] = 30;
        rollNumber2[3] = 40;
        rollNumber2[4] = 50;

        // Accessing values
        System.out.println(rollNumber2[2]); // 30

        // ==========================
        // ARRAY INITIALIZATION
        // ==========================

        int[] rollNumbers2 = {23, 123, 4, 234, 6, 43, 3};

        /*
         * Internally Java creates:
         *
         * int[] rollNumbers2 = new int[]{
         *     23, 123, 4, 234, 6, 43, 3
         * };
         */

        // ==========================
        // ARRAY LENGTH
        // ==========================

        System.out.println(rollNumbers2.length); // 7

        /*
         * length is a property, not a method.
         *
         * Correct:
         * arr.length
         *
         * Wrong:
         * arr.length()
         */

        // ==========================
        // TRAVERSING ARRAY
        // ==========================

        for (int i = 0; i < rollNumbers2.length; i++) {
            System.out.print(rollNumbers2[i] + " ");
        }

        System.out.println();

        // Enhanced for loop
        for (int num : rollNumbers2) {
            System.out.print(num + " ");
        }


    }
}
