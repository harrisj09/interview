package leetcode.math;

// https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec
public class Persist {
    public static int persistence(long n) {
        if(n < 10) {
            return 0;
        }
        int counter = 0;
        while(n > 9) {
            n = reduceLong(n);
            counter++;
        }
        return counter;
    }

    public static long reduceLong(long n) {
        long multipleHolder = 1;
        while(n != 0) {
            multipleHolder *= n % 10;
            n /= 10;
        }
        return multipleHolder;
    }
}