/* Defination of ListNoode
class ListNode {
    int val;
    ListNode next;

    ListNode(int value) {
        this.val = value;
        this.next = null;
    }
}
*/

class ListNode {
    int val;
    ListNode next;

    ListNode(int value) {
        this.val = value;
        this.next = null;
    }
}
class Solution {
    public boolean searchKey(ListNode head, int key) {
        // Your code goes here
        if(head==null) return false;
        while(head!=null){
            if(head.val==key){
                return true;
            }
            head=head.next;
        }
        return false;
    }
}