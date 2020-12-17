package algorithms;

import algorithms.sort.InsertionSort;
import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest {

    @Test
    public void sortTest() {
        InsertionSort insertionSort = new InsertionSort();
        int[] a = {4, 1, 8, 23, 5};
        a = insertionSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
