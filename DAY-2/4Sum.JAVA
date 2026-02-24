import java.util.*;

/*
 Problem: 4Sum

 Description:
 Given an integer array nums and an integer target, return all unique quadruplets
 [nums[i], nums[j], nums[k], nums[l]] such that:
 i != j, j != k, k != l, i != l and
 nums[i] + nums[j] + nums[k] + nums[l] == target.
 The solution set must not contain duplicate quadruplets.

 Approach:
 - Sort the array to handle duplicates and enable two-pointer technique
 - Use two nested loops to fix the first two elements
 - Apply two pointers to find the remaining two elements
 - Skip duplicate values at all levels to avoid repeating quadruplets
 - Use long for sum calculation to prevent integer overflow

 Time Complexity: O(n^3)
 Space Complexity: O(1) (excluding output list)
*/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j!=i+1&&nums[j]==nums[j-1]) continue;
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum>target){
                        l--;
                    }
                    else if(sum<target){
                        k++;
                    }
                    else if(sum==target){
                        List<Integer> s=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        Collections.sort(s);
                        ans.add(s);
                        k++;l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }
                }
            }
        }
        return ans;
    }
}