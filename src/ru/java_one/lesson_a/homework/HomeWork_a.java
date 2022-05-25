package ru.java_one.lesson_a.homework;

public class HomeWork_a {
    //Написать метод вычисляющий выражение a*(b+(c/d)) и возвра-
    //щающий результат с плавающей точкой, где a,b,c,d - целочис-
    //ленные параметры этого метода.
    public static float number(int a, int b, int c, int d){
        return a * (b + (c * 1.0f / d));

}
    //Написать метод, принимающий на вход два числа, проверя-
//    ющий что их сумма лежит в пределах  от 10 до 20( включительно),
//    если да - вернуть true, иначе - false
    public static boolean numberXY(int a, int b){
        int sum = a + b;
        if(sum >= 10 & sum <= 20){
            return true;
        }else return false;
    }

//    Написать метод которому в качестве параметра переда-
//    ётся целое число, метод должен проверить положетельное
//    ли число передали, или отрицательное. Замечание: ноль
//    считается положительным числом. Результат вывести в консоль
    public static void numberX(int a){
        if(a >= 0){
            System.out.println("Вы ввели положительное число " + a);
        }else System.out.println("Вы ввели отрицательное число " + a);
    }

//    Написать метод которому в качестве параметра передается
//    строка, обозначающая имя, метод должен вернуть привет-
//    ственное сообщение "Привет, переданное_имя".
//    Вывести в консоль
    public static String hello(String name){
        return "Привет, "+ name +"!";
    }

    public static void year(int year){
        if(!(year % 4 == 0) || ((year%100 == 0) && !(year%400 == 0))) {
            System.out.println("Год не високосный");
        } else System.out.println("Год високосный");

    }

    public static void main(String[] args){
        System.out.println("a*(b+(c/d)) = " + number(2,3,4,5));
        System.out.println(numberXY(4,5));
        numberX(0);
        System.out.println(hello("Alex"));
        year(104);
    }
}
