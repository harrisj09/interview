package algorithms.sort;

public class QuickSort {

    /*
    Original Array: [0, -1, 6, 8, 0, 5, 1]
0
Smaller: 0
-1
Smaller: -1
6
8
0
Smaller: 0
5
Pivot is: 1
Sorted Array: [0, -1, 0, 1, 6, 5, 8]
0
-1
Smaller: -1
Pivot is: 0
Sorted Array: [-1, 0, 0, 1, 6, 5, 8]
6
Smaller: 6
5
Smaller: 5
Pivot is: 8
Sorted Array: [-1, 0, 0, 1, 6, 5, 8]
6
Pivot is: 5
Sorted Array: [-1, 0, 0, 1, 5, 6, 8]

Sorted Array: [-1, 0, 0, 1, 5, 6, 8]
     */

    public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            System.out.println(arr[j]);
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}
