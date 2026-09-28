class Solution{
    public int secondLargestElement(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                second=max;
                max=nums[i];
            }
            if(nums[i]>second && max!=nums[i]){
                second=nums[i];
            }
        }
        return second==Integer.MIN_VALUE?-1:second;
    }
}