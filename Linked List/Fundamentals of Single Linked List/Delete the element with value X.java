/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/
class ListNode{
    public int data;
    public ListNode next;
}
class Solution {
    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        //YOUR CODE GOES HERE
        if(head==null) return head;
        if(head.data==X) return head.next;
        ListNode temp=head;
        ListNode prev=temp;
        while(temp!=null && temp.data!=X){
            prev=temp;
            temp=temp.next;
        }
        if(temp!=null){
            prev.next=temp.next;
        }
        return head;
    }
}