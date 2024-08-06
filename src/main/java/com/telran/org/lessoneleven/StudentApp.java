package com.telran.org.lessoneleven;

public class StudentApp {

    public static void main(String[] args) {
        Student studentOne = new Student("Alex", "Alexeev", 25);
//        System.out.println("Student info " + studentOne.getName() + " " + studentOne.getSurname() + " "
//                + studentOne.getAge());

        System.out.println(studentOne);
        studentOne.setAge(17);
        System.out.println(studentOne);

//        System.out.println("Student info " + studentOne.getName() + " " + studentOne.getSurname() + " "
//                + studentOne.getAge());

        System.out.println(studentOne);
    }
}
