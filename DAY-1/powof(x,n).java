/*
 Problem: Pow(x, n)
 Description:
 This function computes x raised to the power n using Binary Exponentiation.
 The algorithm reduces the number of multiplications by repeatedly squaring
 the base and halving the exponent, making it efficient for large values of n.
 Approach:
 - Handle base cases such as:
     • n = 0
     • x = 0, 1, and -1
 - Convert the exponent to long to safely handle negative values
 - If n is negative, take the reciprocal of x
 - While the exponent is greater than 0:
     • If the exponent is odd, multiply the result by x
     • Square the base and divide the exponent by 2
 Time Complexity: O(log n)
 Space Complexity: O(1)
*/
class Solution {
    public double myPow(double x, int n) {
        if(n==0||x==1) return 1.0;
        if(x==0) return 0.0;
        if(x==-1&&n%2==0) return 1.0;
        if(x==-1&&n%2!=0) return -1.0;
        long binform=n;
        double ans=1;
        if(n<0){
            x=1/x;
            binform=-binform;
        }
        while(binform>0){
            if(binform%2==1){
                ans=ans*x;
            }
            x*=x;
            binform/=2;
        }
        return ans;
    }
}