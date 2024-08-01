package com.telran.org.lessonnine;

public class LinearSearch {

    public static void main(String[] args) {
        int[] ints = {4, 5, 6, 7, 3, 5, 7, 1, 3, 2, 8, 9, 3};
        int key = 8;
        //linear search - простой перебор всех элементов массива
        for(int i = 0; i < ints.length; i++) {
            int temp = ints[i];
            if (key == temp) {
                System.out.println("Ok! We found it at index " + i);
                break;
            }
        }
    }
}
