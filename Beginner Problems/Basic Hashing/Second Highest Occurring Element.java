import java.util.*;
class Solution {
    public int secondMostFrequentElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        int maxFreq = 0, secondMaxFreq = 0;
        int maxEle = -1, secondMaxEle = -1;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int ele = entry.getKey();
            int freq = entry.getValue();
            
            if (freq > maxFreq) {
                secondMaxFreq = maxFreq;
                secondMaxEle = maxEle;
                maxFreq = freq;
                maxEle = ele;
            } else if (freq == maxFreq) {
                maxEle = Math.min(maxEle, ele);
            } else if (freq > secondMaxFreq) {
                secondMaxFreq = freq;
                secondMaxEle = ele;
            } else if (freq == secondMaxFreq) {
                secondMaxEle = Math.min(secondMaxEle, ele);
            }
        }
        
        return secondMaxEle;
    }
}