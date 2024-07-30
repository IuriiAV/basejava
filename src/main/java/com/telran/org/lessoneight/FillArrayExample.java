package com.telran.org.lessoneight;

import java.util.Arrays;

public class FillArrayExample {

    public static void main(String[] args) {
        int[] ints = new int[100];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i; // ints[0] = 0, ints[1] = 1, etc ints[99] = 99
        }
        System.out.println("Array = " + Arrays.toString(ints));
    }
}
