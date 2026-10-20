import java.util.*;
class Solution {
    public int findPlatform(int[] Arrival, int[] Departure) {
        //your code goes here
        int n=Arrival.length;
        Arrays.sort(Arrival);
        Arrays.sort(Departure);
        int c=0,max=0;
        int i=0,j=0;
        while(i<n && j<n){
            if(Arrival[i]<=Departure[j]){
                c++;
                i++;
            }else{
                c--;
                j++;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}