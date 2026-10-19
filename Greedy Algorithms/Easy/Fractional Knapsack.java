import java.util.*;
class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n=val.length;
        Integer[] index=new Integer[n];
        for(int i=0;i<n;i++){
            index[i]=i;
        }
        double total=0;
        Arrays.sort(index,(a,b)->
                                Double.compare(
                                    (double)val[b]/wt[b],
                                    (double)val[a]/wt[a]
                                    )
                    );
        for(int i:index){
            if(wt[i]<=capacity){
                total+=val[i];
                capacity-=wt[i];
            }else{
                total+=(double)val[i]*capacity/wt[i];
                break;
            }
        }
        return total;
    }
}