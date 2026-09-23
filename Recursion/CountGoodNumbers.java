import java.util.*;
class solution{
    public int countGoodNumbers(long n) {
        if(n==1) return 5;
        if(n==2) return 20;
        long mod=1000000007;
        long even=power(4,n/2,mod);
        long odd=power(5,(n+1)/2,mod);
        return (int)((even*odd)%mod);
    }
    public long power(long b,long n,long mod){
        if(n==0) return 1;
        if(n==1) return b%mod;
        long ans=1;
        while(n>0){
            if(n%2==0){
                b=(b*b)%mod;
                n=n/2;
            }else{
                ans=(ans*b)%mod;
                n=n-1;
            }
        }
        return ans;
    }
}