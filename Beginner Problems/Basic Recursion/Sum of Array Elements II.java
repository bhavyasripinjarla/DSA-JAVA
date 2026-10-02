class Solution {
    public int helper(int[] nums,int i,int n){
        if(i>=n) return 0;
        return nums[i]+helper(nums,i+1,n);
    }
    public int arraySum(int[] nums) {
        //your code goes here
        int n=nums.length;
        int i=0;
        return helper(nums,i,n);
    }
}