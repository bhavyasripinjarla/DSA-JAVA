import java.util.*;
class Solution {
    public void generator(int[] nums,int n,List<List<Integer>> ans,List<Integer> l1,int i){
        ans.add(new ArrayList<>(l1));
        for(int k=i;k<nums.length;k++){
            if(k>i && nums[k]==nums[k-1]) continue;
            l1.add(nums[k]);
            generator(nums,n,ans,l1,k+1);
            l1.remove(l1.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        List<Integer> l1=new ArrayList<Integer>();
        generator(nums,nums.length,ans,l1,0);
        return ans;
    }
}