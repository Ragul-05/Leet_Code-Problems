/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for (int i = 0; i < left - 1; i++) prev = prev.next;
        ListNode l = prev.next;
        ListNode r = l.next;
        for (int i = 0; i < right - left; i++) {
            l.next = r.next;
            r.next = prev.next;
            prev.next = r;
            r = l.next;
        }
        return dummy.next;
    }
}
