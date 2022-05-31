package ru.vsu.cs.kislova_i_v;

import ru.vsu.cs.util.MyArrayUtils;

public class Program {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort(0, 0);
        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort(0, 0);

        int[] arrayForInsertionSort = MyArrayUtils.enterArray();
        insertionSort.sort(arrayForInsertionSort);

        MyArrayUtils.printArray(arrayForInsertionSort, "сортировка простыми вставками");
        System.out.println("Количество сравнений = " + insertionSort.getComparisonNumber() + "\n"
                + "Количество обменов = " + insertionSort.getExchangesNumber());

        int[] arrayForBinaryInsertionSort = MyArrayUtils.enterArray();
        binaryInsertionSort.sort(arrayForBinaryInsertionSort);

        MyArrayUtils.printArray(arrayForBinaryInsertionSort, "сортировка бинарными вставками");
        System.out.println("Количество сравнений = " + binaryInsertionSort.getComparisonNumber() + "\n"
                + "Количество обменов = " + binaryInsertionSort.getExchangesNumber());
    }
}
