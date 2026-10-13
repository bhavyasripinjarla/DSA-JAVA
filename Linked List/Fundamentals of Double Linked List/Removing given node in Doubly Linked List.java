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
    public void deleteGivenNode(ListNode temp) {
        // Your code goes here
        // ListNode temp=node;
        // while(temp.prev!=null){
        //     temp=temp.prev;
        // }
        // ListNode head=temp;
        // while(temp!=node){
        //     temp=temp.next;
        // }

        if(temp.next==null){
            temp.prev.next=null;
            return;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.prev=null;
        temp.next=null;
    }
}