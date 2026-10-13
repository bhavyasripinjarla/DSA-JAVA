class ListNode {
    int val;
    ListNode next;
    ListNode child;

    
    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

}
@SuppressWarnings("unused")
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode head=new ListNode(0);
        ListNode temp=head;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.child=list1;
                temp=temp.child;
                list1=list1.child;
            }
            else{
                temp.child=list2;
                list2=list2.child;
                temp=temp.child;
            }
        }

        if(list1!=null){
            temp.child=list1;
        }

        if(list2!=null){
            temp.child=list2;
        }

        return head.child;
    }
    public ListNode flattenLinkedList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head.next;
        head.next=null;
        ListNode newhead=flattenLinkedList(temp);
        return mergeTwoLists(head,newhead);
    }
}