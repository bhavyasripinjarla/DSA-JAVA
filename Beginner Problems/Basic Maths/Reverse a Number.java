class Solution {
    public int reverseNumber(int n) {
        if(n==0) return 0;
        int res=0;
        while(n>0){
            int temp=n%10;
            res=res*10+temp;
            n=n/10;
        }
        return res;
    }
}