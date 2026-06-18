package DSA.ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {

    static void oneD(){
        Scanner sc  = new Scanner(System.in);

        String[] str = new String[4];

        for(int i = 0; i <= str.length-1; i++){
            str[i]= sc.next();
        }

        for(String element : str){
            System.out.print(element+ " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(str));

    }

    public static void main(String[] args) {

        // one Dimensional Array
        oneD();
        // Two Dimensional Array



    }
}
