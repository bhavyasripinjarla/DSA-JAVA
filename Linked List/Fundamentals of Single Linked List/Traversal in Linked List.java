import java.util.*;
class ListNode{
    public int data;
    public ListNode next;
    // ListNode() { data = 0; next = null; }
    // ListNode(int x) { data = x; next = null; }
    // ListNode(int x, ListNode next) { data = x; this.next = next; }
}
class Solution{
    public List<Integer> LLTraversal(ListNode head) {
        //your code goes here
        List<Integer> ans=new ArrayList<>();
        if(head==null) return ans;
        while(head!=null){
            ans.add(head.data);
            head=head.next;
        }
        return ans;
    }
}