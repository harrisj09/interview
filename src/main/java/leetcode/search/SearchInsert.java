package leetcode.search;

// https://leetcode.com/problems/search-insert-position/
public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int midpoint;
        while (low <= high) {
            midpoint = (low + high) / 2;
            if(nums[midpoint] == target) {
                return midpoint;
            }
            if(nums[midpoint] > target) {
                high = midpoint - 1;
            } else {
                low =  midpoint + 1;
            }
        }
        return low;
    }
}
