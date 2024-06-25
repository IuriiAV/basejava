package com.telran.org.lessonthree;

public class VarExample {
    //class variables
    public static int counter = 20;

    //object variables
    public int newCounter = 100;

    public static void main(String[] args) {
        //local variables
        String text = "Hello";
        int countOfLetters = 10;
        System.out.println(text);
        System.out.println(countOfLetters);
        System.out.println(counter);
    }

    public static void print() {
        int countOfLetters = 15;
        System.out.println(countOfLetters);
        System.out.println(counter);
    }
}
