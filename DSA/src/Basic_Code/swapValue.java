package Basic_Code;

public class swapValue {

    // Given 2 integer a and b. Swap the 2 given number using Temporary variable
    public static void swapUsingTemp(int a, int b) {
        System.out.println("a : " + a + " b :" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : " + a + " b :" + b);

    }

    // Given 2 integer a and b swap the 2 given values using sum and difference method

    public static void swapUsingAddDiff(int a, int b) {
        System.out.println("a : " + a + " b :" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a : " + a + " b :" + b);

    }

    public static void main(String[] args) {
//        swapUsingTemp(4, 5);
        swapUsingAddDiff(4,5);
    }
}
