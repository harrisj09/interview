package leetcode.search;

//
public class FirstBadVersion {


    static class VersionControl {
        public boolean isBadVersion(int version) {
            return false;
        }
    }
    static class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int low = 0;
            int high = n;
            int midpoint= (high + low) / 2;
            int badIndexLeft = binarySearch(low, midpoint);
            int badIndexRight = binarySearch(midpoint + 1, high);
            if(badIndexLeft != -1) {
                return badIndexLeft;
            }
            return badIndexRight;
        }

        public int binarySearch(int low, int high) {
            int midpoint = (low + high) / 2;
            if(isBadVersion(midpoint)) {
                return midpoint;
            }
            if(low >= high) {
                return -1;
            }
            return Math.max(binarySearch(low, midpoint), binarySearch(midpoint + 1, high));
        }
    }
}
