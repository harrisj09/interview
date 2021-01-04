package leetcode.sort;

import java.util.Arrays;

// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/submissions/
public class ArithmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // this could be solved by finding the minimum of two numbers and doing that
        Arrays.sort(arr);
        int diff = arr[0] - arr[1];
        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i] - arr[i + 1] != diff) {
                return false;
            }
        }
        return true;
    }
}
