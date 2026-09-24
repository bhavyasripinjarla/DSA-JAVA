import java.util.*;
class Solution {
    public boolean generator(int[] nums,int n,int sum,int i,int k){
            if(sum==k){
                return true;
            }
            if(i>=n || sum>k){
                return false;
                
            }
            if(generator(nums,n,sum+nums[i],i+1,k)==true){
                return true;
            }
            if(generator(nums,n,sum,i+1,k)==true)
            {
                return true;
            }
            return false;
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        int n=arr.length;
        return generator(arr,n,0,0,k);
    }
}