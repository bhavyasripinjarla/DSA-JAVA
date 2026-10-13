/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */
class ListNode {
    int val;
    ListNode next;

}
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        //find middle
        ListNode t=head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse the middle to last

        ListNode prev=null;
        ListNode temp=slow.next;
        while(temp!=null){
            ListNode carry=temp.next;
            temp.next=prev;
            prev=temp;
            temp=carry;
        }
        // check it palindrome or not
        while(prev!=null){
            if(t.val!=prev.val) return false;
            t=t.next;
            prev=prev.next;
        }
        return true;
    }
}