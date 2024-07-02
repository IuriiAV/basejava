package com.telran.org.lessonfive;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        //if //if - else // if -else -if
        //if - если что-то равно истина, то идем внутрь блока if
        //else - иначе переходим в этот блок и выполняем код тут
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // boolean - true, false
        boolean result = num > 10;
        if (result) {
            // этот код будет выполняться в том случае, если result == true
            System.out.println("Inside IF , " + num + " > 10");
        } else {
            // этот код будет выполняться в том случае, если result == false
            System.out.println("Inside ELSE , " + num + " < 10");
        }

        System.out.println("End of program");
    }
}
