package com.telran.org.lessonsix;

import java.util.Random;

public class RandomApp {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println(randomNumber);

        //start 0, end length-1
        String text = "Hello";
        int index = random.nextInt(text.length() - 1);
        System.out.println(text.charAt(index));
    }
}
