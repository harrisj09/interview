package algorithms.sort;

public class BubbleSort {

    public int[] sort(int[] a) {
        if (a.length == 1) {
            return a;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
