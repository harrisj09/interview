package leetcode.sort;

// https://leetcode.com/problems/relative-sort-array/
public class RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];
        int index = 0;
        int arrayCounter = 0;
        while(index < arr2.length) {
            int numb = arr2[index];
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] == numb) {
                    arr1[i] = -1;
                    arr[arrayCounter] = numb;
                    arrayCounter++;
                }
            }
            index++;
        }
        return fillInValues(arr1, arr, arrayCounter);
    }

    public int[] fillInValues(int[] arr1, int[] arr, int index) {
        int indexStart = index;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] > -1) {
                arr[index] = arr1[i];
                index++;
            }
        }
        for (int i = indexStart; i < arr.length; i++) {
            int smallest = arr[i];
            int smallestIndex = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < smallest) {
                    smallest = arr[j];
                    smallestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
        return arr;
    }
}
