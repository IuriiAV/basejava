package com.telran.org.lessonseven;

import java.util.Scanner;

public class WhileExampleThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data = -1;
        while (data != 0) {
            System.out.println("Please input any number(0 - exit)");
            data = scanner.nextInt();
            if(data % 2 == 0) {
                System.out.println("It is even number " + data);
            } else {
                System.out.println("It is odd number " + data);
            }
        }
    }
}
