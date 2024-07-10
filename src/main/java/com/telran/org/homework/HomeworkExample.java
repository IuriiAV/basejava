package com.telran.org.homework;

public class HomeworkExample {

    public static void main(String[] args) {
        System.out.println(methodOne("Hello Java!"));
    }

    public static String methodOne(String str) {
        return methodTwo(str.toUpperCase());
    }

    public static String methodTwo(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
