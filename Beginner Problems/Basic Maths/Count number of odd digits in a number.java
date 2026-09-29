class Solution {
    public int countOddDigit(int n) {
        if(n==0) return 0;
        int count=0;
        while(n>0){
            int temp=n%10;
            n=n/10;
            if(temp%2!=0) count++;
        }
        return count;
    }
}