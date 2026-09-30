// import java.util.*;
// class Solution {
//     public boolean isSorted(ArrayList<Integer> nums) {
//         //your code goes here
//         for(int i=1;i<nums.size();i++){
//             if(nums.get(i)<nums.get(i-1)) return false;
//         }
//         return true;
//     }
// }
class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]) count++;
        }
        return (count<=1)?true:false;
    }
}