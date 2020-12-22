package leetcode.string;

// https://leetcode.com/problems/add-binary/
public class AddBinary {

    public String addBinary(String a, String b) {
        String result = "";
        int carry = 0;
        int sum;
        while(a.length() + b.length() != 0) {
            sum = carry;
            carry = 0;
            if (!a.isEmpty()) {
                sum += Integer.parseInt(a.charAt(a.length() - 1) + "");
                a = a.substring(0, a.length() - 1);
            }
            if (!b.isEmpty()) {
                sum += Integer.parseInt(b.charAt(b.length() - 1) + "");
                b = b.substring(0, b.length() - 1);
            }
            if(sum > 1) {
                sum -= 2;
                carry = 1;
            }
            result = sum + result;
        }
        if (carry != 0) {
            return "1" + result;
        }
        return result;
    }
}