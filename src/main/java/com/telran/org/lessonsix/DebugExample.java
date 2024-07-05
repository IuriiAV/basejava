package com.telran.org.lessonsix;

public class DebugExample {

    public static void main(String[] args) {
        checkEvenOdd(2);
        checkEvenOdd(4);
        checkEvenOdd(5);
    }

    private static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("" + num + " is even");
        } else {
            System.out.println("" + num + " is odd");
        }
    }
}
