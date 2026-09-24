import java.util.*;
class Solution {
    public void generator(int[] nums,int n,List<List<Integer>> ans, List<Integer> l1,int i){
        if(i>=n){
            ans.add(new ArrayList<>(l1));
            return;
        }
        l1.add(nums[i]);
        generator(nums,n,ans,l1,i+1);
        l1.remove(l1.size() - 1); 
        generator(nums,n,ans,l1,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer> l1=new ArrayList<Integer>();
        int n=nums.length;
        generator(nums,n,ans,l1,0);
        return ans;
    }
}