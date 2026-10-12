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
}