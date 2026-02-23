// Day 01
// Problem: Best Time to Buy and Sell Stock
// Topic: Arrays
// Difficulty: Easy
// Approach: Track minimum price and maximum profit
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int min=prices[0];
        for(int i=1;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            max=Math.max(max,prices[i]-min);
        }
        
        return max;
    }
}