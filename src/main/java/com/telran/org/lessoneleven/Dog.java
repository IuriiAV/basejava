package com.telran.org.lessoneleven;

public class Dog {

    String name;

    int age;

    String breed;

    //Конструктор без параметров, вызывается когда пишем new Dog()
    //Вызывается при создании объекта
    public Dog() {

    }

    //this.name - обращение к полю name текущего класса
    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age, String breed) {
        if (age < 0) {
            throw new IllegalArgumentException("Incorrect age " + age);
        }
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
}
