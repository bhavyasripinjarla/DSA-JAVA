@SuppressWarnings("unused")
class ListNode {
    public int val;
    ListNode next;
    
}
@SuppressWarnings("unused")
class Solution {
    public ListNode find(ListNode temp,int k){
        if(temp==null) return null;
        int c=1;
        while(c!=k && temp.next!=null){
            temp=temp.next;
            c++;
        }
        if(c<k){
            return null;
        }
        return temp;

    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode carry=temp.next;
            temp.next=prev;
            prev=temp;
            temp=carry;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;
        ListNode temp=head;
        ListNode newNode;
        ListNode prev=null;
        while(temp!=null){
            ListNode kthnode=find(temp,k);
            if(kthnode==null){
                if (prev != null) {
                    prev.next=temp;
                }
                break;
            }
            newNode=kthnode.next;
            kthnode.next=null;
            ListNode newhead =reverseList(temp);
            if (prev == null) {
                head=newhead;
            }else{
                prev.next=newhead;
            }
            prev=temp;
            temp=newNode;
        }
        return head;
    }
}