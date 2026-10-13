/*Definition of doubly linked list:*/

class ListNode {
    int val;
    ListNode next;
    @SuppressWarnings("unused")
    ListNode prev;
    
}


@SuppressWarnings("unused")
class Solution {
    public ListNode deleteAllOccurrences(ListNode head, int target) {
        if(head==null) return head;
        while(head!=null && head.val==target){
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
        }
        ListNode temp=head;
        while(temp!=null &&temp.next!=null){
            if(temp.next.val==target){
                temp.next=temp.next.next;
                if(temp.next!=null)
                    temp.next.prev=temp;
            }else{
                temp=temp.next;
            }
            
        }
        return head;

    }
}
