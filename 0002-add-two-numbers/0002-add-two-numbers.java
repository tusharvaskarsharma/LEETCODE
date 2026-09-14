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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.next == null && l1.val == 0) return l2;
        if (l2.next == null && l2.val == 0) return l1;

        int sum = l1.val + l2.val;
        int digit = sum % 10;
        int carry = sum / 10;

        ListNode newHead = new ListNode(digit);
        ListNode t1 = l1.next, t2 = l2.next, t3 = newHead;

        while (t1 != null || t2 != null) {
            int val1 = 0;
            int val2 = 0;

            if (t1 != null) val1 = t1.val;
            if (t2 != null) val2 = t2.val;

            sum = val1 + val2 + carry;
            digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            t3.next = newNode;
            t3 = t3.next;

            if (t1 != null) t1 = t1.next;
            if (t2 != null) t2 = t2.next;
        }

        if (carry != 0) t3.next = new ListNode(carry);
        return newHead;
    }
}
