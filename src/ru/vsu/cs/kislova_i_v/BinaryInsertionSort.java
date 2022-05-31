package ru.vsu.cs.kislova_i_v;

import java.util.Arrays;

public class BinaryInsertionSort implements Sort{
    private int comparisonNumber;
    private int exchangesNumber;

    public BinaryInsertionSort(int comparisonNumber, int exchangesNumber) {
        this.comparisonNumber = comparisonNumber;
        this.exchangesNumber = exchangesNumber;
    }

    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];

            // Найти место для вставки с помощью бинарного поиска
            int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);
            this.comparisonNumber += j;

            // Смещение массива в одну позицию вправо
            System.arraycopy(array, j, array, j+1, i-j);
            this.exchangesNumber += j;

            // Размещение элемента в правильном месте
            array[j] = x;
            this.exchangesNumber++;
        }
    }

    @Override
    public int getComparisonNumber() {
        return comparisonNumber;
    }

    @Override
    public int getExchangesNumber() {
        return exchangesNumber;
    }
}