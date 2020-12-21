package leetcode.math;

// https://leetcode.com/problems/add-strings/
public class AddStrings {

    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int zero = '0';
        int sum;
        int carry = 0;
        int num1Index = num1.length() - 1;
        int num2Index = num2.length() - 1;
        while(num1Index > -1 || num2Index > -1) {
            sum = carry;
            if(num1Index > -1) {
                sum += num1.charAt(num1Index) - zero;
                num1Index--;
            }
            if(num2Index > -1) {
                sum += num2.charAt(num2Index) - zero;
                num2Index--;
            }
            carry = 0;
            if(sum > 9) {
                sum %= 10;
                carry = 1;
            }
            result.insert(0, sum);
        }
        if(carry == 1) {
            result.insert(0, "1");
        }
        return result.toString();
    }
}