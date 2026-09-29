import java.util.*;
class Solution {
    public int sumHighestAndLowestFrequency(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            max=Math.max(max,entry.getValue());
            min=Math.min(min,entry.getValue());
        }
        return max+min;
    }
}
