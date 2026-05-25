package Foundatation;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("sum =" + (a+b));
    }
}
