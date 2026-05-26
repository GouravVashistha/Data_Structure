package Basic_Code;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value :");
        long a = sc.nextLong();
        sc.close();
        long ans = a*a;
        System.out.println(ans);


    }
}
