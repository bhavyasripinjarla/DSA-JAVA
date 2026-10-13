// /*Definition of singly linked list:
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
//     public int getLength(ListNode head) {
//         // Your code goes here
//         int c=0;
//         while(head!=null){
//             head=head.next;
//             c++;
//         }
//         return c;
//     }
//     public ListNode reverseList(ListNode head) {
//         if(head==null || head.next==null) return head;
//         ListNode prev=null;
//         ListNode temp=head;
//         while(temp!=null){
//             ListNode carry=temp.next;
//             temp.next=prev;
//             prev=temp;
//             temp=carry;
//         }
//         return prev;
//     }
//     public ListNode rotateRight(ListNode head, int k) {
//         if(head==null || head.next==null) return head;
//         int n=getLength(head);
//         k=k%n;
//         ListNode slow=head;
//         for(int i=1;i<n-k;i++){
//             slow=slow.next;
//         }
//         ListNode fast=slow.next;
//         slow.next=null;
//         ListNode l1=reverseList(head);
//         ListNode l2=reverseList(fast);
        
//         ListNode temp=l1;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=l2;
//         return reverseList(l1);
//     }
// }
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
    public int getLength(ListNode head) {
        // Your code goes here
        int c=0;
        while(head!=null){
            head=head.next;
            c++;
        }
        return c;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int n=getLength(head);
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        k=k%n;
        temp.next=head;

        temp=head;
        for(int i=1;i<n-k;i++){
            temp=temp.next;
        }
        ListNode newHead=temp.next;
        temp.next=null;
        return newHead;
    }
}