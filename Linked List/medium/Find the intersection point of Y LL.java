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

class Solution {
    public int length(ListNode head){
        if(head==null) return 0;
        if(head.next==null) return 1;
        int c=0;
        while(head!=null){
            head=head.next;
            c++;
        }
        return c;

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=length(headA);
        int l2=length(headB);
        if(l1>l2){
            int n=l1-l2;
            for(int i=0;i<n;i++){
                headA=headA.next;
            }
        }else{
            int n=l2-l1;
            for(int i=0;i<n;i++){
                headB=headB.next;
            }
        }
        while(headA!=null && headB!=null){
            if(headA==headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}
