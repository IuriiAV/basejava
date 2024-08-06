package com.telran.org.lessonnine;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] ints = {11, 5, 6, 7, 3, 5, 7, 1, 3, 2, 8, 12, 3};
        // 5 6 7 3 5 7 1 3 2 8 11 3 12
        // 5 6 3 5 7 1 3 2 7 8 3 11 12
        System.out.println("Before " + Arrays.toString(ints));

        // 0 - 12
        for (int i = 0; i < ints.length; i++) {
            //0 - 11
            for (int j = 0; j < ints.length - 1 - i; j++) {
                if (ints[j] > ints[j + 1]) {
                    swap(ints, j);
                }
            }
            //System.out.println("i = " + i + " : " + Arrays.toString(ints));
        }
        System.out.println("After " + Arrays.toString(ints));
    }

    private static void swap(int[] ints, int j) {
        int temp = ints[j + 1];
        ints[j + 1] = ints[j];
        ints[j] = temp;
    }
}
