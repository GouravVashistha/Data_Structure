package DSA.ArraysAndArrayList;

import java.util.Arrays;

public class ArrayTraversingUsingForLoop {

    public static void main(String[] args) {
        int[] ages = {1, 2, 3, 4, 5, 6, 7};

         System.out.println(Arrays.toString(ages));

        // using for loop
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        // using foreach loop
        for(int value : ages){
            System.out.println(value);
        }


    }
}
