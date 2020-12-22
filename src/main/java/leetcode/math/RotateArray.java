package leetcode.math;

// https://leetcode.com/problems/rotate-array/
public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(a, 0, nums, 0, a.length);
        return a;
    }
}
