package com.telran.org.lessoneight;

import java.util.Arrays;

public class ChangeExample {

    public static void main(String[] args) {
        int[] array = {4, 6, 3, 9, 1};
        System.out.println("Array before : " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        //String result = Arrays.toString(array);
        System.out.println("Array after : " + Arrays.toString(array));
    }
}
