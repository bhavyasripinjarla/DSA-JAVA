class Solution {
    public boolean isPowerOfTwo(int n) {
        // Your code goes here
        return n > 0 && (n & (n - 1)) == 0;
    }
}