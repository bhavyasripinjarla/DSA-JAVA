import java.util.*;

/*
 Problem: Maximum Subarray

 Description:
 Given an integer array nums, find the contiguous subarray (containing at least one number)
 which has the largest sum and return its sum.

 Approach:
 - Use Kadane’s Algorithm
 - Maintain a running sum of elements
 - Update the maximum sum whenever the current sum is greater
 - Reset the running sum to 0 if it becomes negative
 - This ensures we always consider the best possible subarray ending at each index

 Time Complexity: O(n)
 Space Complexity: O(1)
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}