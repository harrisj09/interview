package algorithms;

import algorithms.sort.BubbleSort;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BubbleSortTest {

    @Test
    public void test() {
        BubbleSort sort = new BubbleSort();
        int[] a = {5, 1, 8, 2, 7, 4, 9, 3, 5, 1, 5};
        int[] sorted = new int[a.length];
        sort.sort(a);
        assertTrue(sort.isSorted(sorted));
    }
}