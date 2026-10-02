class Solution {
    public boolean helper(int num,int i){
        if(i*i>num) return true;
        if(num%i==0) return false;
        return helper(num,i+2);
    }
    public boolean checkPrime(int num) {
        //your code goes here
        if(num==0 || num==1) return false;
        if(num==2) return true;
        if(num%2==0) return false;
        return helper(num,3);
    }
}