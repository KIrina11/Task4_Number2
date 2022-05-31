package Tests;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.kislova_i_v.BinaryInsertionSort;
import ru.vsu.cs.kislova_i_v.InsertionSort;

public class Tests {
    @Test
    public void simpleTestInsertionSort() {
        InsertionSort insertionSort = new InsertionSort(0, 0);

        int[] array = {10, 8, 6, 9, 5, 4, 2, 1, 3, 7};

        insertionSort.sort(array);

        int[] resultArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Assert.assertArrayEquals(array, resultArray);
    }

    @Test
    public void testInsertionSortWithZero() {
        InsertionSort insertionSort = new InsertionSort(0, 0);

        int[] array = {0, 14, 0, 2345, 64, 87, 4098, 0, 0, 567, 32, 0};

        insertionSort.sort(array);

        int[] resultArray = {0, 0, 0, 0, 0, 14, 32, 64, 87, 567, 2345, 4098};

        Assert.assertArrayEquals(array, resultArray);
    }

    @Test
    public void simpleTestBinaryInsertionSort() {
        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort(0, 0);

        int[] array = {10, 8, 6, 9, 5, 4, 2, 1, 3, 7};

        binaryInsertionSort.sort(array);

        int[] resultArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Assert.assertArrayEquals(array, resultArray);
    }

    @Test
    public void testBinaryInsertionSortWithNegativeNumbers() {
        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort(0, 0);

        int[] array = {-123, -5, 0, 45, 5, 123, 0, -345, -3, 3, 10};

        binaryInsertionSort.sort(array);

        int[] resultArray = {-345, -123, -5, -3, 0, 0, 3, 5, 10, 45, 123};

        Assert.assertArrayEquals(array, resultArray);
    }
}
