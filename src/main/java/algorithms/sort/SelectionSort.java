package algorithms.sort;

public class SelectionSort {

    public int[] sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            swap(a, i, smallestIndex);
        }
        return a;
    }

    public void swap(int[] a, int swapIndex, int smallestIndex) {
        int temp = a[swapIndex];
        a[swapIndex] = a[smallestIndex];
        a[smallestIndex] = temp;
    }
}