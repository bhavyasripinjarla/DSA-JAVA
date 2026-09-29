class Solution {
    public boolean isPrime(int n) {
          //your code goes here
        if(n==2) return true;
        if(n%2==0 || n==1) return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}