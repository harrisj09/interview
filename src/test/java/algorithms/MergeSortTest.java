package algorithms;

import algorithms.sort.MergeSort;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeSortTest {

    @Test
    public void test() {
        MergeSort sort = new MergeSort();
        int[] a = {5, 1, 8, 2, 7, 4, 9, 3, 5, 1, 5};
        int[] sorted = new int[a.length];
        sort.sort(a, sorted, 0, a.length - 1);
        assertTrue(sort.isSorted(sorted));
    }
}
