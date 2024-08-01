package com.telran.org.lessonten;

public class StringExample {


    /*
    STACK :
    |            |
    | printHelloAgain   | String nameTwo =  #FFEE33
    | printHello        | int count = 5; String name = #FFEE33
    |_main____          |

    HEAP :

    #FFEE33 : "Alex"
    #EEAAHH : Student(name, surname, age, rate)
    //#HH45FF : "Alex"
     */

    public static void main(String[] args) {
        // new
        String one = "Cat";
        String two = new String("Cat");
        System.out.println("Hello");
        //Пул уникальных строк
        //Примитивные типы хранятся в стековой памяти STACK
        //Ссылочные типы данных хранятся в памяти - куча HEAP
        //  HEAP  -     HEAP : #FF43DE |___0|___0|___0|
        printHello();

    }

    private static void printHello() {
        int count = 5;
        String name = "Alex";
        System.out.println("Hello " + name + " you have " + count + " points");
        //String nameThree = "Alex";
        printHelloAgain();
    }

    private static void printHelloAgain() {
        String nameTwo = "Alex";
        System.out.println("Hello " + nameTwo);
    }
}
