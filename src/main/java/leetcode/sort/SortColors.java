package leetcode.sort;

import java.util.Arrays;

// https://leetcode.com/problems/sort-colors/
public class SortColors {

    public void sortColors(int[] nums) {
        if(nums.length <= 1) {
            return;
        }
        int[] countNums = new int[3];
        for (int num : nums) {
            countNums[num] = countNums[num] + 1;
        }
        int i = 0;
        int index = 0;
        int counter = 0;
        while (index < 3) {
            if(counter < countNums[index]) {
                nums[i] = index;
                counter++;
                i++;
            } else {
                index++;
                counter = 0;
            }
        }
    }
}
