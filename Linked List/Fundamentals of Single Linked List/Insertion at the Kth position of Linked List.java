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
    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
        //YOUR CODE GOES HERE
        ListNode n=new ListNode(X);
        if(head==null) return n;
        if(K==1){
            n.next=head;
            return n;
        }
        int c=1;
        ListNode temp=head;
        ListNode prev=temp;
        while(temp!=null && c!=K){
            prev=temp;
            temp=temp.next;
            c++;
        }
        prev.next=n;
        n.next=temp;
        return head;

    }
}