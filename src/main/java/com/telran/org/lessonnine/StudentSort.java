package com.telran.org.lessonnine;

import java.util.Random;

public class StudentSort {

    public static void main(String[] args) {
        Student[] students = new Student[10];
        Random random = new Random();

        for (int i = 0; i < students.length; i++) {
            Student currentStudent = new Student();
            currentStudent.name = "name-" + i;
            currentStudent.surname = "surname-" + i;
            currentStudent.age = random.nextInt(90);
            currentStudent.rate = random.nextInt(20);

            students[i] = currentStudent;
        }
        System.out.println("Students before sort :");
        printStudents(students);
        System.out.println("\nStudents after sort : ");
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1 - i ; j++) {
                Student one = students[j];
                Student two = students[j + 1];
                if (one.rate < two.rate) {
                    Student temp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = temp;
                }
            }
        }
        printStudents(students);
    }

    private static void printStudents(Student[] students) {
        //foreach
        for (Student currentStudent : students) {
            System.out.println("Student " + currentStudent.name +
                    " " + currentStudent.surname + ",age = " + currentStudent.age +
                    ",rate = " + currentStudent.rate);
        }
    }
}
