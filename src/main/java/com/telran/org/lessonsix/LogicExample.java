package com.telran.org.lessonsix;

public class LogicExample {

    public static void main(String[] args) {
        // && - short operator
        // & - full operator
        if (methodOne() & methodTwo()) {
            System.out.println("It is true");
        } else {
            System.out.println("It is false");
        }
    }

    public static boolean methodOne() {
        System.out.println("Print from method one");
        return false;
    }

    public static boolean methodTwo() {
        System.out.println("Print from method two");
        return true;
    }
}
