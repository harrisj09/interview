package leetcode.search;

public class SearchInsert {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 2, 5, 7}, 3));
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int midpoint;
        while (low < high) {
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
