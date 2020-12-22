package leetcode.sort;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged =  new int[m + n];
        int numOneIndex = 0;
        int numTwoIndex = 0;
        int i = 0;
        while (i < (m + n)) {
            if(numOneIndex == m || numTwoIndex == n) {
                if (numOneIndex == m) {
                    merged[i] = nums2[numTwoIndex];
                    numTwoIndex++;
                }
                else {
                    merged[i] = nums1[numOneIndex];
                    numOneIndex++;
                }
            }
            else {
                if(nums1[numOneIndex] < nums2[numTwoIndex]) {
                    merged[i] = nums1[numOneIndex];
                    numOneIndex++;
                }
                else {
                    merged[i] = nums2[numTwoIndex];
                    numTwoIndex++;
                }
            }
            i++;
        }
        System.arraycopy(merged, 0, nums1, 0, nums1.length);
        System.out.println(Arrays.toString(nums1));
    }
}
