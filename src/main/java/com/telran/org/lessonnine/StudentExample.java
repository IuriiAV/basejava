package com.telran.org.lessonnine;

public class StudentExample {

    public static void main(String[] args) {
        //String[] strings = new String[10];
        //int age = 10;

        Student studentOne = new Student();
        studentOne.name = "Alex";
        studentOne.surname = "Alexeev";
        studentOne.age = 35;
        studentOne.email = "alex@gmail.com";

        Student studentTwo = new Student();
        studentTwo.name = "Oleg";
        studentTwo.surname = "Olegov";
        studentTwo.age = 20;
        studentTwo.email = "oleg@gmail.com";

        System.out.println("First student name is " + studentOne.name);
        System.out.println("Second student name is " + studentTwo.name);

        System.out.println("Name is " + studentTwo.name + " , surname is " +
                studentTwo.surname + " , age is " + studentTwo.age);

        System.out.println("\n\n");

        Student[] students = {studentOne, studentTwo};
        // analog
        //        Student[] students = new Student[2];
        //        students[0] = studentOne;
        //        students[1] = studentTwo;
        for (int i = 0; i < students.length; i++) {
            Student currentStudent = students[i];
            System.out.println("Student number " + (i + 1) + " info : ");
            System.out.println("Name is " + currentStudent.name + " , surname is " +
                    currentStudent.surname + " , age is " + currentStudent.age);
            System.out.println();
        }
    }
}
