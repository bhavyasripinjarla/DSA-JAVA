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
import java.util.*;
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode() {}
    public ListNode(int data) {
        this.data = data;
    }
    public ListNode(int data, ListNode prev, ListNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
@SuppressWarnings("unused")
class Solution {
    public ListNode arrayToDoublyLinkedList(List<Integer> arr) {
        // Your code goes here
        if (arr.isEmpty()) return null;
        ListNode head=new ListNode(arr.get(0));
        head.prev=null;
        ListNode temp=head;
        for(int i=1;i<arr.size();i++){
            ListNode n=new ListNode(arr.get(i));
            temp.next=n;
            n.prev=temp;
            temp=temp.next;
        }
        return head;
    }
}