class Solution {
    public int NnumbersSum(int N) {
        if(N==0) return 0;
        //your code goes here
        if(N==1) return 1;
        return N+NnumbersSum(N-1);
    }
}