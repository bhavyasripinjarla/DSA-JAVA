class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int c=0;
        int num=0;
        for(int i=0;i<n;i++){
            if(c==0){
                num=nums[i];
            }
            if(nums[i]==num){
                c++;
            }else{
                c--;
            }
        }
        return num;
    }
}