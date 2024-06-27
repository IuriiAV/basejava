package com.telran.org.lessonfour;

public class MethodExampleTwo {

    public static void methodOne() {
        System.out.println("One");
    }

    public static void main(String[] args) {
        methodTwo();
        methodOne();
        methodTree();
    }

    public static void methodTree() {
        System.out.println("Three");
    }

    public static void methodTwo() {
        System.out.println("Two");
    }
}
