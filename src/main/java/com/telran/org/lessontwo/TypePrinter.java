package com.telran.org.lessontwo;

public class TypePrinter {

    public static void main(String[] args) {
        //boolean - true , false // default = false
        boolean isLessonFinished = false;
        boolean isBoringLesson = true;
        System.out.println("Our lesson is finished ? " + isLessonFinished);
        System.out.println("Our lesson is boring ? " + isBoringLesson);

        //(1,0) - bit - byte(8bit) - Kb (1024 byte) - Mb(1024Kb) -> Gb(1024Mb) - Tb(1024Gb)

        // byte (-128 to 127) (size 1 byte(8bit)) // default = 0
        byte byteExample = 100;
        System.out.println("Byte is " + byteExample);

        // short (-32768 to 32767) (size 2 byte(16 bit)) // default =0
        short shortExample = 32000;
        System.out.println("Short is " + shortExample);

        //int (-2147483648 to 2147483627) (size 4 byte(32 bit)) // default = 0
        int intExample = 333333333;
        System.out.println("Int example " + intExample);

        //long (-9223372036854775808 to 9223372036854775807) (size 8 byte(64 bit)) // default = 0
        long longExample = 3333333355555555l;

        //float (to 7 digit) (size 4 byte(32 bit)) // default = 0.0
        float floatExample = 123.5f;

        //double (to 16 digit) (size 8 byte(64 bit)) // default = 0.0
        double doubleExample = 123.5;

        //char (0 '\u0000' to 65535 '\uffff') (size 2 byte(16 bit)) // default = \u0000
        char charExample = 7765;
        System.out.println("Char example is " + charExample);

        char example = 'a';
        System.out.println((char)(example + 10));

        //Reference
        //String (array chars)   // default = null  ("Hello", "", null)
        String stringExample = "Hello Java!";
        System.out.println(stringExample);

        System.out.println(stringExample + "Hello!");
        System.out.println(5);
        String exampleNull = null;
        System.out.println(exampleNull);

    }
}
