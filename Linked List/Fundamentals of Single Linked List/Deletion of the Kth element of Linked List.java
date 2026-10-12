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
@SuppressWarnings("unused")
class Solution {
    public ListNode deleteKthNode(ListNode head, int k) {
        // Your code goes here
        int count=1;
        if(head==null) return head;
        if(k==1) return head.next;
        ListNode temp=head;
        ListNode prev=temp;
        while(temp!=null && count!=k){
            prev=temp;
            temp=temp.next;
            count++;
        }
        if(temp!=null){
            prev.next=temp.next;
        }
        return head;
    }
}