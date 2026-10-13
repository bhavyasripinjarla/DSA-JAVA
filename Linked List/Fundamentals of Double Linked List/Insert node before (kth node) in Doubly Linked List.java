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
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    public ListNode(int data, ListNode prev, ListNode next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    public ListNode(){
        this.data = 0;
        this.prev = null;
        this.next = null;
    }
}
class Solution {
    public ListNode insertBeforeKthPosition(ListNode head, int X, int K) {
        // Your code goes here
        if (K < 1) return head;
        if (head == null) return K == 1 ? new ListNode(X) : null;

        ListNode node = new ListNode(X);
        if (K == 1) {
            node.next = head;
            head.prev = node;
            return node;
        }
        ListNode temp = head;
        int c = 1;
        while (c < K && temp != null) {
            temp = temp.next;
            c++;
        }
        if (temp == null) return head;

        node.prev = temp.prev;
        if (temp.prev != null) {
            temp.prev.next = node;
        }
        node.next = temp;
        temp.prev = node;
        return head;

    }
}