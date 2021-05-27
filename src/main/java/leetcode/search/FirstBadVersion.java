package leetcode.search;

// https://leetcode.com/problems/first-bad-version/
public class FirstBadVersion {

    static class VersionControl {
        int badVersion = 751;
        public boolean isBadVersion(int version) {
            return version >= badVersion;
        }
    }
    static class Solution extends VersionControl {

        public int firstBadVersion(int n) {
            return search(1, n);
        }

        public int search(int i, int j){
            int n = i + (j - i) / 2;
            if(i >= j) {
                return i;
            }
            if(isBadVersion(n)) {
                return search(i, n);
            } else {
                return search(n + 1, j);
            }
        }
    }

    static class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.firstBadVersion(100000));
        }
    }
}
