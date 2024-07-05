package com.telran.org.lessonsix;

public class StringEqualsExample {

    public static void main(String[] args) {
        String day = "Friday";

        checkDayOfWeekUseIfElse(null);
    }

    private static void checkDayOfWeekUseIfElse(String dayAWeek) {
        if ("Monday".equals(dayAWeek)) {
            System.out.println("Work Day");
        } else {
            System.out.println("Incorrect word");
        }
    }
}
