package com.telran.org.lessoneight;

public class StringExample {

    public static void main(String[] args) {
        /*
        "Thursday", "Friday", "Thuesday", "Monday", "Sunday", "Wednesday", "Saturday"
         */
        String[] daysAWeek = {"Monday", "Sunday", "Wednesday",
                "Saturday", "Tuesday", "Friday", "Thursday"};
        for (int i = 0; i < daysAWeek.length; i++) {
            if ("Wednesday".equals(daysAWeek[i])) {
                System.out.println("Index of Wednesday = " + i);
            }
        }
    }
}
