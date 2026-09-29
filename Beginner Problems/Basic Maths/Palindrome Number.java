class Solution {
    public boolean isPalindrome(int n) {
        if(n>=0 && n<=9) return true;
        int m=n;
        int res=0;
        while(n>0){
            int temp=n%10;
            res=res*10+temp;
            n=n/10;
        }
        if(res==m) return true;
        return false;
    }
}