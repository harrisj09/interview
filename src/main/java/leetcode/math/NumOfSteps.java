package leetcode.math;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NumOfSteps {

    public int numberOfSteps (int num) {
        int steps = 0;
        if (num == 0) {
            return steps;
        }
        if(num % 2 == 0) {
            steps++;
            num /= 2;
            return steps + numberOfSteps(num);
        }
        steps++;
        num--;
        return steps + numberOfSteps(num);
    }
}
