package Foundatation;

public class Swapping {
    public static void withThirdVariable(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a :"+a +"\nb :"+b);
    }

    public static void withOutThirdVariable(int a,int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a :"+a +"\nb :"+b);
    }


    public static void main(String[] args) {

        int a =10,b=20;
        withThirdVariable(a,b);
        withOutThirdVariable(a,b);

    }
}
