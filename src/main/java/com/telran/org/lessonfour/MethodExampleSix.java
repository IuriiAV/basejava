package com.telran.org.lessonfour;

import java.util.Scanner;

public class MethodExampleSix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a : ");
        int a = scanner.nextInt();

        System.out.println("Input b: ");
        int b = scanner.nextInt();

        //вызвать метод сложения, получить результат и вывести его
        //вот тут в консоль
        //int result = getSum(a, b);
        //System.out.println("Sum a + b = " + result);

        System.out.println("Sum a + b = " + getSum(a, b));
    }

    public static int getSum(int a, int b) {
        //int sum = a + b;
        //return sum;
        return a + b;
    }
}
