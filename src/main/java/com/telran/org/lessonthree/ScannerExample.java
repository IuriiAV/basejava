package com.telran.org.lessonthree;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        //scanner - объект для получения данных из консоли
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your age :");
        //ввод числа с клавиатуры и присвоение этого числа в переменную age
        //nextInt() - это запрос на ввод целого числа с клавиатуры
        int age = scanner.nextInt();
        System.out.println("Your age is " + age);

        System.out.println("Please input your name :");
        //next() - это запрос ввода слова с клавиатуры
        //ввели слово и присвоили его в переменную name
        String name = scanner.next();
        System.out.println("Your name is " + name);

        System.out.println("Please input your surname :");
        String surname = scanner.next();
        System.out.println("Your surname is " + surname);

        System.out.println("\nYour bio is: ");
        System.out.println("Your name : " + name + ", surname : " + surname + ", age :" + age);

        //getFioFromConsole();
    }

    public static void getFioFromConsole() {
        //scanner - объект для получения данных из консоли
        Scanner scanner = new Scanner(System.in);

        System.out.println("And input your name and surname as one string : ");
        //nextLine() - запрашивает ввод нескольких слов
        String fio = scanner.nextLine();
        System.out.println("Your fio is " + fio);
    }
}
