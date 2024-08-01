package com.telran.org.lessonten;


public class StringExampleTwo {

    public static void main(String[] args) {
        //Перед созданием этой строки будет проверка нет ли ее в пуле уникальных строк
        //если она там есть, то ссылка на ту строку будет присвоена в переменную s1
        //если нет, то строка будет создана в пуле уникальных строк и ссылка на нее
        //будет присвоена в переменную s1
        String s1 = "Cat";  // #FFHHEE : "Cat"
        String s2 = "Cat";  // #FFHHEE : "Cat"

        String s3 = new String("Cat"); // #HHEEHH : "Cat"

        String s4 = s3.intern(); // помещаем строку в пул уникальных строк // #FFHHEE : "Cat"

        s1 = s1 + "Hello";  // // #FFHHEE : "CatHello" !!!! WRONG
                            //    #FFDDEE : "CatHello"
        int a = 10;
        int b = 10;
        if (a == b) {
            System.out.println("Its equals");
        }

        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        if (s1 == s3) {
            System.out.println("s1 == s3");
        } else {
            System.out.println("s1 != s3");
        }

        if (s1.equals(s3)) {
            System.out.println("s1 == s3");
        } else {
            System.out.println("s1 != s3");
        }
    }
}
