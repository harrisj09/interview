package leetcode.sort;

import java.util.Arrays;

// https://leetcode.com/problems/sort-colors/
public class SortColors {

    // Selection sort
    public void sortColors(int[] nums) {
        if(nums.length <= 1) {
            return;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int index = i;
            int smallest = nums[i];
            for (int j = i; j < nums.length; j++) {
                if(nums[j] < smallest) {
                    smallest = nums[j];
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
    }
}
