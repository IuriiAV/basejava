package com.telran.org.lessonsix;

import java.awt.*;
import java.util.Arrays;

public class AlgoExample {

    public static void main(String[] args) {
        String text = "Hello Wolrd!";

        String s = new StringBuilder(text).reverse().toString();

        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(chars));
    }
}
