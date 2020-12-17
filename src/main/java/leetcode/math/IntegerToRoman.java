package leetcode.math;

import java.util.HashMap;

//https://leetcode.com/problems/integer-to-roman/
public class IntegerToRoman {

    public String intToRoman(int numb) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        System.out.println(Math.pow(10, 2));
        return M[numb / 1000] + C[(numb % 1000) / 100] + X[(numb % 100) / 10] + I[numb % 10];
    }
}
