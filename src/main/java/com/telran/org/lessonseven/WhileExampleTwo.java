package com.telran.org.lessonseven;

import java.util.Scanner;

public class WhileExampleTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data;
        while (true) {
            System.out.println("Please input number from 0 - 9");
            data = scanner.nextInt();
            if (data >= 0 && data <= 9) {
                break;
            }
            System.out.println("Incorrect number.Try again");
        }

        System.out.println("Your input is " + data);
    }
}
