package com.telran.org.lessonsix;

import java.util.Scanner;

public class SwitchExampleTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input language :");
        System.out.println("1 - En, 6 - En, 2 - DE, 3 - IT, 9 - IT, 4 - CN , 7 - CN 0 - End");
        int option = scanner.nextInt();
        // JDK 6  - > int, byte, short, char
        // JDK 7 - > String , ENUM
        switch (option) {
            case 1:  // option == 1 ?
            case 6:  // option == 1 ?
                System.out.println("Hello");
                break;
            case 2: // if(option == 2) ?
                System.out.println("Hallo");
                break;
            case 3: // option == 3 ?
            case 9: // option == 3 ?
                System.out.println("Hola");
                break;
            case 4: // option == 4 ?
            case 7: // option == 4 ?
                System.out.println("Nihao");
                break;
            case 0: // option == 0 ?
                System.out.println("it is all");
                break;
            default: // если ничего выше не подошло
                System.out.println("Incorrect option");
        }
    }
}
