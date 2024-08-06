package com.telran.org.lessoneleven;

public class Cat {

    String name;

    int age;

    public void voice() {
        System.out.println("I am cat " + name + ". Meow!");
    }

    public void run() {
        System.out.println("I am cat " + name + " I can run!");
    }

    public void increaseAge() {
        age++;
    }

    public void printInfo() {
        System.out.println("I am cat " + name + ", age is " + age);
    }
}