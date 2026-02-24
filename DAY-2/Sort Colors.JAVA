import java.util.*;

/*
 Problem: Sort Colors (Dutch National Flag Problem)

 Description:
 Given an array nums with n objects colored red, white, or blue, sort them in-place
 so that objects of the same color are adjacent, with the colors in the order red (0),
 white (1), and blue (2).

 Approach:
 - Use a simple comparison-based sorting technique
 - Iterate through the array using two nested loops
 - Swap elements whenever a smaller value is found
 - This ensures the array is sorted in ascending order

 Time Complexity: O(n^2)
 Space Complexity: O(1)
*/
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++)
            {
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}