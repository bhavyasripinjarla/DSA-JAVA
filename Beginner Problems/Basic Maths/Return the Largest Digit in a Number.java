class Solution {
    public int largestDigit(int n) {
        int max=0;
        while(n>0){
            int temp=n%10;
            max=Math.max(max,temp);
            n=n/10;
        }
        return max;
    }
}