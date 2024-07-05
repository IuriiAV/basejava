package com.telran.org.lessonsix;

import java.util.Scanner;

public class SwitchExampleThree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dayAWeek = scan.next();
        checkDayOfWeekUseSwitchCase(dayAWeek);
        checkDayOfWeekUseIfElse(dayAWeek);
        // == При сравнении строк не использовать!!!
        // equals - для сравнения строки с другой строкой
        // этот метод сравнивает строки посимвольно на эквивалентность

        String textOne = "Monday";
        String textTwo = "Tuesday";
        boolean result = textOne.equals(textTwo);
        boolean resultIgnoreCase = textTwo.equalsIgnoreCase(textOne);
    }

    private static void checkDayOfWeekUseSwitchCase(String dayAWeek) {
        switch (dayAWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Work Day");
                break;
            case "Sunday":
            case "Saturday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Incorrect word");
        }
    }

    private static void checkDayOfWeekUseIfElse(String dayAWeek) {
        if (dayAWeek.equals("Monday") || dayAWeek.equals("Tuesday") || dayAWeek.equals("Wednesday") || dayAWeek.equals("Thursday") || dayAWeek.equals("Friday")) {
            System.out.println("Work Day");
        } else if (dayAWeek.equals("Saturday") || dayAWeek.equals("Sunday")) {
            System.out.println("Weekend");
        } else {
            System.out.println("Incorrect word");
        }
    }
}
