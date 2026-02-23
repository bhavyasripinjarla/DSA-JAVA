/*
 Problem: Merge Sorted Array

 Description:
 Given two sorted arrays nums1 and nums2, where nums1 has enough space
 to hold elements from nums2, this method merges nums2 into nums1
 and returns the merged sorted array.

 Approach:
 - Copy all elements of nums2 into the remaining positions of nums1
 - Sort the combined array using built-in sort

 Time Complexity: O((m + n) log(m + n))
 Space Complexity: O(1)
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for (int i = 0; i< n; i++){
       nums1[i+m] = nums2[i]; 
       } 
       Arrays.sort(nums1);
    }a
   
}