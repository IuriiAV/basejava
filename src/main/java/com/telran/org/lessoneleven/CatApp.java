package com.telran.org.lessoneleven;

public class CatApp {

    public static void main(String[] args) {
        Cat catOne = new Cat();
        catOne.name = "Barsik";
        catOne.age = 5;
        catOne.voice();
        catOne.run();


        Cat catTwo = new Cat();
        catTwo.name = "Mursik";
        catTwo.age = 3;
        catTwo.voice();
        catTwo.run();

        System.out.println();
        catOne.printInfo();
        catTwo.printInfo();

        catTwo.increaseAge();

        System.out.println();
        catOne.printInfo();
        catTwo.printInfo();

        for(int i = 0; i < 20; i++) {
            catOne.increaseAge();
        }

        System.out.println();
        catOne.printInfo();
        catTwo.printInfo();

    }
}
