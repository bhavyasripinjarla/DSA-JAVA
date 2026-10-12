class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int[] ans=new int[2];
        long n=nums.length;
        long eq1=(n*(n+1))/2;
        long eq2=(n*(n+1)*(2*n+1))/6;
        long s1=0,s2=0;
        for(int i=0;i<n;i++){
            s1=s1+(long)nums[i];
            s2=s2+(long)nums[i]*nums[i];
        }
        long a=eq1-s1;
        long b=eq2-s2;
        long c=b/a;
        ans[1]=(int)((c+a)/2);
        ans[0]=(int)((c-a)/2);
        return ans;
    }
}