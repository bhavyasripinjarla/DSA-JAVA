// /*Definition of doubly linked list:
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode prev;

//     ListNode() {
//         val = 0;
//         next = null;
//         prev = null;
//     }

//     ListNode(int data1) {
//         val = data1;
//         next = null;
//         prev = null;
//     }

//     ListNode(int data1, ListNode next1, ListNode prev1) {
//         val = data1;
//         next = next1;
//         prev = prev1;
//     }
// }
//  */

// class Solution {
//     public ListNode removeDuplicates(ListNode head) {
//         if(head==null) return head;
//         if(head.next==null) return head;
//         ListNode prevnode=head;
//         ListNode temp=head.next;
//         while(temp!=null){
//             if(prevnode.val==temp.val){
//                 prevnode.next=temp.next;
//                 if(temp.next!=null)
//                     temp.next.prev=prevnode;

//                 temp=prevnode.next;
//             }
//             else{
//                 prevnode=prevnode.next;
//                 temp=temp.next;
//             }
//         }
//         return head;
//     }
// }


/*Definition of doubly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
 */

class Solution {
    public ListNode removeDuplicates(ListNode head) {
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            ListNode node=temp.next;
            while(node!=null && node.val==temp.val){
                node=node.next;
            }
            temp.next=node;
            if(node!=null){
                node.prev=temp;
            }
            temp=temp.next;
        }
        return head;
    }
}