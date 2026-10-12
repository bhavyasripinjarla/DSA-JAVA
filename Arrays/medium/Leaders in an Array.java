import java.util.*;
class Solution {
    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int max=nums[n-1];
        ans.add(max);
        for(int i=n-2;i>=0;i--){
            if(nums[i]>=max){
                max=nums[i];
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}