package com.telran.org.lessonfour;

import java.util.Scanner;

public class MethodExampleFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name");
        String name = scanner.next(); // ввели Алекс
        printGreetings(name); // printGreetings("Алекс")

        printGreetings("Max");
    }

    public static void printGreetings(String name) {
        //String info = "Max";
        System.out.println("Hello " + name);
    }
}
