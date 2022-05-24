package ru.java_one.lesson_a;
//this first comment
/**
 * doc comment
*/
public class HelloWorld {

    public static void printHello(){
        System.out.println("Hello World");
    }

    public static void printHuman(String name, int age){
        System.out.println("Hello " + name +" мне "+ age+ " лет!");
    }

    public static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        int i = 2147000000;
        long l = 4147000000L;

        float f = 1.567f;
        double d = 3.543;

        float a = 10;
        int b = 3;

        System.out.println(a / b);

        int fieldSizeX = 3;
        int userNumber = 7;

        boolean result = fieldSizeX <= userNumber;
        if(result || fieldSizeX < 0){
            System.out.println("out of range");
        }else {
            System.out.println("you hit the " + userNumber);
        }

        printHello();
        printHuman("Alex", 33);

        System.out.println(sum(4,5));



    }
}
