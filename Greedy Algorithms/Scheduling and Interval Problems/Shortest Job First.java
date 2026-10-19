import  java.util.*;
class Solution {
    public long solve(int[] bt) {
        //your code goes here
        int n=bt.length;
        Arrays.sort(bt);
        long t=0;
        long w=0;
        for(int i=1;i<n;i++){
            w=w+bt[i-1];
            t+=w;
        }
        return t/n;
    }
}