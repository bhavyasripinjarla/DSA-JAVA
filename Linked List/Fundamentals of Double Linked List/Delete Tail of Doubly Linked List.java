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
    public ListNode deleteTail(ListNode head) {
        // Your code goes here
        if(head==null || head.next==null) return null;
        ListNode temp=head;
        
        while(temp.next!=null){
            temp=temp.next;
        }
        if(temp.next==null){
            temp.prev.next=null;
        }
        return head;
    }
}