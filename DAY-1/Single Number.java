/*
 Problem: Single Number

 Description:
 Given a non-empty array of integers where every element appears twice
 except for one element, this method finds the element that appears only once.

 Approach:
 - Use the XOR (^) operator:
     • a ^ a = 0
     • a ^ 0 = a
 - XOR all elements in the array
 - Duplicate numbers cancel each other out, leaving the unique number

 Time Complexity: O(n)
 Space Complexity: O(1)
*/
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
