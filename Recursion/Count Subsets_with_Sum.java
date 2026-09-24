import java.util.*;
class Solution {
    static int generator(int[] nums,int n,int sum,int i,int k){
        if(sum>k) return 0;
            if(i==n){
                if(sum==k){
                    return 1;
                }else{
                    return 0;
            }
        }
        int l=generator(nums,n,sum+nums[i],i+1,k);
                
        int r=generator(nums,n,sum,i+1,k);
            
        return l+r;
    }
    static int perfectSum(int[] arr, int target) {
        // code here
        return generator(arr,arr.length,0,0,target);
    }
}