package com.telran.org.lessoneleven;

public class DogApp {

    public static void main(String[] args) {
        Dog smallDog = new Dog(); //при создании объекта будет вызван конструктор Dog()
        smallDog.age = 5;
        smallDog.name = "Bobik";
        smallDog.breed = "Yard";

        System.out.println("Dog with name " + smallDog.name + " and age " + smallDog.age);

        Dog bigDog = new Dog("Funtik");
        System.out.println("Big dog with name " + bigDog.name);

        Dog middleDog = new Dog("Tuzik", 7, "Shepard");
        System.out.println("Middle dog with name " + middleDog.name +
                ", age = " + middleDog.age + " , breed = " + middleDog.breed);

        Dog oldDog = new Dog("Barsik", 40, "Yard");

    }
}