package DSA.ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

/*
 Reference Variable aur Memory Internals

Reference variable heap mein bane array ke base address (jaise 101) ko point karta hai.
Index calculation: arr[i] ka matlab hai base address se i distance door ki value.
4. Shallow Copy vs Deep Copy

Shallow Copy (Assignment Operator): int[] arr2 = arr1; karne se naya array nahi banta, balki dono variables ek hi memory address ko point karte hain. Isliye, agar aap arr2 mein change karenge, toh arr1 mein bhi change dikhega (25:50).
Deep Copy (.clone()): int[] arr2 = arr1.clone(); karne se heap mein bilkul naya memory block allocate hota hai. Isse dono arrays independent ho jaate hain (34:47).
5. Java Methods aur Arrays

Jab hum array ko kisi method mein pass karte hain, toh reference ki copy pass hoti hai. Agar method ke andar index change karenge (arr[0]=0), toh wo main array mein reflect hoga, lekin agar new array assign kar denge, toh original array change nahi hoga.
 */
public class ArrayRefrence {
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    static void changesValue(int a) {
        a = 1005;
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("original array");
        printArr(arr);
//        int[] arr_2 = arr.clone();
        int[] arr_2 = Arrays.copyOf(arr, arr.length);
        int[] arr_3 = Arrays.copyOfRange(arr,0, arr.length);
        System.out.println("copyed  array");
        printArr(arr_2);

        arr_2[0] = 0;
        arr_2[1] = 0;
        System.out.println("original array after change");
        printArr(arr);
        System.out.println("copyed  array after changes");
        printArr(arr_2);



        /*
        Output:-
                original array
                1 2 3 4 5
                copyed  array
                1 2 3 4 5
                original array after change
                0 0 3 4 5
                copyed  array after changes
                0 0 3 4 5
         */

        int a = 40;
        changesValue(a);
//        System.out.println(a); // 40  value is not changes because we are passing the refrence of a not actual value

        /* Java mein array ek object hota hai.
        Jab tum ye likhte ho:
        changeArray(ages);
        To ages ka reference method ko pass hota hai.
        */

        int[] ages = new int[3];
        ages[0] = 5;
        ages[1] = 52;
        ages[2] = 54;
//        changeArray(ages);
//        printArr(ages); // 0 0 0


    }
}
