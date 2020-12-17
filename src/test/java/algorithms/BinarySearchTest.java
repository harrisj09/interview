package algorithms;

import algorithms.search.BinarySearch;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    public void find() {
        BinarySearch binarySearch = new BinarySearch();
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(3, binarySearch.search(a, 4));
    }
}
