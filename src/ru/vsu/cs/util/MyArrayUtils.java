package ru.vsu.cs.util;

import java.util.Random;
import java.util.Scanner;

public class MyArrayUtils {
    public static int[] enterArray() {
        System.out.println("Введите количество элементов массива: ");
        Scanner scanner = new Scanner(System.in);
        int countElements = scanner.nextInt();

        System.out.println("Введите " + countElements + " элементов массива: ");

        int[] array = new int[countElements];
        for (int i = 0; i < countElements; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array, String nameSort) {
        if (nameSort == "сортировка простыми вставками") {
            System.out.print("Результат сортировки массива простыми вставками: ");
        } else {
            System.out.print("Результат сортировки массива бинарными вставками: ");
        }

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }

    public static int[] setRandomArray(int numberElements, int arraySize) {
        Random rnd = new Random();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = rnd.nextInt(numberElements) + 1;
        }
        return array;
    }

    public static int[] setArr() {
        Random rnd = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(50) + 1;
        }
        return array;
    }
}
