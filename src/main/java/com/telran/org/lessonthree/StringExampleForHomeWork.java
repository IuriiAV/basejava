package com.telran.org.lessonthree;

public class StringExampleForHomeWork {

    public static void main(String[] args) {
        String text = "Hello Java!";

        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        String lowerCaseString = text.toLowerCase();
        System.out.println(lowerCaseString);

        System.out.println(text.length());

        //contains ! - проверяет вхождение строки
        boolean result = text.contains("Java");
        System.out.println("Text contains Java = " + result);

        //substring - берет часть строки
        String partOfString = text.substring(2, 5);
        System.out.println("Part of string from 2 to 5 is " + partOfString);
    }
}
