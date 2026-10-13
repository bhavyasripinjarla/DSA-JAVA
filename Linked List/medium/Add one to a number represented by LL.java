/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
class Solution {
        public Node reverse(Node head) {
            if(head==null || head.next==null) return head;
            Node prev=null;
            Node temp=head;
            while(temp!=null){
                Node carry=temp.next;
                temp.next=prev;
                prev=temp;
                temp=carry;
            }
            return prev;
        }
        public Node addOne(Node head) {
            if(head==null) return head;
            int c=1;
            head=reverse(head);
            Node prev=head;
            Node temp=head;
            while(temp!=null){
                int t=temp.data+c;
                c=t/10;
                temp.data=t%10;
                prev=temp;
                temp=temp.next;
            }
            if(c>0){
                prev.next=new Node(c);
                prev.next.next=null;
            }
            head=reverse(head);
            return head;
        }
}