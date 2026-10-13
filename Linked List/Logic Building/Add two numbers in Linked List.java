/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/
class ListNode{
    public int data;
    public ListNode next;
    ListNode(int x) { data = x; next = null; }
}
@SuppressWarnings("unused")
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //YOUR CODE GOES HERE
        ListNode temp=new ListNode(0);
        ListNode ans=temp;
        int carry=0;
        while(l1!=null && l2!=null){
            int n=l1.data+l2.data+carry;
            ListNode m=new ListNode(n%10);
            ans.next=m;
            ans=ans.next;
            carry=n/10;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int n=l1.data+carry;
            ListNode m=new ListNode(n%10);
            ans.next=m;
            ans=ans.next;
            carry=n/10;
            l1=l1.next;
        }
        while(l2!=null){
            int n=l2.data+carry;
            ListNode m=new ListNode(n%10);
            ans.next=m;
            ans=ans.next;
            carry=n/10;
            l2=l2.next;
        }
        if(carry!=0){
            ListNode m=new ListNode(carry);
            ans.next=m;
        }
        return temp.next;
    }
}