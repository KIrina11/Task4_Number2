package ru.vsu.cs.kislova_i_v;

public class InsertionSort implements Sort{

    private int comparisonNumber;
    private int exchangesNumber;

    public InsertionSort(int comparisonNumber, int exchangesNumber) {
        this.comparisonNumber = comparisonNumber;
        this.exchangesNumber = exchangesNumber;
    }

    @Override
    public void sort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size; i++) {
            this.comparisonNumber++;
            int value = array[i];

            int j;
            for (j = i - 1; j >= 0 && array[j] > value; j--) {
                array[j + 1] = array[j];
                this.exchangesNumber++;
            }

            array[j + 1] = value;
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
