package com.telran.org.lessonsix;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input language :");
        System.out.println("1 - En, 2 - DE, 3 - IT, 4 - CN , 0 - End");
        int option = scanner.nextInt();

        switch (option) {
            case 1:  // option == 1 ?
                System.out.println("Hello");
                break;
            case 2: // if(option == 2) ?
                System.out.println("Hallo");
                break;
            case 3: // option == 3 ?
                System.out.println("Hola");
                break;
            case 4: // option == 4 ?
                System.out.println("Nihao");
                break;
            case 0: // option == 0 ?
                System.out.println("it is all");
                break;
            default: // если ничего выше не подошло
                System.out.println("Incorrect option");
        }

        //        if (option == 1) {
//            System.out.println("Hello");
//        } else if (option == 2) {
//            System.out.println("Hallo");
//        } else if (option == 3) {
//            System.out.println("Hola");
//        } else if (option == 4) {
//            System.out.println("Nihao");
//        } else {
//            System.out.println("Incorrect option");
//        }
    }
}
