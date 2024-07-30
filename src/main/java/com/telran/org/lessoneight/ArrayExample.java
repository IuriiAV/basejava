package com.telran.org.lessoneight;

public class ArrayExample {

    public static void main(String[] args) {
        //int[] - type array , new int[3] - create array size of 3
        //  STACK , HEAP  -     HEAP : #FF43DE |___0|___0|___0|
        int[] array = new int[30];
        //get by index - O(1) Time complexity
        int resultFrom0Index = array[0];
        System.out.println(resultFrom0Index);
        int resultFrom1Index = array[1];
        System.out.println(resultFrom1Index);
        int resultFrom2Index = array[2];
        System.out.println(resultFrom2Index);
        //получить значение из ячейки array[index], for instance array[1], array[3] etc
        array[0] = 5;
        System.out.println("Number from 0 - index cell " + array[0]);
        //call method printArray with param "array"
        printArray(array);
        //Incorrect
        //System.out.println("Number from 3 cell = " + array[-1]);
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
