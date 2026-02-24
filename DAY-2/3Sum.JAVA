import java.util.*;

/*
 Problem: 3Sum

 Description:
 Given an integer array nums, return all unique triplets [nums[i], nums[j], nums[k]]
 such that i != j, j != k, k != i, and nums[i] + nums[j] + nums[k] == 0.
 The solution set must not contain duplicate triplets.

 Approach:
 - Sort the array to enable the two-pointer technique
 - Fix one element and use two pointers to find the remaining two
 - Skip duplicate values to avoid repeated triplets
 - Adjust pointers based on whether the sum is less than, greater than, or equal to zero

 Time Complexity: O(n^2)
 Space Complexity: O(1) (excluding output list)
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1;
            int r=n-1;
            while(l<r){
                List<Integer> l2=new ArrayList<>();
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    l2.add(nums[i]);
                    l2.add(nums[l]);
                    l2.add(nums[r]);
                    l1.add(l2);
                    l++;r--;
                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;
                }else if(sum<0){
                    l++;

                }else{
                    r--;
                }
            }

        }
        return l1;
    }
}