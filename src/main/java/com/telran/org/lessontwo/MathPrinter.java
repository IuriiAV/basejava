package com.telran.org.lessontwo;

public class MathPrinter {
    //MAC option + command + L
    //WIN ctrl + alt + L

    public static void main(String[] args) {
        int elementOne = 10;
        int elementTwo = 3;

        System.out.println("Sum = " + (elementOne + elementTwo));
        System.out.println("Sub = " + (elementOne - elementTwo));
        System.out.println("Mult = " + (elementOne * elementTwo));
        System.out.println("Div = " + (elementOne / elementTwo));

        int sum = elementOne + elementTwo;
        int sub = elementOne - elementTwo;
        int mult = elementOne * elementTwo;
        int div = elementOne / elementTwo;

        System.out.println("Sum from sum = " + sum);
        System.out.println("Sum * Div = " + (sum * div));

        System.out.println("Rest from division = " + (elementOne % elementTwo));

        int count = 0;
        //count = count + 1;
        count++;
        count--;
        System.out.println("Count is " + count);
        //count = count + 2;
        count += 2;
        System.out.println("Count is " + count);

        int operationExample = 10;
        System.out.println("Postfix is = " + (operationExample++));
        System.out.println("After postfix = " + operationExample);

        int year = 10;
        int result = year++ - 2; // 10 -2 ;  year = year + 1;
        System.out.println("Result is " + result);

        operationExample = 10;
        System.out.println("Prefix is = " + (++operationExample));
        System.out.println("After prefix = " + operationExample);

        year = 5;
        result = 4 + ++year; // (4 + (year = year + 1)
        System.out.println("Result is " + result);
    }
}
