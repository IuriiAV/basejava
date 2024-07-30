package com.telran.org.lessoneight;

public class ArrayExampleTwo {

    public static void main(String[] args) {
        // 7, 4, 5, 6, 3, 1, 0
        int[] array = {7, 4, 5, 6, 3, 1, 0};
        //int[] array = new int[]{7, 4, 5, 6, 3, 1, 0};
//        array[0] = 7;
//        array[1] = 4;
//        array[2] = 5;
//        array[3] = 6;
//        array[4] = 3;
//        array[5] = 1;
//        array[6] = 0;

        printArray(array);
    }

    public static void printArray(int[] simpleArray) {
        System.out.println("Iterate array : ");
        //int length = simpleArray.length;
        for (int i = 0; i < simpleArray.length; i++) {  // i = 0,1,2
            int temp = simpleArray[i]; // array[0],array[1],array[2]
            System.out.print(temp + " ");
        }
        System.out.println();
    }
}
