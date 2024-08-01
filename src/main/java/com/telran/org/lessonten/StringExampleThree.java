package com.telran.org.lessonten;

public class StringExampleThree {

    public static void main(String[] args) {
        String example = "Hello";

        //Так делать нельзя так как строка не изменяемая и каждый раз будет создана новая строка
        //в пуле строк (памяти куча)
        for (int i = 0; i < 10; i++) {
            example = example + i; // Hello0, Hello01, Hello012, Hello0123...Hello0123456789
        }

        System.out.println(example);
    }
}
