package ru.java_one.lesson_b.homework_b;

import java.util.Arrays;

public class HomeWork_b {
    private static void swap(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 1) {
                array[i] = 0;
            } else array[i] = 1;
        }
    }

    private static void fulling(int[] array, int shift, int step) {
        for(int i = 0; i < array.length; i++) {
            array[i] = i * step + shift;
        }
    }

    private static void multi(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] < 6) array[i] *= 2;
        }
    }

    private static int findMax(int[] array) {
        int index = array[0];
        for(int i = 1; i < array.length; i++) {
            if(index < array[i]) index = array[i];
        }
        return index;
    }

    private static int findMin(int[] array) {
        int result = array[0];
        for(int i = 1; i < array.length; i++) {
            if(result > array[i]) result = array[i];
        }
        return result;
    }

    private static void crossFill(int[][] array) {
        for(int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
    }

    private static boolean checkBalance(int[] array){
        int sum = 0;
        int left = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length - 1; i++) {
            sum -= array[i];
            left += array[i];
            if (sum == left)
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
//        1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий
//        в принятом массиве 0 на 1, 1 на 0;
//        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        System.out.println(Arrays.toString(arr));
//        swap(arr);
//        System.out.println(Arrays.toString(arr));

//        2. Задать пустой целочисленный массив размером 8. Написать метод,
//        который с помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
//        int[] array_2 = new int[8];
//        fulling(array_2, 1,3);
//        System.out.println(Arrays.toString(array_2));


//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
//        принимающий на вход массив и умножающий числа меньше 6 на 2;
//        int[] array_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        multi(array_3);
//        System.out.println(Arrays.toString(array_3));

//        4. Задать одномерный массив. Написать методы поиска в нём минималь-
//        ного и максимального элемента;
//        int[] arr = {4,88,23,47,34,24,8,110,44,53,1001,4759,83476};
//
//        System.out.println("Максимальное число "+findMax(arr));
//        System.out.println("Минимальное число "+findMin(arr));

//        5. * Создать квадратный целочисленный массив (количество строк и
//        столбцов одинаковое), заполнить его диагональные элементы едини-
//        цами, используя цикл(ы);
//        int[][] array_4 = new int[3][3];
//        crossFill(array_4);
//        for(int y = 0; y < array_4.length; y++) {
//            System.out.println(Arrays.toString(array_4[y]));
//        }


//        6 ** Написать метод, в который передается не пустой одномерный
//        целочисленный массив, метод должен вернуть true если в массиве
//        есть место, в котором сумма левой и правой части массива равны.
//        Примеры:
//        checkBalance([1, 1, 1, || 2, 1]) → true,
//        checkBalance ([2, 1, 1, 2, 1]) → false,
//        checkBalance ([10, || 1, 2, 3, 4]) → true.
//        Абстрактная граница показана символами ||, эти символы в массив не входят.
        System.out.println("T: " + checkBalance(new int[] {1,2,3,5,5,3}));
        System.out.println("T: " + checkBalance(new int[] {1,1,1,2,1}));
        System.out.println("T: " + checkBalance(new int[] {3,5,5,3}));









//        7 *** Написать метод, которому на вход подаётся одномерный массив и
//        число n (может быть положительным, или отрицательным), при этом
//        метод должен циклически сместить все элементы массива на n позиций.


//        8 **** Не пользоваться вспомогательным массивом при решении задачи 7.
    }
}
