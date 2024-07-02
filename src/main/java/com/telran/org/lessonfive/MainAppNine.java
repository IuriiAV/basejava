package com.telran.org.lessonfive;

import java.util.Scanner;

public class MainAppNine {

    public static void main(String[] args) {
        // && - short operator AND , & - full operator AND
        // || - short operator OR  , | - full operator OR
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two number from 0");
        System.out.println("First number : ");
        int first = scanner.nextInt();
        System.out.println("Second number : ");
        int second = scanner.nextInt();

        System.out.println("\nCheck && conditional");
        // if == true , (first > 0) == true and (second > 0) == true
        if ((first > 0) && (second > 0)) {
            System.out.println("Both of them more than zero");
        } else {
            System.out.println("One of them less than zero");
        }

        System.out.println("\nCheck || conditional");
        // if == true , (first > 0) == true OR (second > 0) == true
        if ((first > 0) || (second > 0)) {
            System.out.println("One of them more than zero");
        } else {
            System.out.println("Both of them less than zero");
        }

        // from 0 to 9
        if (first >= 0 && first <= 9) {
            System.out.println("First from 0 to 9");
        }
    }
}