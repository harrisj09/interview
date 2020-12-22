package leetcode.todo;

// https://leetcode.com/problems/sort-list/
public class SortList {
    public ListNode sortList(ListNode head) {
        return null;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
