
// /*Definition for Singly Linked List
// class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {
//         val = 0;
//         next = null;
//     }

//     ListNode(int data1) {
//         val = data1;
//         next = null;
//     }

//     ListNode(int data1, ListNode next1) {
//         val = data1;
//         next = next1;
//     }
// }
//  */

// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         if(head==null) return head;
//         if(n==1 && head.next==null) return null;
//         int c=0;
//         ListNode temp=head;
//         while(temp!=null){
//             temp=temp.next;
//             c++;
//         }
//         int k=c-n+1;
//         if(k==1) return head.next;
//         if(k==0) return head;
//         c=1;
//         ListNode prev=head;
//         temp=head;
//         while(c!=k){
//             prev=temp;
//             temp=temp.next;
//             c++;
//         }
//         if(temp!=null){
//             prev.next=temp.next;
//             temp.next=null;
//         }
//         return head;

//     }
// }
/*Definition for Singly Linked List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode slow=temp;
        ListNode fast=temp;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return temp.next;

    }
}