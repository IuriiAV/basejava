package com.telran.org.lessonfour;

import java.util.Scanner;

public class MethodExampleFive {
    //Code format :
    //WIN  CTRL+ALT+L
    //MAC  OPTION+COMMAND+L

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your name : ");
        String name = scanner.next();  // Alex

        System.out.println("Input your age : ");
        int age = scanner.nextInt();  // 55

        printGreetings(name, age);  // printGreetings("Alex", 55);
        //printGreetings("Alex", 55);

        System.out.println("Input your height : ");
        int height = scanner.nextInt();  // 170

        printBioInfo(age, height);
    }

    public static void printGreetings(String name, int age) {
        System.out.println("Hello " + name + " your age is " + age);
    }

    public static void printBioInfo(int age, int height) {
        System.out.println("Your height " + height + " age is " + age);
    }
}
