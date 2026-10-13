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
    public ListNode insertBeforeTail(ListNode head, int X) {
        // Your code goes here
        ListNode node =new ListNode(X);
        if(head==null) return node;
        if(head.next==null){
            node.next=head;
            head.prev=node;
            return node;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        node.prev=temp.prev;
        temp.prev.next=node;

        node.next=temp;
        temp.prev=node;
        return head;
    }
}
