package algorithms.search;

public class BinarySearch {

    private static final int NOT_FOUND_INDEX = -1;

    public int search(int[] a, int value) {
        int leftPivot = 0;
        int rightPivot = a.length - 1;
        while (leftPivot <= rightPivot) {
            int middlePivot = getMiddlePivot(leftPivot, rightPivot);
            int middleElement = a[middlePivot];
            if (middleElement == value) {
                return middlePivot;
            }
            if (middleElement < value) {
                leftPivot = middlePivot + 1;
            } else {
                rightPivot = middlePivot - 1;
            }
        }
        return NOT_FOUND_INDEX;
    }

    private int getMiddlePivot(int leftPivot, int rightPivot) {
        return leftPivot + (rightPivot - leftPivot) / 2;
    }
}
