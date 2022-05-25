package ru.java_one.lesson_b;

import java.util.Arrays;

public class Main {
    private static double calculate(int a, int b, int c, int d) {
        return a * (b + (c * 1.0f / d));
    }

    public static double calculate(int a, int b, int c) {
        a = 10;
        return 1;
    }

    private static float calculate(float a, float b, float c, float d) {
        return 0;
    }

    private static int power(int base, int sign) {
        int result = 1;

        for (int i = 0; i < sign; i++)
            result *= base;

        return result;
    }

    private static void pifagor(int rows, int cols) {
        for (int y = 1; y < rows; y++) {
            for (int x = 1; x < cols; x++) {
                System.out.printf("%7d", x * y);
            }
            System.out.println();
        }
    }

    private static void postConditionExample() {
        // cycles
        int i = 0;
        do {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
//            if (i == 5) break;
        } while (i < 10);
    }

    private static void forExample() {
        //  for
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println(power(2, 10));

        pifagor(10, 10);
    }

    private static void whileExample() {
        //  while
        int i = 0;
        while (i < 5) {
            System.out.print(++i + " ");
        }
    }

    private static void switchExample() {
        // switch
        String recipient = "sergei";
        switch(recipient) {
            case "ivan":
                System.out.println("sent to desk #5");
                break;
            case "petr":
                System.out.println("sent to desk #15");
                break;
            case "vasiliy":
                System.out.println("sent to desk #40");
                break;
            default:
                System.out.println("none of names matched");
        }
    }

    private static void select() {
        int a;
        int b = 5;
        int c = 10;
//        if (b > c) {
//            a = b;
//        } else {
//            a = c;
//        }
        a = (b > c) ? b : c;
    }

    public static void main(String[] args) {
        // multi-dimensional arrays
        int i;
        int[] a;
        char[][] arr = new char[2][];
        arr[0] = new char[3];
        arr[1] = new char[7];
        int[][][] cube;

        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {

            }
        }

        int[][] preset = {
                {1,2,3,4,5},
                {5,6,7,8,9}
        };
        System.out.println(Arrays.deepToString(preset));
    }

    private static void arraysExample() {
        // arrays
        int[] arr = new int[7];
        arr[0] = 5;
        arr[1] = 7;
        //...
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
//        System.out.println(Arrays.toString(arr));
//
//        String[] words = {"Hello", "Java", "World", null, null, "Vasya"};
//        System.out.println(Arrays.toString(words));
        int[] arr2 = arr;
        arr2[0] = 10;
        System.out.println(Arrays.toString(arr));
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

