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
    ListNode next;
}
@SuppressWarnings("unused")
 class Solution {
     public int findLengthOfLoop(ListNode head) {
        if(head==null) return 0;
        if(head.next==null) return 0;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                int c=1;
                slow=slow.next;
                while(slow!=fast){
                    slow=slow.next;
                    c++;
                }
                return c;
            }
        }
        return 0;

     }
 }