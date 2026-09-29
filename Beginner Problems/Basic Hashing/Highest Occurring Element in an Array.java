import java.util.*;
class Solution {
    public int mostFrequentElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int k=0,max=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int value=entry.getValue();
            int ele=entry.getKey();
            if(value>k){
                k=value;
                max=ele;
            }
            if(value==k){
                max=Math.min(max,ele);
            }
        }
        return max;
    }
}


