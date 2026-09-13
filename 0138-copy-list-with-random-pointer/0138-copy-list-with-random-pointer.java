/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return head;

        Node newHead = new Node(head.val);
        Node temp1 = head.next, temp2 = newHead;
        while (temp1 != null){

            Node newNode = new Node(temp1.val);
            temp2.next = newNode;
            temp1 = temp1.next; 
            temp2 = temp2.next;
    
        }
        temp1 = head;
        temp2 = newHead;
        while (temp1 != null){
            if (temp1.random == null) temp2.random = null;
            else {
                Node temp3 = newHead, temp4 = head;
                while (temp1.random != temp4){
                    temp4 = temp4.next;
                    temp3 = temp3.next;
                }
                temp2.random = temp3;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;

        }
        return newHead;
    }
}