package leetcode.sort;

public class SortArrayByParityII {

    // https://leetcode.com/problems/sort-array-by-parity-ii/submissions/
    public int[] sortArrayByParityII(int[] A) {
        if(A.length <= 1) {
            return A;
        }
        int[] sorted = new int[A.length];
        int evenIndex = 0;
        int oddIndex = 1;
        for(int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0) {
                sorted[evenIndex] = A[i];
                evenIndex += 2;
            } else {
                sorted[oddIndex] = A[i];
                oddIndex += 2;
            }
        }
        return sorted;
    }
}
