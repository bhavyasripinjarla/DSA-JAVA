class Solution {
    public int countDigit(int n) {
        if(n>=0 && n<=9) return 1;
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}