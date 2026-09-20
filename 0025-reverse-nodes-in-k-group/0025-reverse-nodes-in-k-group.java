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
    public ListNode reverseKGroup(ListNode head, int k) {
        int cnt = 0;
        ListNode temp = head;
        
        while(cnt < k){
            if (temp == null) return head;
            cnt++;
            temp = temp.next;
        }

        ListNode preNode = reverseKGroup(temp, k);

        temp = head;
        cnt = 0;
        while (cnt < k){
            ListNode nxt = temp.next;
            temp.next = preNode;
            preNode = temp;
            temp = nxt;
            cnt++;
        }
        return preNode;
    }
}