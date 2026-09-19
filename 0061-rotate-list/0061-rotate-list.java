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
    public ListNode rotate(ListNode head){
        ListNode first = head, tail = null, temp = head;
        while (temp.next.next != null) temp = temp.next;
        tail = temp;
        temp = temp.next;
        temp.next = first;
        tail.next = null;
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode newHead = head;
        ListNode temp = head;
        if (k==0) return head;
        if (head==null || head.next == null) return head;
        int count = 0;

        while (temp != null){
            count ++;
            temp = temp.next;
        }

        for(int i=1; i<=k%count; i++){
            newHead = rotate(newHead);
        }
        return newHead;
    }
}