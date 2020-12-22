package leetcode.math;

public class SumOfDigits {
    // https://www.codewars.com/kata/541c8630095125aba6000c00
    public static int digital_root(int n) {
        int sum = 0;
        if(n < 10) {
            return n;
        }
        for(int i = n; i > 0; i/=10) {
            sum += i % 10;
        }
        return digital_root(sum);
    }
}