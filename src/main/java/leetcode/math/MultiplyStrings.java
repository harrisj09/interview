package leetcode.math;

// https://leetcode.com/problems/multiply-strings/
public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        String larger = num1.length() >= num2.length() ? num1 : num2;
        String smaller = num1.length() >= num2.length() ? num2 : num1;
        if (smaller.equals("0")) {
            return "0";
        }
        String result = "";
        String zeros = "";
        while(!smaller.isEmpty()) {
            String multiply = product(larger, smaller.substring(smaller.length() - 1)) + zeros;
            result = addStrings(result, multiply);
            zeros += "0";
            smaller = smaller.substring(0, smaller.length() - 1);
        }
        return result;
    }

    public String product(String groupNumb, String singleNumb) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int zero = '0';
        int sum;
        while(!groupNumb.isEmpty()) {
            sum = carry;
            int baseNumb = groupNumb.charAt(groupNumb.length() - 1)  - zero;
            groupNumb = groupNumb.substring(0, groupNumb.length() - 1);
            for(int i = 0; i < baseNumb; i++) {
                sum += singleNumb.charAt(0) - zero;
            }
            carry = 0;
            if(sum > 9) {
                carry = sum / 10;
                sum %= 10;
            }
            result.insert(0, sum);
        }
        if(carry > 0) {
            result.insert(0, carry);
        }
        return result.toString();
    }

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