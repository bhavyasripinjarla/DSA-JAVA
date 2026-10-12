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

class Solution {
    public ListNode insertAtTail(ListNode head, int X) {
        //YOUR CODE GOES HERE
        ListNode temp=new ListNode(X);
        if(head==null) return temp;
        ListNode t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
        temp.next=null;
        return head;
    }
}