/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

class Solution {
    public ListNode deleteKthElement(ListNode head, int k) {
        // Your code goes here
        if(head==null) return null;
        int c=1;
        ListNode temp=head;
        while(c!=k){
            temp=temp.next;
            c++;
        }

        if(temp==head){
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
            return head;
        }

        if(temp.next==null){
            temp.prev.next=null;
            return head;
        }

        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;

        temp.next=null;
        temp.prev=null;
        return head;
    }
}