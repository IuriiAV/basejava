package com.telran.org.lessoneight;

import java.util.Arrays;
import java.util.Random;

public class TaskExample {

    public static void main(String[] args) {
        //int[] ints = {4, 5, 6, 7, 3, 5, 7, 1, 3, 2, 8, 9, 3};
        int[] ints = new int[20];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(200);
        }
        System.out.println("Random array " + Arrays.toString(ints));

        printMinElement(ints);
        printMaxElement(ints);
    }

    public static void printMinElement(int[] ints) {
        int min = ints[0]; //4
        for (int i = 0; i < ints.length; i++) { //i = 0, 1 ,2, 3 , 4 ,5
            int temp = ints[i]; //4 , 5 ,6 , 7 , 3 ,5 ,7 ,1,3
            if (temp < min) { // 4 < 4, 5 < 4, 6 < 4, 7 < 4 , 3 < 4, 5< 3, 7 <3 , 1 < 3, 3 < 1
                min = temp; // min = 3, 1
            }
        }
        System.out.println("Min element = " + min);
    }

    public static void printMaxElement(int[] ints) {
        int max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            int temp = ints[i];
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println("Max element = " + max);
    }
}
