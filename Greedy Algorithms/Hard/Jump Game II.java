class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int jumps=0,farthest=0,c=0;
        for(int i=0;i<n-1;i++){
            farthest=Math.max(farthest,nums[i]+i);
            if(i==c){
                jumps++;
                c=farthest;
                if(c>=n-1) break;
            }
        }
        return jumps;
    }
}