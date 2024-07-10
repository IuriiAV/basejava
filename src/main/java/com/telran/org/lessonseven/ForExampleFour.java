package com.telran.org.lessonseven;

public class ForExampleFour {

    public static void main(String[] args) {
        String text = "Hello Java!";
        printForwardString(text);
    }

    private static void printForwardString(String text) {
        int length = text.length(); // 11
        for (int i = 0; i < length; i++) {
            char temp = text.charAt(i);
            System.out.print(temp + "-");
        }
    }

    private static void printBackwardString(String text) {

    }
}
