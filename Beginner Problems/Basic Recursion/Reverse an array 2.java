class Solution {
    public void helper(int[] nums,int l,int r){
        if(l>r) return;

        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;

        helper(nums,l+1,r-1);
        
    }
    public int[] reverseArray(int[] nums) {
        //your code goes here
        int l=0,r=nums.length-1;
        helper(nums,l,r);
        return nums;
    }
}