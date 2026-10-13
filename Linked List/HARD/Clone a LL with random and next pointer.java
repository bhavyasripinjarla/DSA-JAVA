
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        Node temp=head;
        while(temp!=null){
            Node newnode=new Node(temp.val);
            newnode.next=temp.next;
            temp.next=newnode;
            temp=temp.next.next;
        }

        temp=head;
        while(temp!=null){
            temp.next.random=temp.random==null ?null : temp.random.next;
            temp=temp.next.next;
        }

        Node dummy=new Node(0);
        Node t1=dummy;
        temp=head;
        while(temp!=null){
            t1.next=temp.next;
            temp.next=temp.next.next;
            t1=t1.next;
            temp=temp.next;
        }
        return dummy.next;
    }
}