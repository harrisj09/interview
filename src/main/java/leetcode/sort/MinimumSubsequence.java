package leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
public class MinimumSubsequence {

    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int total = 0;
        for(int i = nums.length - 1; i >= 0; i--) {
            list.add(nums[i]);
            total += nums[i];
            if(total > arrayTotal(nums, i)) {
                return list;
            }
        }
        return list;
    }

    int arrayTotal(int[] a, int index) {
        int total = 0;
        for(int i = 0; i < index; i++) {
            total += a[i];
        }
        return total;
    }
}
