/*
class ListNode {
    int data;
    ListNode prev, next;
    ListNode(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}
*/

class Solution {
    public ListNode reverseDLL(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp=head;
        ListNode rev=null;
        while(temp!=null){
            rev=temp.prev;
            temp.prev=temp.next;
            temp.next=rev;
            rev=temp;
            temp=temp.prev;
        }
        return rev;
    }
}
