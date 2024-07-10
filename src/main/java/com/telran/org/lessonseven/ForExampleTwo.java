package com.telran.org.lessonseven;

public class ForExampleTwo {

    public static void main(String[] args) {
        printNumber(10);
        printNumberTwo(10);
    }

    private static void printNumber(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printNumberTwo(int number) {
        // i = i + 2;  i+=2;
        for (int i = 0; i <= number; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}