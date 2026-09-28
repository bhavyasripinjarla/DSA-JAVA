class Solution {
    public int linearSearch(int nums[], int target) {
		//Your code goes here
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}