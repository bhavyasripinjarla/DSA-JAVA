import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    
    
}


class Solution {
    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
        // Your code goes here
        List<List<Integer>> ans=new ArrayList<>();
        if(head==null) return ans;
        ListNode start=head;
        ListNode end=head;
        while(end.next!=null){
            end=end.next;
        }
        while(start != null && end != null && start != end && start.val<end.val){
            int n=start.val,m=end.val;
            if(n+m==target){
                List<Integer> l=new ArrayList<>();
                l.add(n);l.add(m);
                ans.add(l);
                start=start.next;
                end=end.prev;
            }
            else if(n+m<target){
                start=start.next;
            }
            else{
                end=end.prev;
            }
        }
        return ans;
    }
}