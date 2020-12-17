package algorithms;

import algorithms.sort.MergeSort;
import algorithms.sort.SelectionSort;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelectionSortTest {

    @Test
    public void test() {
        SelectionSort sort = new SelectionSort();
        int[] a = {5, 1, 8, 2, 7, 4, 9, 3, 5, 1, 5};
        int[] sorted = new int[a.length];
        sort.sort(a);
    }
}
