package com.telran.org.lessonten;

public class StringExampleFour {

    public static void main(String[] args) {
        //StringBuilder, StringBuffer

        //Когда работаем со строкой(String), любое изменение массива внутри запрещено
        //Когда работаем со стрингбилдером (StringBuilder), можем изменять начинку массива как угодно
        //Hello + A + 5;
        StringBuilder sb = new StringBuilder(); // внутри этого объекта массив для наших букв(слов)
        sb.append("Hello").append('A').append(5).reverse();
//        sb.append('A');
//        sb.append(5);
        String result = sb.toString();
        System.out.println(result);

        StringBuilder stringBuilder = new StringBuilder("Hello");
        for(int i = 0; i < 10; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder.toString());
    }
}
