import java.util.*;
class Solution {
    public List<Integer> majorityElementTwo(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int el1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        int c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(c1>0 && el1==nums[i]){
                c1++;
            }else if(c2>0 && ele2==nums[i]){
                c2++;
            }else if(c1==0){
                el1=nums[i];
                c1=1;
            }
            else if(c2==0){
                ele2=nums[i];
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }

        c1=0;c2=0;

        for(int i=0;i<n;i++){
            if(el1==nums[i]) c1++;
            if(ele2==nums[i]) c2++;
        }

        if(c1>n/3) ans.add(el1);
        if(c2>n/3) ans.add(ele2);
        return ans;
    }
}