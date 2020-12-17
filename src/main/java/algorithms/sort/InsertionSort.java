package algorithms.sort;

public class InsertionSort {

    public int[] sort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    private void swap(int[] a, int counter) {
        int temp = a[counter - 1];
        a[counter - 1] = a[counter];
        a[counter] = temp;
    }
}
