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
    ListNode(int x) { data = x; next = null; }
}
class Solution {
    public ListNode insertBeforeX(ListNode head, int X, int val) {
        //YOUR CODE GOES HERE
        ListNode n=new ListNode(val);
        if(head==null) return n;
        if(head.data==X){
            n.next=head;
            return n;
        }
        ListNode temp=head;
        ListNode prev=temp;
        while(temp!=null && temp.data!=X){
            prev=temp;
            temp=temp.next;
        }
        if(temp!=null){
            prev.next=n;
            n.next=temp;
        }
        return head;
    }
}