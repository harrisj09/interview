package leetcode.datastructures;

// https://leetcode.com/problems/plus-one/
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        digits[index] = digits[index] + 1;
        if(digits[index] < 10) {
            return digits;
        }
        int carry = 1;
        digits[index] = digits[index] % 10;
        index--;
        while (index >= 0) {
            digits[index] = digits[index] + 1;
            if (digits[index] < 10) {
                return digits;
            }
            digits[index] = digits[index] % 10;
            carry = 1;
            index--;
        }
        int[] a = new int[digits.length + 1];
        a[0] = carry;
        System.arraycopy(digits, 0, a, 1, digits.length);
        return a;
    }
}
