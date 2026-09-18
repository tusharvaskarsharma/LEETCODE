class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dmy = new ListNode(0);
        dmy.next = head;
        ListNode prev = dmy;

        for (int i = 1; i < left; i++) prev = prev.next;
        ListNode cur = prev.next;

        for (int i = 0; i < right - left; i++) {
            ListNode nxt = cur.next;
            cur.next = nxt.next;
            nxt.next = prev.next;
            prev.next = nxt;
        }

        return dmy.next;
    }
}