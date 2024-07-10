package com.telran.org.lessonseven;

import java.util.Scanner;

public class ForExampleThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any number : ");
        int data = scanner.nextInt();
        for (int i = 0; i <= data; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Number in backward direction : ");
        for (int i = data; i >= 0; i = i - 2) {
            System.out.println(i);
        }
    }
}
