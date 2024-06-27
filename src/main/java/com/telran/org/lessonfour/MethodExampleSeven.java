package com.telran.org.lessonfour;

public class MethodExampleSeven {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = getSum(a, b);
        int result = getResult(sum, 10);
        System.out.println(result);
    }

    public static int getResult(int sum, int coeff) {
        return sum * coeff;
    }

    public static int getSum(int a, int b) {
        return a + b;
    }
}
