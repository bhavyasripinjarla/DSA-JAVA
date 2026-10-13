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

    ListNode(int data1) {
        val = data1;
        next = null;
    }


}
@SuppressWarnings("unused")
class Solution {
    public ListNode merge(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode head=new ListNode(0);
        ListNode temp=head;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.next=list1;
                temp=temp.next;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }
        }

        while(list1!=null){
            temp.next=list1;
            list1=list1.next;
            temp=temp.next;
        }

        while(list2!=null){
            temp.next=list2;
            list2=list2.next;
            temp=temp.next;
        }

        return head.next;
    }    
    public ListNode sortList(ListNode head) {
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=slow.next;
        slow.next=null;
        ListNode a= sortList(head);
        ListNode b=sortList(fast);
        return merge(a,b);
    }
}