package com.telran.org.lessonsix;

public class RealLogicExample {

    public static void main(String[] args) {
        String iban = "DE4354";
        //Example one
        checkIBANForDE(iban);

        //Example two
        checkIBANForDE(null);

        String text; // null
        String textTwo = "";

    }

    public static void checkIBANForDE(String iban) {
        if (iban != null && iban.startsWith("D")) {
            System.out.println("It is correct iban");
        } else {
            System.out.println("It is not correct");
        }
    }
}
