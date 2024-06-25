//полный путь до нашего класса(файла на диске), структура папок
package com.telran.org.lessonone;

//UpperCamelCase - правило названия классов
// myApp // myapp _my // !!!! incorrect
// BookStorage // correct

//public - модификатор доступа
//class - определяет что это (class, interface, enum etc)
//MyApp - имя класса, совпадающее с именем файла на диске
//Файл на диске будет называться MyApp.java
public class MyApp {  // {тело класса}

    //Точка входа в приложение
    //public - модификатор доступа, доступен везде
    //static - не требует создание объекта
    //void - данный метод ничего не возвращает
    //Параметры пример:
    //to javac.exe MyApp.java -> MyApp.class(byte code) -> JVM - RUN MyApp.class
    //(MyApp.class ~~ MyApp.exe) java MyApp.class "Helo"
    public static void main(String[] args) { // { тело метода }
        //Выводит текст в консоль
        System.out.println("Hello Java!");
        System.out.println("Hello QA");
        System.out.println("Hello FE");
        //Hello QA
        //Hello FE
    }
    //Приложение состоит из классов, внутри классов находятся методы,
    //внутри методов находится код
}
