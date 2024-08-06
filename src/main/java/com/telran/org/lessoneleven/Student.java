package com.telran.org.lessoneleven;

public class Student {

    //public - доступ можно получить отовсюду
    //private - доступ только внутри класса
    //protected - доступ внутри класса и в его наследниках
    //default(nothing) - по умолчанию, во всех класса в текущем пакете

    private String name;

    private String surname;

    private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //getters and setters


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 90) {
            System.out.println("Incorrect age " + age + ", Try again");
            return;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student info : " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age;

    }
}
