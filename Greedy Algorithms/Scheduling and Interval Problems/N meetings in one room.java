import  java.util.*;
class Solution {
    public int maxMeetings(int[] start, int[] end) {
       //your code goes 
       int n=start.length;
       Integer[] idx=new Integer[n];
       for(int i=0;i<n;i++){
        idx[i]=i;
       }
       Arrays.sort(idx,(a,b)->Integer.compare(end[a],end[b]));
       int count=1;
       int e=end[idx[0]];
       for(int i:idx){
        if(start[i]>e){
            e=end[i];
            count++;
        }
       }
       return count;
    }
}