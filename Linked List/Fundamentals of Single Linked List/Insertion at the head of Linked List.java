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
    public ListNode insertAtHead(ListNode head, int X) {
        //YOUR CODE GOES HERE
        ListNode temp=new ListNode(X);
        if(head==null) return temp;
        temp.next=head;
        return temp;
    }
}