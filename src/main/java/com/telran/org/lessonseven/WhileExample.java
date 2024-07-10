package com.telran.org.lessonseven;

import java.util.Random;
import java.util.Scanner;

public class WhileExample {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);

        int countOfAttempts = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please input any number from 0 to 10, attempt = " + countOfAttempts);
            int data = scanner.nextInt();
            countOfAttempts++; // countOfAttempts = countOfAttempts + 1;
            if (data == number) {
                System.out.println("You are win , it is " + number + ", from " + countOfAttempts + " attempt");
                break;
            }
            System.out.println("Hehe, try again!");
        }
    }
}
