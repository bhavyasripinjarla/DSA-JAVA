// //Approach 1 
// /*
// Definition of singly linked list:
// class ListNode{
//     public int data;
//     public ListNode next;
//     ListNode() { data = 0; next = null; }
//     ListNode(int x) { data = x; next = null; }
//     ListNode(int x, ListNode next) { data = x; this.next = next; }
// }
// */

// class Solution {
//     public ListNode sortList(ListNode head) {
//         //YOUR CODE GOES HERE
//         if(head==null || head.next==null) return head;
//         ListNode temp=head;
//         int c1=0,c2=0,c3=0;
//         while(temp!=null){
//             switch (temp.data) {
//                 case 0 -> c1++;
//                 case 1 -> c2++;
//                 default -> c3++;
//             }
//             temp=temp.next;
//         }
//         temp=head;
//         while(temp!=null){
//             if(c1!=0) {temp.data=0;c1--;}
//             else if(c2!=0) {temp.data=1;c2--;}
//             else {temp.data=2;c3--;}
//             temp=temp.next;
//         }
//         return head;
//     }
// }

//Approach 2
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

class Solution {
    public ListNode sortList(ListNode head) {
        //YOUR CODE GOES HERE
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode c1= new ListNode(0);
        ListNode zero=c1;
        ListNode c2=new ListNode(1);
        ListNode one=c2;
        ListNode c3=new ListNode(2);
        ListNode two=c3;
        while(temp!=null){
            switch (temp.data) {
                case 0 -> {
                    c1.next=temp;
                    c1=c1.next;
                }
                case 1 -> {
                    c2.next=temp;
                    c2=c2.next;
                }
                default -> {
                    c3.next=temp;
                    c3=c3.next;
                }
            }
            temp=temp.next;
        }
        c1.next=(one.next!=null)?one.next:two.next;
        if(one.next!=null) 
            c2.next=two.next;
        c3.next=null;
        return zero.next;
    }
}