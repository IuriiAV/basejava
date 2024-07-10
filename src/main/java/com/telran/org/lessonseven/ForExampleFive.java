package com.telran.org.lessonseven;

public class ForExampleFive {

    public static void main(String[] args) {
        //        for(;;) {     ~~~~ while(true)
        //            System.out.println("Hello");
        //        }

        String text = "Hello Java!";
        int length = text.length();

        for (int i = 0; i < length; i++) {
            char temp = text.charAt(i);
            if(temp == 'J') {
                System.out.println("We found J on position " + i);
                break;
            }
            System.out.println("Checked position " + i);
        }

        int position = length;
        for (int i = 0; i < length; i++) {
            char temp = text.charAt(i);
            if(temp == 'J') {
               position = i;
            }
            if (i < position) {
                continue;
            }
            System.out.print(temp);
        }
    }
}
